package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class SpeakerDiarizationConfig implements Serializable {

	@JsonbProperty
	private Boolean enableSpeakerDiarization;
	
	@JsonbProperty
	private Integer minSpeakerCount;
	
	@JsonbProperty
	private Integer maxSpeakerCount;
	
	@Deprecated @JsonbProperty
	private Integer speakerTag;

	/**
	 * @return the enableSpeakerDiarization
	 */
	public Boolean getEnableSpeakerDiarization() {
		return enableSpeakerDiarization;
	}

	/**
	 * @param enableSpeakerDiarization the enableSpeakerDiarization to set
	 */
	public void setEnableSpeakerDiarization(Boolean enableSpeakerDiarization) {
		this.enableSpeakerDiarization = enableSpeakerDiarization;
	}

	/**
	 * @return the minSpeakerCount
	 */
	public Integer getMinSpeakerCount() {
		return minSpeakerCount;
	}

	/**
	 * @param minSpeakerCount the minSpeakerCount to set
	 */
	public void setMinSpeakerCount(Integer minSpeakerCount) {
		this.minSpeakerCount = minSpeakerCount;
	}

	/**
	 * @return the maxSpeakerCount
	 */
	public Integer getMaxSpeakerCount() {
		return maxSpeakerCount;
	}

	/**
	 * @param maxSpeakerCount the maxSpeakerCount to set
	 */
	public void setMaxSpeakerCount(Integer maxSpeakerCount) {
		this.maxSpeakerCount = maxSpeakerCount;
	}

	/**
	 * @return the speakerTag
	 */
	@Deprecated
	public Integer getSpeakerTag() {
		return speakerTag;
	}

	/**
	 * @param speakerTag the speakerTag to set
	 */
	@Deprecated
	public void setSpeakerTag(Integer speakerTag) {
		this.speakerTag = speakerTag;
	}
}
