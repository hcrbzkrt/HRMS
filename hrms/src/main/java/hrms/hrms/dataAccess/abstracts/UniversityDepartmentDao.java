package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.UniversityDepartment;

public interface UniversityDepartmentDao extends JpaRepository<UniversityDepartment, Integer>{

}
