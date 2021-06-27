package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CvService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CvDao;
import hrms.hrms.entities.concretes.Cv;

@Service
public class CvManager implements CvService{

	private CvDao cvDao;
	
	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(),"Listed.");
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("CV added.");
	}

	@Override
	public Result update(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("CV updated.");
	}

	@Override
	public Result delete(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult("CV deleted.");
	}

}
