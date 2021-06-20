package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.business.abstracts.ImageService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Employee;
import hrms.hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class ImagesController {

	private ImageService imageService;

	@Autowired
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@RequestBody MultipartFile file, @RequestParam int employeeId) {
		Image image = new Image();
		Employee employee= new Employee();
		employee.setId(employeeId);
		image.setEmployee(employee);
		return ResponseEntity.ok(this.imageService.add(image, file));
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Image>> getAllById(int id) {
		return this.imageService.getAllById(id);
	}

	@DeleteMapping("/delete")
	public Result delete(@RequestBody Image image) {
		return this.imageService.delete(image);
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(this.imageService.getAll());
	}
}
