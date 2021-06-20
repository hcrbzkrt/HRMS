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
@Table(name = "cvs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cvForeignLanguage"})
@AllArgsConstructor
@NoArgsConstructor
public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int cvId;
	
	@Column(name = "objective")
	private String objective;
	
	@Column(name = "photo_link")
	private String photoLink;
	
	@OneToMany(mappedBy = "cv")
	private List<CvForeignLanguage> cvForeignLanguage;
	
	
	@OneToMany(mappedBy = "cv")
	private List<CvSocialMedia> cvSocialMedia;
	
	@OneToMany(mappedBy = "cv")
	private List<CvTechnology> cvTechnology;
	
	@OneToMany(mappedBy = "cv")
	private List<EducationInformation> educationInformation;
 
	@OneToMany(mappedBy = "cv")
	private List<WorkExperience> workExperience;


}
