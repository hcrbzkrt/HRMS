package hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "university_departments")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "educationInformations"})
@AllArgsConstructor
@NoArgsConstructor
public class UniversityDepartment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "university_department_id")
	private int universityDepartmentId;
	
	@Column(name = "university_department_name")
	private String universityDepartmentName;
	
	@OneToMany(mappedBy = "universityDepartment")
	private List<EducationInformation> educationInformations;
}
