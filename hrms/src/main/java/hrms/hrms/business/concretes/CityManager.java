package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.CityService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CityDao;
import hrms.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Listed.");
	}

	@Override
	public DataResult<List<City>> getByCityNameContains(String cityName) {
		return new SuccessDataResult<List<City>>(this.cityDao.getByCityNameContains(cityName),"Succes");
	}

	@Override
	public Result delete(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City deleted.");
	}

	@Override
	public Result update(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City updated.");
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City added.");
	}

}
