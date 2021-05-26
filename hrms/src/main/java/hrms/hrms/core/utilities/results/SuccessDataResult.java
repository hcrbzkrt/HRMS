package hrms.hrms.core.utilities.results;

public class SuccessDataResult<H> extends DataResult<H> {

	public SuccessDataResult(H data) {
		super(data, true);
	}
	
	public SuccessDataResult() {
		super(null, true);
	}
}
