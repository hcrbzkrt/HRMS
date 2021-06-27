package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Cv;

public interface CvService {

	DataResult<List<Cv>> getAll();

	Result add(Cv cv);

	Result update(Cv cv);

	Result delete(Cv cv);
}
