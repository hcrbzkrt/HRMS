package hrms.hrms.core.utilities.results;

public class ErrorDataResult<H> extends DataResult<H> {

	public  ErrorDataResult(H data) {
		super(data, false);
	}
	
	public ErrorDataResult() {
		super(null, false);
	}
}
