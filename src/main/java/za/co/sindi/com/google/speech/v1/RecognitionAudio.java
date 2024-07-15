package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Contains audio data in the encoding specified in the {@link RecognitionConfig}. 
 * Either <code>content</code> or <code>uri</code> must be supplied. 
 * Supplying both or neither returns <code>google.rpc.Code.INVALID_ARGUMENT</code>.
 * 
 * @author Buhake Sindi
 * @since 05 July 2024
 */
public class RecognitionAudio implements Serializable {

	@JsonbProperty
	private String content;
	
	@JsonbProperty
	private String uri;

	/**
	 * @return a base64-encoded string.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
}
