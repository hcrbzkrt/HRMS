package hrms.hrms.business.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer , Integer> {

}
