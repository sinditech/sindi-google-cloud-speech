package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class Phrase implements Serializable {

	@JsonbProperty
	private String value;
	
	@JsonbProperty
	private Integer boost;

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
