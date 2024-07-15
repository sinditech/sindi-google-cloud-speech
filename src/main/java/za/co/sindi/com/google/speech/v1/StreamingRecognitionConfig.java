package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 11 July 2024
 */
public class StreamingRecognitionConfig implements Serializable {

	@JsonbProperty
	private RecognitionConfig config;
	
	@JsonbProperty
	private Boolean singleUtterance;
	
	@JsonbProperty
	private Boolean interimResults;
	
	@JsonbProperty
	private Boolean enableVoiceActivityEvents;
	
	@JsonbProperty
	private VoiceActivityTimeout voiceActivityTimeout;

	/**
	 * @return the config
	 */
	public RecognitionConfig getConfig() {
		return config;
	}

	/**
	 * @param config the config to set
	 */
	public void setConfig(RecognitionConfig config) {
		this.config = config;
	}

	/**
	 * @return the singleUtterance
	 */
	public Boolean getSingleUtterance() {
		return singleUtterance;
	}

	/**
	 * @param singleUtterance the singleUtterance to set
	 */
	public void setSingleUtterance(Boolean singleUtterance) {
		this.singleUtterance = singleUtterance;
	}

	/**
	 * @return the interimResults
	 */
	public Boolean getInterimResults() {
		return interimResults;
	}

	/**
	 * @param interimResults the interimResults to set
	 */
	public void setInterimResults(Boolean interimResults) {
		this.interimResults = interimResults;
	}

	/**
	 * @return the enableVoiceActivityEvents
	 */
	public Boolean getEnableVoiceActivityEvents() {
		return enableVoiceActivityEvents;
	}

	/**
	 * @param enableVoiceActivityEvents the enableVoiceActivityEvents to set
	 */
	public void setEnableVoiceActivityEvents(Boolean enableVoiceActivityEvents) {
		this.enableVoiceActivityEvents = enableVoiceActivityEvents;
	}

	/**
	 * @return the voiceActivityTimeout
	 */
	public VoiceActivityTimeout getVoiceActivityTimeout() {
		return voiceActivityTimeout;
	}

	/**
	 * @param voiceActivityTimeout the voiceActivityTimeout to set
	 */
	public void setVoiceActivityTimeout(VoiceActivityTimeout voiceActivityTimeout) {
		this.voiceActivityTimeout = voiceActivityTimeout;
	}
}
