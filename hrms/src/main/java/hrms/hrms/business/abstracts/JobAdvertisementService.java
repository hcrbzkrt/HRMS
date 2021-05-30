package hrms.hrms.business.abstracts;

import java.util.List;


import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	public List<JobAdvertisement> getAll();
	
	public DataResult<List<JobAdvertisement>> getAllSorted();
	
	public DataResult<List<JobAdvertisement>> getByEmployer_userId(int userId);
	
	public DataResult<List<JobAdvertisement>> getByAdvertisementStatus(boolean status);
	
	public Result updateJobAdvertisementSetJobAdvertisementStatusForEmployer_userId(int jobAdvertisementId, int employerId);
}
