package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CvSocialMediaService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CvSocialMediaDao;
import hrms.hrms.entities.concretes.CvSocialMedia;

@Service
public class CvSocialMediaManager implements CvSocialMediaService{

	private CvSocialMediaDao cvSocialMediaDao;
	
	@Autowired
	public CvSocialMediaManager(CvSocialMediaDao cvSocialMediaDao) {
		super();
		this.cvSocialMediaDao = cvSocialMediaDao;
	}

	@Override
	public DataResult<List<CvSocialMedia>> getAll() {
		return new SuccessDataResult<List<CvSocialMedia>>(this.cvSocialMediaDao.findAll(),"Listed.");
	}

	@Override
	public Result add(CvSocialMedia cvSocialMedia) {
	     this.cvSocialMediaDao.save(cvSocialMedia);
	     return new SuccessResult("CV Social Media added.");
	}

}
