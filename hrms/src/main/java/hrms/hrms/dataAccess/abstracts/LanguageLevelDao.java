package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.LanguageLevel;

public interface LanguageLevelDao extends JpaRepository<LanguageLevel, Integer>{

}
