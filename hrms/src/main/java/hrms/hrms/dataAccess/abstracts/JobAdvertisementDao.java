package hrms.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{


}
