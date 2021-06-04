package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.CvForeignLanguageService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CvForeignLanguage;

@RestController
@RequestMapping("/api/cvForeignLanguages")
public class CvForeignLanguagesController {

	private CvForeignLanguageService cvForeignLanguageService;
	
	@Autowired
	public CvForeignLanguagesController(CvForeignLanguageService cvForeignLanguageService) {
		super();
		this.cvForeignLanguageService = cvForeignLanguageService;
	}


	@GetMapping("/getall")
	public DataResult<List<CvForeignLanguage>> getAll(){
		return this.cvForeignLanguageService.getAll();
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody CvForeignLanguage cvForeignLanguage) {
		return this.cvForeignLanguageService.add(cvForeignLanguage);
	}
	
}
