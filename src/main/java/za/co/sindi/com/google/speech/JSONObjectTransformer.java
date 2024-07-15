/**
 * 
 */
package za.co.sindi.com.google.speech;

import java.io.InputStream;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public interface JSONObjectTransformer {

	public <T> String transform(final T object);
	public <T> T transform(final String data, Class<T> type);
	public <T> T transform(InputStream stream, Class<T> type);
}
