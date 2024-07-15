package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 05 July 2024
 */
public class RecognitionConfig implements Serializable {

	@JsonbProperty
	private AudioEncoding encoding;
	
	@JsonbProperty
	private Integer sampleRateHertz;
	
	@JsonbProperty
	private Integer audioChannelCount;
	
	@JsonbProperty
	private Boolean enableSeparateRecognitionPerChannel;
	
	@JsonbProperty
	private String languageCode;
	
	@JsonbProperty
	private String[] alternativeLanguageCodes;
	
	@JsonbProperty
	private Integer maxAlternatives;
	
	@JsonbProperty
	private Boolean profanityFilter;
	
	@JsonbProperty
	private SpeechAdaptation adaptation;
	
	@JsonbProperty
	private SpeechContext[] speechContexts;
	
	@JsonbProperty
	private Boolean enableWordTimeOffsets;
	
	@JsonbProperty
	private Boolean enableWordConfidence;
	
	@JsonbProperty
	private Boolean enableAutomaticPunctuation;
	
	@JsonbProperty
	private Boolean enableSpokenPunctuation;
	
	@JsonbProperty
	private Boolean enableSpokenEmojis;
	
	@JsonbProperty
	private SpeakerDiarizationConfig diarizationConfig;
	
	@JsonbProperty
	private RecognitionMetadata metadata;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private Boolean useEnhanced;
	
	/**
	 * 
	 */
	public RecognitionConfig() {
		super();
		//TODO Auto-generated constructor stub
	}

	/**
	 * @param languageCode
	 */
	public RecognitionConfig(String languageCode) {
		super();
		this.languageCode = Objects.requireNonNull(languageCode, "Language code is required.");
	}

	/**
	 * @return the encoding
	 */
	public AudioEncoding getEncoding() {
		return encoding;
	}

	/**
	 * @param encoding the encoding to set
	 */
	public void setEncoding(AudioEncoding encoding) {
		this.encoding = encoding;
	}

	/**
	 * @return the sampleRateHertz
	 */
	public Integer getSampleRateHertz() {
		return sampleRateHertz;
	}

	/**
	 * @param sampleRateHertz the sampleRateHertz to set
	 */
	public void setSampleRateHertz(Integer sampleRateHertz) {
		this.sampleRateHertz = sampleRateHertz;
	}

	/**
	 * @return the audioChannelCount
	 */
	public Integer getAudioChannelCount() {
		return audioChannelCount;
	}

	/**
	 * @param audioChannelCount the audioChannelCount to set
	 */
	public void setAudioChannelCount(Integer audioChannelCount) {
		this.audioChannelCount = audioChannelCount;
	}

	/**
	 * @return the enableSeparateRecognitionPerChannel
	 */
	public Boolean getEnableSeparateRecognitionPerChannel() {
		return enableSeparateRecognitionPerChannel;
	}

