package hrms.hrms.core.utilities.results;


public class DataResult<H> extends Result {

	private H data;
	public DataResult( H data, boolean success, String message) {
		super(success, message);
		this.data = data;
	}
	
	public DataResult(H data, boolean success) {
		super(success);
		this.data = data;
	}

	public H getData() {
		return this.data;
	}
	
}
