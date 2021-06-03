package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.SocialMedia;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer>{

}
