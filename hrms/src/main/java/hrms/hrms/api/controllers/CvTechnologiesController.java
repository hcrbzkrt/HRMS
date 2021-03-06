package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.CvTechnologyService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CvTechnology;

@RestController
@RequestMapping("/api/cvTechnologies")
@CrossOrigin
public class CvTechnologiesController {


	private CvTechnologyService cvTechnologyService;
	
	@Autowired
	public CvTechnologiesController(CvTechnologyService cvTechnologyService) {
		super();
		this.cvTechnologyService = cvTechnologyService;
	}

	@GetMapping("/getall")
	public DataResult<List<CvTechnology>> getAll(){
		return this.cvTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvTechnology cvTechnology) {
		return this.cvTechnologyService.add(cvTechnology);
	}
}
