package hrms.hrms.core.concretes;

import hrms.hrms.core.abstracts.MernisCheckService;
import hrms.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import org.springframework.stereotype.Component;

@Component
public class MernisCheckAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker)  {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					Long.valueOf(jobSeeker.getNotionalId()),
					jobSeeker.getFirstName().toUpperCase(),
					jobSeeker.getLastName().toUpperCase() ,
					jobSeeker.getYearOfBirth());
	       
	}catch (NumberFormatException e) {
		e.printStackTrace();
	}
	return result;
	}	
}
