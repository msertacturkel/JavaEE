package org.csystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld1")
	public ModelAndView helloWorld() {
		System.out.println("cagrildim..");
		String mesage = "deneme";
		return new ModelAndView("helloworld", "message", mesage);
	}
}
