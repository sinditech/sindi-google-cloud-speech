package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class SpeechContext implements Serializable {

	@JsonbProperty
	private String[] phrases;
	
	@JsonbProperty
	private Integer boost;

	/**
	 * @return the phrases
	 */
	public String[] getPhrases() {
		return phrases;
	}

	/**
	 * @param phrases the phrases to set
	 */
	public void setPhrases(String[] phrases) {
		this.phrases = phrases;
	}

	/**
	 * @return the boost
	 */
	public Integer getBoost() {
		return boost;
	}

	/**
	 * @param boost the boost to set
	 */
	public void setBoost(Integer boost) {
		this.boost = boost;
	}
}
