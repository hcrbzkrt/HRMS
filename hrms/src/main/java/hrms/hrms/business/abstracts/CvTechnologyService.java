package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CvTechnology;

public interface CvTechnologyService {

	DataResult<List<CvTechnology>> getAll();
	Result add(CvTechnology cvTechnology);

}
