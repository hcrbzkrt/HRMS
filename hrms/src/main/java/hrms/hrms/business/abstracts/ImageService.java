package hrms.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Image;

public interface ImageService {

	Result add(Image image);

	Result addAll(List<Image> Image);

	Result add(Image Image, MultipartFile file);

	Result delete(Image image);

	DataResult<Image> getById(int imageId);

	DataResult<List<Image>> getAll();

	DataResult<List<Image>> getAllByCandidateId(int candidateId);

	DataResult<List<Image>> getAllById(int id);
}
