package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CvSocialMedia;

public interface CvSocialMediaService {

	DataResult<List<CvSocialMedia>> getAll();
	Result add(CvSocialMedia cvSocialMedia);

}
