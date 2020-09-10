package com.example.Example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@GetMapping("/get")
	public void getmessage()
	{
		System.out.println("get controller");
	}

}
