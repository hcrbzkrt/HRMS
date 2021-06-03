package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.EducationInformation;

public interface EducationInformationService {


	DataResult<List<EducationInformation>> getAll();
	Result add(EducationInformation educationInformation);

}
