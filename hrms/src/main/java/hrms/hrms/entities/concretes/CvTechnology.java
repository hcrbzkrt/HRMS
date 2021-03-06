package hrms.hrms.entities.concretes;


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
@Table(name = "cv_technologies")
@NoArgsConstructor
@AllArgsConstructor
public class CvTechnology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_technologies_id")
	private int cvTechnologiesId;
	
	@ManyToOne
	@JoinColumn(name = "technology_id")
	private Technology technology;
	
	@ManyToOne
    @JoinColumn(name = "cv_id")
    private Cv cv;
}
