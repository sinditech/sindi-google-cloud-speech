package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 05 July 2024
 */
public class StreamingRecognizeRequest implements Serializable {

	@JsonbProperty
	private StreamingRecognitionConfig streamingConfig;
	
	@JsonbProperty
	private byte[] audioContent;

	/**
	 * @return the streamingConfig
	 */
	public StreamingRecognitionConfig getStreamingConfig() {
		return streamingConfig;
	}

	/**
	 * @param streamingConfig the streamingConfig to set
	 */
	public void setStreamingConfig(StreamingRecognitionConfig streamingConfig) {
		this.streamingConfig = streamingConfig;
	}

	/**
	 * @return the audioContent
	 */
	public byte[] getAudioContent() {
		return audioContent;
	}

	/**
	 * @param audioContent the audioContent to set
	 */
	public void setAudioContent(byte[] audioContent) {
		this.audioContent = audioContent;
	}
}
