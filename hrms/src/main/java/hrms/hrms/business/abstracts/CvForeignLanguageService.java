package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CvForeignLanguage;

public interface CvForeignLanguageService {

	DataResult<List<CvForeignLanguage>> getAll();
	
	Result add(CvForeignLanguage cvForeignLanguage);

}
