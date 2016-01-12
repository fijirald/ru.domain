package ru.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RootController {

	@RequestMapping(method = RequestMethod.GET)
	public String print(ModelMap model) {

		model.addAttribute("message", "Spring 4 MVC!!");
//                model.addAttribute("message", "{\"id\":1,\"content\":\"Hello, World!\"}");
		return "index";

	}
	
}