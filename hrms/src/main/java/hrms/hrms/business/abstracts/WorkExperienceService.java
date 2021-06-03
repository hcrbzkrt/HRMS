package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {


	DataResult<List<WorkExperience>> getAll();
	Result add(WorkExperience workExperience);

}
