package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.WorkExperience;

public interface WorkExperienceDao extends JpaRepository<WorkExperience, Integer>{

}
