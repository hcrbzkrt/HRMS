package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.City;

public interface CityService {

	DataResult<List<City>> getAll();

	DataResult<List<City>> getByCityNameContains(String cityName);

	Result delete(City city);

	Result update(City city);

	Result add(City city);
}
