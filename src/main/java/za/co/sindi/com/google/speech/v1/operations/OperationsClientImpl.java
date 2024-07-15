package za.co.sindi.com.google.speech.v1.operations;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import za.co.sindi.com.google.speech.BaseClient;
import za.co.sindi.commons.io.UncheckedException;
import za.co.sindi.commons.util.Either;
import za.co.sindi.commons.utils.URLEncoderUtils;

/**
 * @author Buhake Sindi
 * @since 12 July 2024
 */
public class OperationsClientImpl extends BaseClient implements OperationsClient {
	
	private static final String OPERATION_BASE_URL = "https://speech.googleapis.com/v1/operations";

	/**
	 * @param accessToken
	 */
	public OperationsClientImpl(String accessToken) {
		super(accessToken);
		//TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.com.google.speech.v1.operations.OperationsClient#cancel(java.lang.String)
	 */
	@Override
	public void cancel(String name) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(OPERATION_BASE_URL + URLEncoderUtils.encodePath("/" + Objects.requireNonNull(name, "The name of the operation resource is required."), StandardCharsets.UTF_8) + ":cancel"), BodyPublishers.noBody());
			HttpResponse<Either<Void, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.discarding());
			validateAndHandleHttpResponse(httpResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.com.google.speech.v1.operations.OperationsClient#delete(java.lang.String)
	 */
	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpDELETERequestBuilder(URI.create(OPERATION_BASE_URL + URLEncoderUtils.encodePath("/" + Objects.requireNonNull(name, "The name of the operation resource is required."), StandardCharsets.UTF_8)));
			HttpResponse<Either<Void, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.discarding());
			validateAndHandleHttpResponse(httpResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.com.google.speech.v1.operations.OperationClient#get(java.lang.String)
	 */
	@Override
	public Operation get(String name) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpGETRequestBuilder(URI.create(OPERATION_BASE_URL + URLEncoderUtils.encodePath("/" + Objects.requireNonNull(name, "The name of the operation resource is required."), StandardCharsets.UTF_8)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), Operation.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.com.google.speech.v1.operations.OperationClient#list(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String)
	 */
	@Override
	public ListOperationsResponse list(String name, String filter, Integer pageSize, String pageToken) {
		try {
			Map<String, Object> queryParameterMap = new LinkedHashMap<>();
			queryParameterMap.put("name", Objects.requireNonNull(name, "The name of the operation resource is required."));
			if (Objects.nonNull(filter)) {
				queryParameterMap.put("filter", filter);
			}
			if (Objects.nonNull(pageSize)) {
				queryParameterMap.put("pageSize", pageSize);
			}
			if (Objects.nonNull(pageToken)) {
				queryParameterMap.put("pageToken", pageToken);
			}
			HttpRequest.Builder httpRequestBuilder = createHttpGETRequestBuilder(URI.create(OPERATION_BASE_URL + "?" + URLEncoderUtils.formatQueryParametersNatively(queryParameterMap, '&', StandardCharsets.UTF_8)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder,BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), ListOperationsResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}
}
