package hrms.hrms.dataAccess.abstracts;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	JobAdvertisement getByJobAdvertisementName(String JobAdvertisementName);

	List<JobAdvertisement> getByJobAdverttisementNameContains(String JobAdvertisement);
	
	List<JobAdvertisement> getByJobAdverttisementStartsWith(String JobAdvertisement);
	
	List<JobAdvertisement> getByCreatedDateBetweenAndIsActivatedTrueOrderByCreatedDateDesc(LocalDateTime startDate, LocalDateTime finishDate);
	
}
