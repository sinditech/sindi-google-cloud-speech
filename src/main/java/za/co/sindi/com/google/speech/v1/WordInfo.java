package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class WordInfo implements Serializable {

	@JsonbProperty
	private String startTime;
	
	@JsonbProperty
	private String endTime;
	
	@JsonbProperty
	private String word;
	
	@JsonbProperty
	private Double confidence;
	
	@JsonbProperty
	private Integer speakerTag;

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
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
	 * @return the speakerTag
	 */
	public Integer getSpeakerTag() {
		return speakerTag;
	}

	/**
	 * @param speakerTag the speakerTag to set
	 */
	public void setSpeakerTag(Integer speakerTag) {
		this.speakerTag = speakerTag;
	}
}
