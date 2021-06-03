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
@Table(name = "languge_levels")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cvForeignLaguages"})
public class LanguageLevel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "languge_level_id")
	private int langugeLevelId;
	
	@Column(name = "languge_level_name")
	private String languageLevelName;
	
	@Column(name = "languge_level")
	private int langugeLevel;
	
	@OneToMany(mappedBy = "langugeLevel")
	private List<CvForeignLanguage> cvForeignLanguages;
}
