package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.com.google.rpc.Status;

/**
 * @author Buhake Sindi
 * @since 05 July 2024
 */
public class LongRunningRecognizeResponse implements Serializable {

	@JsonbProperty
	private SpeechRecognitionResult[] results;
	
	@JsonbProperty
	private String totalBilledTime;
	
	@JsonbProperty
	private TranscriptOutputConfig outputConfig;
	
	@JsonbProperty
	private Status outputError;
	
	@JsonbProperty
	private SpeechAdaptationInfo speechAdaptationInfo;
	
	@JsonbProperty
	private long requestId;

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
	 * @return the outputConfig
	 */
	public TranscriptOutputConfig getOutputConfig() {
		return outputConfig;
	}

	/**
	 * @param outputConfig the outputConfig to set
	 */
	public void setOutputConfig(TranscriptOutputConfig outputConfig) {
		this.outputConfig = outputConfig;
	}

	/**
	 * @return the outputError
	 */
	public Status getOutputError() {
		return outputError;
	}

	/**
	 * @param outputError the outputError to set
	 */
	public void setOutputError(Status outputError) {
		this.outputError = outputError;
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
	public long getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}
}
