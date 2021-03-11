package net.javaguide.springmvc.controller;
import java.time.LocalDateTime;

public class HelloWorldContainner {

public String handler(Model model) {
	
	HelloWorld helloWorld = new HelloWorld();
	helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
	helloWorld.setDateTime(LocalDateTime.now().toString());
	model.addAttribute("helloWorld", helloWorld);
	return "helloworld";
}
}
