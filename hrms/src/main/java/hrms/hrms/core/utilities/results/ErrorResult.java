package hrms.hrms.core.utilities.results;

public class ErrorResult extends Result {

	public ErrorResult() {
		super(false);
	}
	
	
	public ErrorResult(boolean success) {
		super(success);
		
	}

}
