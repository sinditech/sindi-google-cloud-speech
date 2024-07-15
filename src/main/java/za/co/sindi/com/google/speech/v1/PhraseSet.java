package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class PhraseSet implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Phrase[] phrases;
	
	@JsonbProperty
	private Integer boost;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phrases
	 */
	public Phrase[] getPhrases() {
		return phrases;
	}

	/**
	 * @param phrases the phrases to set
	 */
	public void setPhrases(Phrase[] phrases) {
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
