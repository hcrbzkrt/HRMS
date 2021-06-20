package hrms.hrms.core.photoUploaders;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.core.utilities.results.DataResult;

public interface PhotoService {

	DataResult<?> save(MultipartFile file);
	DataResult<Map> upload(MultipartFile multipartFile) throws IOException;
	DataResult<Map> delete (String id) throws IOException;
}
