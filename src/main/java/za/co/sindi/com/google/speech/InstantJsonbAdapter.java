/**
 * 
 */
package za.co.sindi.com.google.speech;

import java.time.Instant;

import jakarta.json.bind.adapter.JsonbAdapter;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class InstantJsonbAdapter implements JsonbAdapter<Instant, String> {

	@Override
	public String adaptToJson(Instant instant) throws Exception {
		// TODO Auto-generated method stub
		if (instant == null) return null;
		return instant.toString();
	}

	@Override
	public Instant adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return Instant.parse(value);
	}
}
