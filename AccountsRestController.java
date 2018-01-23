package booking.application;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsRestController {

	@Autowired
	private AccountsRespository accountsRespository;
	
	@RequestMapping(value="/allaccounts", method=RequestMethod.GET)
	public Iterable<Accounts> getAccounts(){
		
		Iterable<Accounts> allAccounts = accountsRespository.findAll();
		return allAccounts;
	}
	
}
