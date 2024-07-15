package za.co.sindi.test.com.google.speech.v1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import za.co.sindi.com.google.speech.v1.AudioEncoding;
import za.co.sindi.com.google.speech.v1.RecognitionAudio;
import za.co.sindi.com.google.speech.v1.RecognitionConfig;
import za.co.sindi.com.google.speech.v1.RecognizeRequest;
import za.co.sindi.com.google.speech.v1.RecognizeResponse;
import za.co.sindi.com.google.speech.v1.SpeakerDiarizationConfig;
import za.co.sindi.com.google.speech.v1.SpeechClient;
import za.co.sindi.com.google.speech.v1.SpeechClientImpl;
import za.co.sindi.com.google.speech.v1.SpeechRecognitionAlternative;
import za.co.sindi.com.google.speech.v1.SpeechRecognitionResult;
import za.co.sindi.com.google.speech.v1.WordInfo;
import za.co.sindi.commons.utils.IOUtils;

/**
 * @author Buhake Sindi
 * @since 08 July 2024
 */
public class SpeechDiarizationTest {

	public static void main(String[] args) {
		try {
			testDiarization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testDiarization() throws IOException {
		InputStream inputStream = Files.newInputStream(Paths.get("C:\\Users\\buhake.sindi\\Downloads\\katiesteve.wav"));
		RecognitionAudio recognitionAudio = new RecognitionAudio();
		recognitionAudio.setContent(Base64.getEncoder().encodeToString(IOUtils.toByteArray(inputStream)));
		
		SpeakerDiarizationConfig speakerDiarizationConfig = new SpeakerDiarizationConfig();
		speakerDiarizationConfig.setEnableSpeakerDiarization(true);
		speakerDiarizationConfig.setMinSpeakerCount(2);
		speakerDiarizationConfig.setMaxSpeakerCount(2);
		            
		// Configure request to enable Speaker diarization
	    RecognitionConfig config = new RecognitionConfig();
		config.setEncoding(AudioEncoding.LINEAR16);
		config.setLanguageCode("en-US");
//		config.setSampleRateHertz(8000);
		config.setDiarizationConfig(speakerDiarizationConfig);
		
		RecognizeRequest request = new RecognizeRequest();
		request.setAudio(recognitionAudio);
		request.setConfig(config);
		
		SpeechClient speechClient = new SpeechClientImpl("ya29.a0AXooCgul10NP2R9JBYvOw5S88w2EggUxQmrB8U8pXbvBprl8BRBimZq3V8VeJQsnofvUmRY5godMg57wsqYH23MKjIP7iIrZGRlUstrBwuDczfaDGYedVRt0tt-BdjHDMC3_pCQ7d0IkYOc5Lgs1YXVCb00Dy9hOLdunaCgYKAX4SARESFQHGX2Mi0plEVsRkM-JmY7cwRs6xcQ0171"); //("AIzaSyBkPeaSt4UBQ3cge7kSNE9A214zeaOtS7w");
		RecognizeResponse recognizeResponse = speechClient.recognize(request);
		SpeechRecognitionResult[] results = recognizeResponse.getResults();
		
		// Speaker Tags are only included in the last result object, which has only one alternative.
	    SpeechRecognitionAlternative alternative = results[results.length - 1].getAlternatives()[0];

	    // The alternative is made up of WordInfo objects that contain the speaker_tag.
	    WordInfo wordInfo = alternative.getWords()[0];
	    int currentSpeakerTag = wordInfo.getSpeakerTag();
	    
	    // For each word, get all the words associated with one speaker, once the speaker changes,
	    // add a new line with the new speaker and their spoken words.
	    StringBuilder speakerWords = new StringBuilder(String.format("Speaker %d: %s", wordInfo.getSpeakerTag(), wordInfo.getWord()));

	    for (int i = 1; i < alternative.getWords().length; i++) {
	      wordInfo = alternative.getWords()[i];
	      if (currentSpeakerTag == wordInfo.getSpeakerTag()) {
	        speakerWords.append(" ");
	        speakerWords.append(wordInfo.getWord());
	      } else {
	        speakerWords.append(String.format("\nSpeaker %d: %s", wordInfo.getSpeakerTag(), wordInfo.getWord()));
	        currentSpeakerTag = wordInfo.getSpeakerTag();
	      }
	    }

	    System.out.println(speakerWords.toString());
	}
}
