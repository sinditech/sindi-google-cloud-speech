package za.co.sindi.com.google.speech.v1.operations;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 11 July 2024
 */
public class ListOperationsResponse implements Serializable {

	@JsonbProperty
	private Operation[] operations;
	
	@JsonbProperty
	private String nextPageToken;

	/**
	 * @return the operations
	 */
	public Operation[] getOperations() {
		return operations;
	}

	/**
	 * @param operations the operations to set
	 */
	public void setOperations(Operation[] operations) {
		this.operations = operations;
	}

	/**
	 * @return the nextPageToken
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * @param nextPageToken the nextPageToken to set
	 */
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
