package org.csystem.spring;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public ModelAndView helloWord() {
		String message = "deneme";
		return new ModelAndView("helloworld", "message", message);
	}
}

