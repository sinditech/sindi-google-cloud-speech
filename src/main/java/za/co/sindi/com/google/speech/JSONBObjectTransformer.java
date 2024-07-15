/**
 * 
 */
package za.co.sindi.com.google.speech;

import java.io.InputStream;

import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class JSONBObjectTransformer implements JSONObjectTransformer {
	
	private JsonbConfig newJsonbConfig() {
		JsonbConfig config = new JsonbConfig();
		config.withAdapters(new InstantJsonbAdapter());
		return config;
	}

	@Override
	public <E> String transform(E object) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).toJson(object);
	}

	@Override
	public <T> T transform(String data, Class<T> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(data, type);
	}

	@Override
	public <T> T transform(InputStream stream, Class<T> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(stream, type);
	}
}
