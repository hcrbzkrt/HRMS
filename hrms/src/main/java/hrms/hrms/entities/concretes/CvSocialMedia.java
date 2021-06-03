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
@Table(name = "cv_social_media")
@AllArgsConstructor
@NoArgsConstructor
public class CvSocialMedia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_social_media_id")
	private int cvSocialMediaId;

	@Column(name = "social_media_link")
	private String socialMediaLink;

	@ManyToOne
	@JoinColumn(name = "social_media_id")
	private SocialMedia socialMedia;


}
