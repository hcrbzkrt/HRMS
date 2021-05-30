package hrms.hrms.api.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hrms.hrms.core.utilities.results.Result;

import hrms.hrms.business.abstracts.JobAdvertisementService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {

	public JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
	    super();
	    this.jobAdvertisementService = jobAdvertisementService;
	}
	
    @GetMapping("/getall")
    public List<JobAdvertisement> getAll(){
    	return this.jobAdvertisementService.getAll();
    }
    
    @GetMapping("/getAllActive")
	public DataResult<List<JobAdvertisement>> getByAdvertisementStatus(@RequestParam boolean status) {
		return this.jobAdvertisementService.getByAdvertisementStatus(status);
	}

	@GetMapping("/getAllActiveSorted")
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		return this.jobAdvertisementService.getAllSorted();
	}

	@GetMapping("/getByEmployerJobAdvertisements")
	public DataResult<List<JobAdvertisement>> getByEmployer_userId(@RequestParam int userId) {
		return this.jobAdvertisementService.getByEmployer_userId(userId);
	}

	

	@PostMapping("/closeTheJobAdvertisement")
	@Transactional
	public Result updateJobAdvertisementSetJobAdvertisementStatusForEmployer_userId(@RequestParam("jobAdvertisementId") int jobAdvertisementId,@RequestParam("employerId") int employerId) {
		return this.jobAdvertisementService.updateJobAdvertisementSetJobAdvertisementStatusForEmployer_userId(jobAdvertisementId, employerId); 
		}
}
