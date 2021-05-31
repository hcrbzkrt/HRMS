package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);

	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getAllSorted();
	
	DataResult<JobAdvertisement> getByJobAdvertisementName(String jobAdvertisementName);
	  
    DataResult<List<JobAdvertisement>> getByJobAdvertisementNameContains(String JobAdvertisement);
	 
}