/**
 * 
 */
package za.co.sindi.com.google.rpc;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 * @see <a href="https://cloud.google.com/apis/design/errors">Errors</a>
 */
public class ApiError implements Serializable {

	@JsonbProperty
	private Status error;

	/**
	 * @return the error
	 */
	public Status getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(Status error) {
		this.error = error;
	}
}
