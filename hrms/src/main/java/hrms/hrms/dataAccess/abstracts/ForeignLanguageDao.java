package hrms.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer>{

}
