package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 05 July 2024
 */
public class RecognizeResponse implements Serializable {
	
	@JsonbProperty
	private SpeechRecognitionResult[] results;
	
	@JsonbProperty
	private String totalBilledTime;
	
	@JsonbProperty
	private SpeechAdaptationInfo speechAdaptationInfo;
	
	@JsonbProperty
	private String requestId;

	/**
	 * @return the results
	 */
	public SpeechRecognitionResult[] getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(SpeechRecognitionResult[] results) {
		this.results = results;
	}

	/**
	 * @return the totalBilledTime
	 */
	public String getTotalBilledTime() {
		return totalBilledTime;
	}

	/**
	 * @param totalBilledTime the totalBilledTime to set
	 */
	public void setTotalBilledTime(String totalBilledTime) {
		this.totalBilledTime = totalBilledTime;
	}

	/**
	 * @return the speechAdaptationInfo
	 */
	public SpeechAdaptationInfo getSpeechAdaptationInfo() {
		return speechAdaptationInfo;
	}

	/**
	 * @param speechAdaptationInfo the speechAdaptationInfo to set
	 */
	public void setSpeechAdaptationInfo(SpeechAdaptationInfo speechAdaptationInfo) {
		this.speechAdaptationInfo = speechAdaptationInfo;
	}

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
