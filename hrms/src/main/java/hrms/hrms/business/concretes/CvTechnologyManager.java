package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CvTechnologyService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CvTechnologyDao;
import hrms.hrms.entities.concretes.CvTechnology;

@Service
public class CvTechnologyManager implements CvTechnologyService{

	private CvTechnologyDao cvTechnologyDao;
	
	@Autowired
	public CvTechnologyManager(CvTechnologyDao cvTechnologyDao) {
		super();
		this.cvTechnologyDao = cvTechnologyDao;
	}

	@Override
	public DataResult<List<CvTechnology>> getAll() {
		return new SuccessDataResult<List<CvTechnology>>();
	}

	@Override
	public Result add(CvTechnology cvTechnology) {
		this.cvTechnologyDao.save(cvTechnology);
		return new SuccessResult();
	}

}
