package hrms.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.University;

public interface UniversityDao extends JpaRepository<University, Integer>{

	List<University> getByUniversityNameContains(String universityName);
	
}
