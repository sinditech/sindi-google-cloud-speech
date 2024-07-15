package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class SpeechRecognitionAlternative implements Serializable {

	@JsonbProperty
	private String transcript;
	
	@JsonbProperty
	private Double confidence;
	
	@JsonbProperty
	private WordInfo[] words;

	/**
	 * @return the transcript
	 */
	public String getTranscript() {
		return transcript;
	}

	/**
	 * @param transcript the transcript to set
	 */
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}

	/**
	 * @return the confidence
	 */
	public Double getConfidence() {
		return confidence;
	}

	/**
	 * @param confidence the confidence to set
	 */
	public void setConfidence(Double confidence) {
		this.confidence = confidence;
	}

	/**
	 * @return the words
	 */
	public WordInfo[] getWords() {
		return words;
	}

	/**
	 * @param words the words to set
	 */
	public void setWords(WordInfo[] words) {
		this.words = words;
	}
}
