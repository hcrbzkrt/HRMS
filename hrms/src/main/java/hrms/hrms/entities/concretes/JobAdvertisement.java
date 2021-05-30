package hrms.hrms.entities.concretes;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_advertisements")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "JobAdvertisement"}) 
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" )
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "emloyer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "job_title_id")
	private JobTitle jobTitle;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	@Column(name="description",length = 2500)
	@Type(type="text")
	private String description;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="quota")
	private int quota;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="created_date")
	private LocalDateTime createdDate;
	
	@Column(name="is_active")
	private boolean isAcvtive = true;
	
	
	
}
