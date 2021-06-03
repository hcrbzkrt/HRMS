package hrms.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "education_inforation")
@NoArgsConstructor
@AllArgsConstructor
public class EducationInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "education_information_id")
	private int educationInformationId;
	
	@Column(name = "starting_date")
	private Date startingDate;
	
	@Column(name = "graduation_date")
	private String graduationDate;
	
	@ManyToOne
	@JoinColumn(name = "cv_id", referencedColumnName = "cv_id")
	private Cv cv;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;
	
	@ManyToOne
	@JoinColumn(name = "university_department_id")
	private UniversityDepartment universityDepartment;
}
