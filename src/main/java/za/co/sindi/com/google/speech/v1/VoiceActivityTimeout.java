package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 12 July 2024
 */
public class VoiceActivityTimeout implements Serializable {

	@JsonbProperty
	private String speechStartTimeout;
	
	@JsonbProperty
	private String speechEndTimeout;

	/**
	 * @return the speechStartTimeout
	 */
	public String getSpeechStartTimeout() {
		return speechStartTimeout;
	}

	/**
	 * @param speechStartTimeout the speechStartTimeout to set
	 */
	public void setSpeechStartTimeout(String speechStartTimeout) {
		this.speechStartTimeout = speechStartTimeout;
	}

	/**
	 * @return the speechEndTimeout
	 */
	public String getSpeechEndTimeout() {
		return speechEndTimeout;
	}

	/**
	 * @param speechEndTimeout the speechEndTimeout to set
	 */
	public void setSpeechEndTimeout(String speechEndTimeout) {
		this.speechEndTimeout = speechEndTimeout;
	}
}
