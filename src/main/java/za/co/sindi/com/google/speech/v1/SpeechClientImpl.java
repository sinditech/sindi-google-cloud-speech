package za.co.sindi.com.google.speech.v1;

import java.io.IOException;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import za.co.sindi.com.google.speech.BaseClient;
import za.co.sindi.commons.io.UncheckedException;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 08 July 2024
 */
public class SpeechClientImpl extends BaseClient implements SpeechClient {
	
	private final String SPEECH_LONG_RUNNING_RECOGNIZE_URI = "https://speech.googleapis.com/v1/speech:longrunningrecognize";
	private final String SPEECH_RECOGNIZE_URI = "https://speech.googleapis.com/v1/speech:recognize";

	/**
	 * @param accessToken
	 */
	public SpeechClientImpl(String accessToken) {
		super(accessToken);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.com.google.speech.v1.SpeechClient#longRunningRecognize(za.co.sindi.com.google.speech.v1.LongRunningRecognizeRequest)
	 */
	@Override
	public String longRunningRecognize(LongRunningRecognizeRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(SPEECH_LONG_RUNNING_RECOGNIZE_URI), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			JsonReader jsonReader = Json.createReader(new StringReader(validateAndHandleHttpResponse(httpResponse)));
			JsonObject jsonResponse = jsonReader.readObject();
			return jsonResponse.getString("name");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.com.google.speech.v1.SpeechClient#recognize(za.co.sindi.com.google.speech.v1.RecognizeRequest)
	 */
	@Override
	public RecognizeResponse recognize(RecognizeRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(SPEECH_RECOGNIZE_URI), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), RecognizeResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}
}
