package hrms.hrms.business.concretes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.business.abstracts.ImageService;
import hrms.hrms.core.photoUploaders.PhotoService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.ImageDao;
import hrms.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{

	private ImageDao imageDao;
	private PhotoService photoService;
	private ModelMapper modelMapper;

	@Autowired
	public ImageManager(ImageDao imageDao, PhotoService photoService) {
		this.imageDao = imageDao;
		this.photoService = photoService;
	} 
	

	@Override
	public Result add(Image image) {
		this.imageDao.save(image);
		return new SuccessResult("Image Added.");
	}

	@Override
	public Result addAll(List<Image> Image) {
		imageDao.saveAll(Image);
		return new SuccessResult();
	}

	@Override
	public Result add(Image Image, MultipartFile file) {
		Map<String, String> result = (Map<String, String>) photoService.save(file).getData();
		String url = result.get("url");
		Image.setImageLink(url);
		Image.setCreatedOn(LocalDateTime.now());
		return add(Image);
	}

	@Override
	public Result delete(Image image) {
		this.imageDao.delete(image);
		return new SuccessResult("Deletion is successful");
	}

	@Override
	public DataResult<Image> getById(int imageId) {
		return new SuccessDataResult<Image>(this.imageDao.getOne(imageId));
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<>(this.imageDao.findAll(),".");
	}

	@Override
	public DataResult<List<Image>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<>(this.imageDao.getAllByImageId(candidateId));
	}


	@Override
	public DataResult<List<Image>> getAllById(int id) {
		return new SuccessDataResult<>(this.imageDao.getAllByImageId(id),"Success");
	}

}
