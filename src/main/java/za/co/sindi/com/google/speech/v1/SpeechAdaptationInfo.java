package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class SpeechAdaptationInfo implements Serializable {
	
	@JsonbProperty
	private boolean adaptationTimeout;
	
	@JsonbProperty
	private String timeoutMessage;

	/**
	 * @return the adaptationTimeout
	 */
	public boolean isAdaptationTimeout() {
		return adaptationTimeout;
	}

	/**
	 * @param adaptationTimeout the adaptationTimeout to set
	 */
	public void setAdaptationTimeout(boolean adaptationTimeout) {
		this.adaptationTimeout = adaptationTimeout;
	}

	/**
	 * @return the timeoutMessage
	 */
	public String getTimeoutMessage() {
		return timeoutMessage;
	}

	/**
	 * @param timeoutMessage the timeoutMessage to set
	 */
	public void setTimeoutMessage(String timeoutMessage) {
		this.timeoutMessage = timeoutMessage;
	}
}
