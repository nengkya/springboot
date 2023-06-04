package company.haga.hagaproject.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

import company.haga.hagaproject.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	int i;

	@GetMapping("greeting")
	public Greeting greeting(
		@RequestParam(value = "name", defaultValue = "Haga")
		String name) {

		//return new Greeting(counter.incrementAndGet(), String.format(template, name));
		i = i + 1;
		return new Greeting(i, String.format(template, name));

	}

}
