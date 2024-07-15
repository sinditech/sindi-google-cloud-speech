package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;
import java.time.Instant;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 10 July 2024
 */
public class LongRunningRecognizeMetadata implements Serializable {

	@JsonbProperty
	private Instant lastUpdateTime;
	
	@JsonbProperty
	private int progressPercent;
	
	@JsonbProperty
	private Instant startTime;
	
	@JsonbProperty
	private String uri;

	/**
	 * @return the lastUpdateTime
	 */
	public Instant getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * @param lastUpdateTime the lastUpdateTime to set
	 */
	public void setLastUpdateTime(Instant lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * @return the progressPercent
	 */
	public int getProgressPercent() {
		return progressPercent;
	}

	/**
	 * @param progressPercent the progressPercent to set
	 */
	public void setProgressPercent(int progressPercent) {
		this.progressPercent = progressPercent;
	}

	/**
	 * @return the startTime
	 */
	public Instant getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Instant startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}
}
