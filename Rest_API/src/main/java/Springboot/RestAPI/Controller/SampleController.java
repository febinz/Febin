package Springboot.RestAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Springboot.RestAPI.model.Model;
import Springboot.RestAPI.service.Service;

@RestController
public class SampleController {
	
	@Autowired
	private Service service;
	
	@RequestMapping("/Hello")
	public String test() {
		return "Hello";
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value= "/Hello")
	public String testPost(@RequestBody Model model) {
		return "Hello";
		
	}
}
