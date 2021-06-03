package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.CvTechnology;
import hrms.hrms.entities.concretes.Technology;

public interface CvTechnologyDao extends JpaRepository<Technology, Integer>{

	void save(CvTechnology cvTechnology);


}
