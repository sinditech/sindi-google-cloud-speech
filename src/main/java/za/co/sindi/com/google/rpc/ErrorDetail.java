/**
 * 
 */
package za.co.sindi.com.google.rpc;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
@JsonbTypeInfo(
	{
	    @JsonbSubtype(alias="type.googleapis.com/google.rpc.ErrorInfo", type=ErrorInfo.class),
	}
)
public abstract class ErrorDetail implements Serializable {

}
