package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAll();
	
	Result update(Employee employee);

	Result add(Employee employee);

	Result delete(Employee employee);

	
}
