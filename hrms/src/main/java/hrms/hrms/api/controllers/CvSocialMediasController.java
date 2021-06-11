package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.CvSocialMediaService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CvSocialMedia;

@RestController
@RequestMapping("/api/cvSocialMedias")
@CrossOrigin
public class CvSocialMediasController {


	private CvSocialMediaService cvSocialMediaService;
	
	@Autowired
	public CvSocialMediasController(CvSocialMediaService cvSocialMediaService) {
		super();
		this.cvSocialMediaService = cvSocialMediaService;
	}

	
	@GetMapping("/getall")
	public DataResult<List<CvSocialMedia>> getAll(){
		return this.cvSocialMediaService.getAll();
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody CvSocialMedia cvSocialMedia) {
		return this.cvSocialMediaService.add(cvSocialMedia);
	}
}
