package company.haga.hagaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HagaprojectApplication{

	@RequestMapping("/")
	String home(){
 		return "import org.springframework.web.bind.annotation.RestController;";
	}

	public static void main(String[] arguments){
		SpringApplication.run(HagaprojectApplication.class, arguments);
	}

}
