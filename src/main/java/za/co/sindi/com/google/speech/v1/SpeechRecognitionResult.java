package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class SpeechRecognitionResult implements Serializable {

	@JsonbProperty
	private SpeechRecognitionAlternative[] alternatives;
	
	@JsonbProperty
	private int channelTag;
	
	@JsonbProperty
	private String resultEndTime;
	
	@JsonbProperty
	private String languageCode;

	/**
	 * @return the alternatives
	 */
	public SpeechRecognitionAlternative[] getAlternatives() {
		return alternatives;
	}

	/**
	 * @param alternatives the alternatives to set
	 */
	public void setAlternatives(SpeechRecognitionAlternative[] alternatives) {
		this.alternatives = alternatives;
	}

	/**
	 * @return the channelTag
	 */
	public int getChannelTag() {
		return channelTag;
	}

	/**
	 * @param channelTag the channelTag to set
	 */
	public void setChannelTag(int channelTag) {
		this.channelTag = channelTag;
	}

	/**
	 * @return the resultEndTime
	 */
	public String getResultEndTime() {
		return resultEndTime;
	}

	/**
	 * @param resultEndTime the resultEndTime to set
	 */
	public void setResultEndTime(String resultEndTime) {
		this.resultEndTime = resultEndTime;
	}

	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
