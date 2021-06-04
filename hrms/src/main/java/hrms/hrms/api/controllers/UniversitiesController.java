package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.UniversityService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.University;

@RestController
@RequestMapping("/api/universities")
public class UniversitiesController {


	private UniversityService universityService;

	@Autowired	
	public UniversitiesController(UniversityService universityService) {
		super();
		this.universityService = universityService;
	}

	
	@GetMapping("/getall")
	public DataResult<List<University>> getAll(){
		return this.universityService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody University university) {
		return this.universityService.add(university);
	}
	
	@GetMapping("/getByUniversityNameContains")
	public DataResult<List<University>> getByUniversityNameContains(@RequestParam String universityName){
		return this.universityService.getByUniversityNameContains(universityName);
	}
	
}
