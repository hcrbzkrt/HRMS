package hrms.hrms.core.utilities.results;

public class SuccessDataResult<H> extends DataResult<H> {

	public SuccessDataResult(H data, String message) {
		super(data, true , message);
		
	}

	public SuccessDataResult(H data) {
		super(data, true);
	}
	
	public SuccessDataResult(String message) {
		super(null,  true , message);
		
	}
	
	public SuccessDataResult() {
		super(null,  true );
		
	}
}
