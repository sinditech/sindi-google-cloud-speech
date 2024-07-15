/**
 * 
 */
package za.co.sindi.com.google.rpc;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;
import za.co.sindi.com.google.speech.v1.LongRunningRecognizeMetadata;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
@JsonbTypeInfo(
	{
	    @JsonbSubtype(alias="type.googleapis.com/google.cloud.speech.v1.LongRunningRecognizeMetadata", type=LongRunningRecognizeMetadata.class),
	}
)
public abstract class Metadata implements Serializable {

}
