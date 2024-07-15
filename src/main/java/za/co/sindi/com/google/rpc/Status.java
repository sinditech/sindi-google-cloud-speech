/**
 * 
 */
package za.co.sindi.com.google.rpc;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class Status {

	@JsonbProperty
	private int code;
	
	@JsonbProperty
	private String message;
	
	@JsonbProperty
	private Code status;
	
	@JsonbProperty
	private ErrorDetail[] details;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Code status) {
		this.status = status;
	}

	/**
	 * @return the details
	 */
	public ErrorDetail[] getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(ErrorDetail[] details) {
		this.details = details;
	}
}
