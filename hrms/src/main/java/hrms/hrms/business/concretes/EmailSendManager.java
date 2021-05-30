package hrms.hrms.business.concretes;

import org.springframework.stereotype.Service;

@Service
public class EmailSendManager {

	public void emailSending(String email) {
		System.out.println(" " + email + " adresinize doğrulama kodu gönderildi!");
	}

}
