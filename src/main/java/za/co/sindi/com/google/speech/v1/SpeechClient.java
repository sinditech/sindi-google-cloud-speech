package za.co.sindi.com.google.speech.v1;

import java.net.ProxySelector;
import java.time.Duration;
import java.util.concurrent.Executor;

import za.co.sindi.com.google.speech.JSONObjectTransformer;

/**
 * @author Buhake Sindi
 * @since 04 July 2024
 */
public interface SpeechClient {
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout);

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy);

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor);
	
	/**
	 * @param objectTransformer the objectTransformer to set
	 */
	public void setJSONObjectTransformer(JSONObjectTransformer objectTransformer);
	
	public String longRunningRecognize(final LongRunningRecognizeRequest request);

	public RecognizeResponse recognize(final RecognizeRequest request);
}
