package com.springboot.Webservices;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//Controller
@RestController
public class HelloWorldController {
	
	//use method and uri to map the controller
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String connectAndGetHelloWorld() {
		return "Hello World";
	}
	
	//you can also use GetMapping/PostMapping(path="resouceName")
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean connectAndGetHelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	

	@GetMapping(path="/hello-world/name/{name}")
	public HelloWorldBean connectAndGetHelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}

	@GetMapping(path="/books")
	public List<Book> getBooksOfAuthor() {
		return Arrays.asList(new Book(01, "J.K. Rowlings", "Harry Porter"), new Book(02, "Ayan Ryand", "Fountain Head"));
	}

}
