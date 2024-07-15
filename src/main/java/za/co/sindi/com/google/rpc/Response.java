/**
 * 
 */
package za.co.sindi.com.google.rpc;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;
import za.co.sindi.com.google.speech.v1.LongRunningRecognizeResponse;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
@JsonbTypeInfo(
	{
	    @JsonbSubtype(alias="type.googleapis.com/google.cloud.speech.v1.LongRunningRecognizeResponse", type=LongRunningRecognizeResponse.class),
	}
)
public abstract class Response implements Serializable {

}
