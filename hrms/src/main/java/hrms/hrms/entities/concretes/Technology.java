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
@Table(name = "technologies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cvTechnologies"})
@AllArgsConstructor
@NoArgsConstructor
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "technology_id")
	private int technologyId;
	
	@Column(name = "techology_name")
	private String techologyName;
	
	@OneToMany(mappedBy = "technology")
	List<CvTechnology> cvTechnologies;
}
