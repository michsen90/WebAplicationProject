package booking.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsRestController {

	@Autowired
	private ClientsRespository clientsRespository;
	
	@RequestMapping(value="allclients", method=RequestMethod.GET)
	public Iterable<Clients> AllClients(){
		
		Iterable<Clients> allClients = clientsRespository.findAll();
		return allClients;
	}
	
	@RequestMapping(value="AddClient", method=RequestMethod.POST)
	public void AddClient(@RequestBody Clients client) {
		
		clientsRespository.save(client);
	}
	
}
