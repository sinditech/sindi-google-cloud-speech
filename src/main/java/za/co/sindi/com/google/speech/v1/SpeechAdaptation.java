package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class SpeechAdaptation implements Serializable {

	@JsonbProperty
	private PhraseSet[] phraseSets;
	
	@JsonbProperty
	private String[] phraseSetReferences;
	
	@JsonbProperty
	private CustomClass[] customClasses;
	
	@JsonbProperty
	private ABNFGrammar abnfGrammar;

	/**
	 * @return the phraseSets
	 */
	public PhraseSet[] getPhraseSets() {
		return phraseSets;
	}

	/**
	 * @param phraseSets the phraseSets to set
	 */
	public void setPhraseSets(PhraseSet[] phraseSets) {
		this.phraseSets = phraseSets;
	}

	/**
	 * @return the phraseSetReferences
	 */
	public String[] getPhraseSetReferences() {
		return phraseSetReferences;
	}

	/**
	 * @param phraseSetReferences the phraseSetReferences to set
	 */
	public void setPhraseSetReferences(String[] phraseSetReferences) {
		this.phraseSetReferences = phraseSetReferences;
	}

	/**
	 * @return the customClasses
	 */
	public CustomClass[] getCustomClasses() {
		return customClasses;
	}

	/**
	 * @param customClasses the customClasses to set
	 */
	public void setCustomClasses(CustomClass[] customClasses) {
		this.customClasses = customClasses;
	}

	/**
	 * @return the abnfGrammar
	 */
	public ABNFGrammar getAbnfGrammar() {
		return abnfGrammar;
	}

	/**
	 * @param abnfGrammar the abnfGrammar to set
	 */
	public void setAbnfGrammar(ABNFGrammar abnfGrammar) {
		this.abnfGrammar = abnfGrammar;
	}
}