	/**
	 * @param enableSeparateRecognitionPerChannel the enableSeparateRecognitionPerChannel to set
	 */
	public void setEnableSeparateRecognitionPerChannel(Boolean enableSeparateRecognitionPerChannel) {
		this.enableSeparateRecognitionPerChannel = enableSeparateRecognitionPerChannel;
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

	/**
	 * @return the alternativeLanguageCodes
	 */
	public String[] getAlternativeLanguageCodes() {
		return alternativeLanguageCodes;
	}

	/**
	 * @param alternativeLanguageCodes the alternativeLanguageCodes to set
	 */
	public void setAlternativeLanguageCodes(String[] alternativeLanguageCodes) {
		this.alternativeLanguageCodes = alternativeLanguageCodes;
	}

	/**
	 * @return the maxAlternatives
	 */
	public Integer getMaxAlternatives() {
		return maxAlternatives;
	}

	/**
	 * @param maxAlternatives the maxAlternatives to set
	 */
	public void setMaxAlternatives(Integer maxAlternatives) {
		this.maxAlternatives = maxAlternatives;
	}

	/**
	 * @return the profanityFilter
	 */
	public Boolean getProfanityFilter() {
		return profanityFilter;
	}

	/**
	 * @param profanityFilter the profanityFilter to set
	 */
	public void setProfanityFilter(Boolean profanityFilter) {
		this.profanityFilter = profanityFilter;
	}

	/**
	 * @return the adaptation
	 */
	public SpeechAdaptation getAdaptation() {
		return adaptation;
	}

	/**
	 * @param adaptation the adaptation to set
	 */
	public void setAdaptation(SpeechAdaptation adaptation) {
		this.adaptation = adaptation;
	}

	/**
	 * @return the speechContexts
	 */
	public SpeechContext[] getSpeechContexts() {
		return speechContexts;
	}

	/**
	 * @param speechContexts the speechContexts to set
	 */
	public void setSpeechContexts(SpeechContext[] speechContexts) {
		this.speechContexts = speechContexts;
	}

	/**
	 * @return the enableWordTimeOffsets
	 */
	public Boolean getEnableWordTimeOffsets() {
		return enableWordTimeOffsets;
	}

	/**
	 * @param enableWordTimeOffsets the enableWordTimeOffsets to set
	 */
	public void setEnableWordTimeOffsets(Boolean enableWordTimeOffsets) {
		this.enableWordTimeOffsets = enableWordTimeOffsets;
	}

	/**
	 * @return the enableWordConfidence
	 */
	public Boolean getEnableWordConfidence() {
		return enableWordConfidence;
	}

	/**
	 * @param enableWordConfidence the enableWordConfidence to set
	 */
	public void setEnableWordConfidence(Boolean enableWordConfidence) {
		this.enableWordConfidence = enableWordConfidence;
	}

	/**
	 * @return the enableAutomaticPunctuation
	 */
	public Boolean getEnableAutomaticPunctuation() {
		return enableAutomaticPunctuation;
	}

	/**
	 * @param enableAutomaticPunctuation the enableAutomaticPunctuation to set
	 */
	public void setEnableAutomaticPunctuation(Boolean enableAutomaticPunctuation) {
		this.enableAutomaticPunctuation = enableAutomaticPunctuation;
	}

	/**
	 * @return the enableSpokenPunctuation
	 */
	public Boolean getEnableSpokenPunctuation() {
		return enableSpokenPunctuation;
	}

	/**
	 * @param enableSpokenPunctuation the enableSpokenPunctuation to set
	 */
	public void setEnableSpokenPunctuation(Boolean enableSpokenPunctuation) {
		this.enableSpokenPunctuation = enableSpokenPunctuation;
	}

	/**
	 * @return the enableSpokenEmojis
	 */
	public Boolean getEnableSpokenEmojis() {
		return enableSpokenEmojis;
	}

	/**
	 * @param enableSpokenEmojis the enableSpokenEmojis to set
	 */
	public void setEnableSpokenEmojis(Boolean enableSpokenEmojis) {
		this.enableSpokenEmojis = enableSpokenEmojis;
	}

	/**
	 * @return the diarizationConfig
	 */
	public SpeakerDiarizationConfig getDiarizationConfig() {
		return diarizationConfig;
	}

	/**
	 * @param diarizationConfig the diarizationConfig to set
	 */
	public void setDiarizationConfig(SpeakerDiarizationConfig diarizationConfig) {
		this.diarizationConfig = diarizationConfig;
	}

	/**
	 * @return the metadata
	 */
	public RecognitionMetadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(RecognitionMetadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the useEnhanced
	 */
	public Boolean getUseEnhanced() {
		return useEnhanced;
	}

	/**
	 * @param useEnhanced the useEnhanced to set
	 */
	public void setUseEnhanced(Boolean useEnhanced) {
		this.useEnhanced = useEnhanced;
	}
}
