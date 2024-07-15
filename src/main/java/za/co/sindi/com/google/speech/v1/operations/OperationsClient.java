package za.co.sindi.com.google.speech.v1.operations;

/**
 * @author Buhake Sindi
 * @since 11 July 2024
 */
public interface OperationsClient {
	
	public void cancel(String name);
	
	public void delete(String name);
	
	public Operation get(String name);

	public ListOperationsResponse list(String name, String filter, Integer pageSize, String pageToken);
	
	default ListOperationsResponse list(String name) {
		return list(name, null, null, null);
	}
}
