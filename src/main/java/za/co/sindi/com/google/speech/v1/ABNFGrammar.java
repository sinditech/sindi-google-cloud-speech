package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class ABNFGrammar implements Serializable {

	@JsonbProperty
	private String[] abnfStrings;

	/**
	 * @return the abnfStrings
	 */
	public String[] getAbnfStrings() {
		return abnfStrings;
	}

	/**
	 * @param abnfStrings the abnfStrings to set
	 */
	public void setAbnfStrings(String[] abnfStrings) {
		this.abnfStrings = abnfStrings;
	}
}
