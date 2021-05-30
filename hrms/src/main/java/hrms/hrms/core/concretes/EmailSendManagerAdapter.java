package hrms.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.concretes.EmailSendManager;
import hrms.hrms.core.abstracts.EmailSendService;

@Service
public class EmailSendManagerAdapter implements EmailSendService {

	private EmailSendManager emailSendManager;
	
	@Autowired
	public EmailSendManagerAdapter(EmailSendManager emailSendManager) {
	   this.emailSendManager = emailSendManager;
	}
	@Override
	public void email(String email) {
		emailSendManager.emailSending(email);
	}

	
}
