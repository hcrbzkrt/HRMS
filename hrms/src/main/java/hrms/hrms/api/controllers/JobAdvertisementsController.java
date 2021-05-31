package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobAdvertisementService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
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
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
    @GetMapping("/getall")
    public DataResult<List<JobAdvertisement>> getAll(){
    	return this.jobAdvertisementService.getAll();
    }
 
	@GetMapping("/getAllActivatedSorted")
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		return this.jobAdvertisementService.getAllSorted();
	}
	
	

}