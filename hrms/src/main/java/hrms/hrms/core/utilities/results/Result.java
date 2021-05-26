package hrms.hrms.core.utilities.results;

public class Result {

	private boolean success;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
}
