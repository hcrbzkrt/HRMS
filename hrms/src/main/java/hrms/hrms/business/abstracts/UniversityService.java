package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.University;

public interface UniversityService {


	DataResult<List<University>> getAll();
	Result add(University university);

}
