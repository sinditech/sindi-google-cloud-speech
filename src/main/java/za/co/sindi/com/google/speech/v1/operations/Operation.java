package za.co.sindi.com.google.speech.v1.operations;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.com.google.rpc.Metadata;
import za.co.sindi.com.google.rpc.Response;
import za.co.sindi.com.google.rpc.Status;

/**
 * @author Buhake Sindi
 * @since 11 July 2024
 */
public class Operation implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Metadata metadata;
	
	@JsonbProperty
	private boolean done;
	
	@JsonbProperty
	private Status error;
	
	@JsonbProperty
	private Response response;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the metadata
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	/**
	 * @return the done
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * @param done the done to set
	 */
	public void setDone(boolean done) {
		this.done = done;
	}

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

	/**
	 * @return the response
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(Response response) {
		this.response = response;
	}
}
