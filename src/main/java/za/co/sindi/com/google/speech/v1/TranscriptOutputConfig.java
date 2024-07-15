package za.co.sindi.com.google.speech.v1;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 07 July 2024
 */
public class TranscriptOutputConfig implements Serializable {

	@JsonbProperty("gcsUri")
	private String googleCloudStorageUri;

	/**
	 * @return the googleCloudStorageUri
	 */
	public String getGoogleCloudStorageUri() {
		return googleCloudStorageUri;
	}

	/**
	 * @param googleCloudStorageUri the googleCloudStorageUri to set
	 */
	public void setGoogleCloudStorageUri(String googleCloudStorageUri) {
		this.googleCloudStorageUri = googleCloudStorageUri;
	}
}
