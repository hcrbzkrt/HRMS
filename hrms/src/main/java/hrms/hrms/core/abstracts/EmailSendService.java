package hrms.hrms.core.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmailSendService {

	public void email(String email);
}
