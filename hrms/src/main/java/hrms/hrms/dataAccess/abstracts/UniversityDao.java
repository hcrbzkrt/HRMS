package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.University;

public interface UniversityDao extends JpaRepository<University, Integer>{

}
