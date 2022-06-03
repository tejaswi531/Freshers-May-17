package springcore_example;

import org.springframework.stereotype.Controller;
@Controller //@RestController;
public class PlayerController {
	
	@ResponseBody
	public String getMessage() {
		return "hi there!,I am from controller";
	}

}
