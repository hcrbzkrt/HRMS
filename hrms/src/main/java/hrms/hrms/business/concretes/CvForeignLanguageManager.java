package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CvForeignLanguageService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CvForeignLanguageDao;
import hrms.hrms.entities.concretes.CvForeignLanguage;

@Service
public class CvForeignLanguageManager implements CvForeignLanguageService {

	private CvForeignLanguageDao cvForeignLanguageDao;
	
	@Autowired
	public CvForeignLanguageManager(CvForeignLanguageDao cvForeignLanguageDao) {
		super();
		this.cvForeignLanguageDao = cvForeignLanguageDao;
	}

	@Override
	public DataResult<List<CvForeignLanguage>> getAll() {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguageDao.findAll());
	}

	@Override
	public Result add(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult();
	}

}
