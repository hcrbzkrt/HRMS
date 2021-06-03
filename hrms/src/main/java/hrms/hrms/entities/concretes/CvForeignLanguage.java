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
@Table(name = "cv_foreign_languages")
@NoArgsConstructor
@AllArgsConstructor
public class CvForeignLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "foreign_language_id")
	private int foreignLanguageId;
	
	@Column(name = "foreign_language_name")
	private String foreignLanguageName;
	
	@ManyToOne
    @JoinColumn(name = "cv_id")
    private Cv cv;
	
	@ManyToOne
	@JoinColumn(name="language_level_id")
	private LanguageLevel languageLevel;
	
	@ManyToOne
	@JoinColumn(name="foreign_languages_id")
	private ForeignLanguage foreignLanguage;

}
