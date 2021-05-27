package hrms.hrms.core.utilities.results;

public class ErrorDataResult<H> extends DataResult<H> {

	public ErrorDataResult(H data, String message) {
		super(data, false , message);	
	}

	
	public  ErrorDataResult(H data) {
		super(data, false);
	}
	
	public ErrorDataResult(String message) {
		super(null, false, message);	
	}
	
	public ErrorDataResult() {
		super(null, false);
	}
}
