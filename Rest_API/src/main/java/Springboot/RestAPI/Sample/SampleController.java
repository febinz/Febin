package Springboot.RestAPI.Sample;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping("/Hello")
	public String test() {
		return "Hello";
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value= "/Hello")
	public String testPost(@RequestBody Model model) {
		return "Hello";
		
	}
}
