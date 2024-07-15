/**
 * 
 */
package za.co.sindi.com.google.speech;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import za.co.sindi.com.google.rpc.ApiError;
import za.co.sindi.com.google.rpc.ApiException;
import za.co.sindi.commons.net.http.WithErrorBodyHandler;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public abstract class BaseClient {
	
	protected JSONObjectTransformer objectTransformer;
	
	private Duration connectionTimeout;
	private ProxySelector proxy;
	private Executor executor;
	
	protected final String accessToken;
	
	/**
	 * @param accessToken
	 */
	protected BaseClient(String accessToken) {
		super();
		this.accessToken = Objects.requireNonNull(accessToken, "A Google Auth access token with print-access authorization is required.");
		this.objectTransformer = new JSONBObjectTransformer();
	}

	public void setConnectionTimeout(Duration connectionTimeout) {
		// TODO Auto-generated method stub
		this.connectionTimeout = connectionTimeout;
	}

	public void setProxy(ProxySelector proxy) {
		// TODO Auto-generated method stub
		this.proxy = proxy;
	}

	public void setExecutor(Executor executor) {
		// TODO Auto-generated method stub
		this.executor = executor;
	}
	
	public void setJSONObjectTransformer(JSONObjectTransformer objectTransformer) {
		// TODO Auto-generated method stub
		this.objectTransformer = objectTransformer;
	}
	
	protected HttpRequest.Builder createHttpDELETERequestBuilder(final URI uri) {
		return HttpRequest.newBuilder(uri)
						  .DELETE();
	}
	
	protected HttpRequest.Builder createHttpGETRequestBuilder(final URI uri) {
		return HttpRequest.newBuilder(uri)
						  .GET();
	}
	
	protected HttpRequest.Builder createHttpPOSTRequestBuilder(final URI uri, final BodyPublisher bodyPublisher) {
		return HttpRequest.newBuilder(uri)
						  .header("Authorization", "Bearer " + accessToken)
						  .header("Content-Type", "application/json; charset=utf-8")
						  .POST(bodyPublisher);
	}
	
	protected <R> HttpResponse<Either<R, String>> send(final HttpRequest.Builder httpRequestBuilder, final BodyHandler<R> bodyHandler) throws IOException, InterruptedException {
		HttpRequest httpRequest = httpRequestBuilder.build();
		HttpClient httpClient = createHttpClient();
		return httpClient.send(httpRequest, new WithErrorBodyHandler<R>(bodyHandler));
	}
	
	protected <R> CompletableFuture<HttpResponse<Either<R, String>>> sendAsync(final HttpRequest.Builder httpRequestBuilder, final BodyHandler<R> bodyHandler) {
		HttpRequest httpRequest = httpRequestBuilder.build();
		HttpClient httpClient = createHttpClient();
		return httpClient.sendAsync(httpRequest, new WithErrorBodyHandler<R>(bodyHandler));
	}
	
	protected <R> R validateAndHandleHttpResponse(final HttpResponse<Either<R, String>> httpResponse) {
		Either<R, String> either = httpResponse.body();
		if (either.isRightPresent()) {
			ApiError apiError = objectTransformer.transform(either.getRight(), ApiError.class);
			throw new ApiException(apiError);
		}
		
		return either.getLeft();
	}

//	protected <R> Stream<R> handleStream(final Stream<String> lines, Class<R> entityClassType) {
//		final String keyword = "data: ";
//		List<R> result = new ArrayList<>();
//		lines.forEach(line -> {
//			System.out.println(keyword + " -> " + line);
//			if (line.startsWith(keyword)) {
//				String content = line.substring(keyword.length());
//				if (!"[DONE]".equals(content)) {
//					result.add(objectTransformer.transform(content, entityClassType));
//				}
//			}
//		});
//		
//		return Collections.unmodifiableList(result).stream();
//	}
	
	private HttpClient createHttpClient() {
		HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
		if (connectionTimeout != null) {
			httpClientBuilder.connectTimeout(connectionTimeout);
		}
		
		if (proxy != null) {
			httpClientBuilder.proxy(proxy);
		}
		
		if (executor != null) {
			httpClientBuilder.executor(executor);
		}
		
		return httpClientBuilder.build();
	}
}
