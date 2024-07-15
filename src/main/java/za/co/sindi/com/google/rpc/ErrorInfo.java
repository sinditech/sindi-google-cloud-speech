package za.co.sindi.com.google.rpc;

import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class ErrorInfo extends ErrorDetail {

	@JsonbProperty
	private ErrorReason reason;
	
	@JsonbProperty
	private String domain;
	
	@JsonbProperty
	private Map<String, String> metadata;

	/**
	 * @return the reason
	 */
	public ErrorReason getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(ErrorReason reason) {
		this.reason = reason;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
}
