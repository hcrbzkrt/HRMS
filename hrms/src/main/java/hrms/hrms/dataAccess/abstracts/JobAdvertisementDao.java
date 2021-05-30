package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{


	List<JobAdvertisement> getByisActiveTrue();
	
	List<JobAdvertisement> getByisActiveTrueOrderByApplicationDeadlineAsc();
	
	List<JobAdvertisement> getByisActiveTrueAndEmployer_Id(int id);

	List<JobAdvertisement> getByAdvertisementStatus(boolean status);

	void updateJobAdvertisementSetJobAdvertisementStatusForEmployer_userId(int jobAdvertisementId, int employerId);

	List<JobAdvertisement> getByEmployer_userId(int userId);
}
