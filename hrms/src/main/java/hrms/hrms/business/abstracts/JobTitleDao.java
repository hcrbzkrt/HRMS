package hrms.hrms.business.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle	, Integer> {

}
