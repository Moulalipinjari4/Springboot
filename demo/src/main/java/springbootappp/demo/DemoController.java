package springbootappp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/Hi")
	public void Hello() {
		System.out.println("Get Hello");
		}
}
