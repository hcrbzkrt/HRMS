package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.hrms.business.abstracts.UniversityService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.UniversityDao;
import hrms.hrms.entities.concretes.University;

public class UniversityManager implements UniversityService{

	private UniversityDao universityDao;
	
	@Autowired
	public UniversityManager(UniversityDao universityDao) {
		super();
		this.universityDao = universityDao;
	}

	@Override
	public DataResult<List<University>> getAll() {
		return new SuccessDataResult<List<University>>(this.universityDao.findAll());
	}

	@Override
	public Result add(University university) {
		this.universityDao.save(university);
		return new SuccessResult();
	}

	

}