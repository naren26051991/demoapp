package demoapp.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }

	@RequestMapping(method=RequestMethod.PUT)
	public void addUserData(User user) {
		
		System.out.println("triggering add user api");
	}
	
	@RequestMapping(method=RequestMethod.DELETE , name="/delete")
	public void deleteUserData(String userId) {
		System.out.println("triggering delete user api..");
		
	}
	
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class,args);
    }
    
    
}
