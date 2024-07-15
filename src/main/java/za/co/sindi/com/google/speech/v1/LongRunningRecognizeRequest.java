package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 05 July 2024
 */
public class LongRunningRecognizeRequest implements Serializable {
	
	@JsonbProperty
	private RecognitionConfig config;
	
	@JsonbProperty
	private RecognitionAudio audio;

	@JsonbProperty("output_config")
	private TranscriptOutputConfig outputConfig;

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
	 * @return the audio
	 */
	public RecognitionAudio getAudio() {
		return audio;
	}

	/**
	 * @param audio the audio to set
	 */
	public void setAudio(RecognitionAudio audio) {
		this.audio = audio;
	}

	/**
	 * @return the outputConfig
	 */
	public TranscriptOutputConfig getOutputConfig() {
		return outputConfig;
	}

	/**
	 * @param outputConfig the outputConfig to set
	 */
	public void setOutputConfig(TranscriptOutputConfig outputConfig) {
		this.outputConfig = outputConfig;
	}
}
