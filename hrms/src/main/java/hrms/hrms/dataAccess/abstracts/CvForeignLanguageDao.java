package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.CvForeignLanguage;

public interface CvForeignLanguageDao extends JpaRepository<CvForeignLanguage, Integer>{

}
