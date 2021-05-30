package hrms.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import hrms.hrms.core.abstracts.EmailCheckService;

@Component
@Primary
public class FakeEmailCheckManager implements EmailCheckService{

	@Override
	public boolean email(String email) {
		return true;
	}

	
}
