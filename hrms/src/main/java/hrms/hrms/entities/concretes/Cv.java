package hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<CvForeignLanguage> cvForeignLanguage;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<CvSocialMedia> cvSocialMedia;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<CvTechnology> cvTechnology;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<EducationInformation> educationInformation;
 
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<WorkExperience> workExperience;


}
