package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();

	Result add(Employer employer);

	Result update(Employer employer);

	Result delete(Employer employer);
	
}
