package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
@Deprecated
public class RecognitionMetadata implements Serializable {

	@JsonbProperty
	private InteractionType interactionType;
	
	@JsonbProperty
	private Integer industryNaicsCodeOfAudio;
	
	@JsonbProperty
	private MicrophoneDistance microphoneDistance;
	
	@JsonbProperty
	private OriginalMediaType originalMediaType;
	
	@JsonbProperty
	private RecordingDeviceType recordingDeviceType;
	
	@JsonbProperty
	private String recordingDeviceName;
	
	@JsonbProperty
	private String originalMimeType;
	
	@JsonbProperty
	private String audioTopic;

	/**
	 * @return the interactionType
	 */
	public InteractionType getInteractionType() {
		return interactionType;
	}

	/**
	 * @param interactionType the interactionType to set
	 */
	public void setInteractionType(InteractionType interactionType) {
		this.interactionType = interactionType;
	}

	/**
	 * @return the industryNaicsCodeOfAudio
	 */
	public Integer getIndustryNaicsCodeOfAudio() {
		return industryNaicsCodeOfAudio;
	}

	/**
	 * @param industryNaicsCodeOfAudio the industryNaicsCodeOfAudio to set
	 */
	public void setIndustryNaicsCodeOfAudio(Integer industryNaicsCodeOfAudio) {
		this.industryNaicsCodeOfAudio = industryNaicsCodeOfAudio;
	}

	/**
	 * @return the microphoneDistance
	 */
	public MicrophoneDistance getMicrophoneDistance() {
		return microphoneDistance;
	}

	/**
	 * @param microphoneDistance the microphoneDistance to set
	 */
	public void setMicrophoneDistance(MicrophoneDistance microphoneDistance) {
		this.microphoneDistance = microphoneDistance;
	}

	/**
	 * @return the originalMediaType
	 */
	public OriginalMediaType getOriginalMediaType() {
		return originalMediaType;
	}

	/**
	 * @param originalMediaType the originalMediaType to set
	 */
	public void setOriginalMediaType(OriginalMediaType originalMediaType) {
		this.originalMediaType = originalMediaType;
	}

	/**
	 * @return the recordingDeviceType
	 */
	public RecordingDeviceType getRecordingDeviceType() {
		return recordingDeviceType;
	}

	/**
	 * @param recordingDeviceType the recordingDeviceType to set
	 */
	public void setRecordingDeviceType(RecordingDeviceType recordingDeviceType) {
		this.recordingDeviceType = recordingDeviceType;
	}

	/**
	 * @return the recordingDeviceName
	 */
	public String getRecordingDeviceName() {
		return recordingDeviceName;
	}

	/**
	 * @param recordingDeviceName the recordingDeviceName to set
	 */
	public void setRecordingDeviceName(String recordingDeviceName) {
		this.recordingDeviceName = recordingDeviceName;
	}

	/**
	 * @return the originalMimeType
	 */
	public String getOriginalMimeType() {
		return originalMimeType;
	}

	/**
	 * @param originalMimeType the originalMimeType to set
	 */
	public void setOriginalMimeType(String originalMimeType) {
		this.originalMimeType = originalMimeType;
	}

	/**
	 * @return the audioTopic
	 */
	public String getAudioTopic() {
		return audioTopic;
	}

	/**
	 * @param audioTopic the audioTopic to set
	 */
	public void setAudioTopic(String audioTopic) {
		this.audioTopic = audioTopic;
	}
}
