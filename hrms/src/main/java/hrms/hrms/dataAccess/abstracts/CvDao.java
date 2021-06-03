package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{

}
