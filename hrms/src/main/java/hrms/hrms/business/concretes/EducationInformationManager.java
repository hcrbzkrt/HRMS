package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.EducationInformationService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.EducationInformtionDao;
import hrms.hrms.entities.concretes.EducationInformation;

@Service
public class EducationInformationManager implements EducationInformationService{

	private EducationInformtionDao educationInformtionDao;
	
	@Autowired
	public EducationInformationManager(EducationInformtionDao educationInformtionDao) {
		super();
		this.educationInformtionDao = educationInformtionDao;
	}

	@Override
	public DataResult<List<EducationInformation>> getAll() {
		return new SuccessDataResult<List<EducationInformation>>(this.educationInformtionDao.findAll(),"Eğitim bilgileri eklendi.");
	}

	@Override
	public Result add(EducationInformation educationInformation) {
		this.educationInformtionDao.save(educationInformation);
		return new SuccessResult();
	}

}
