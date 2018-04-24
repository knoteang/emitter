package com.arms.app.staticpages;



import java.security.Principal;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StaticPagesController {
	
	
	@RequestMapping("/help")
	public ModelAndView help(ModelAndView modelAndView, Principal principal) {
		modelAndView.setViewName("static/help");
		return modelAndView;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(ModelAndView modelAndView, Principal principal) {
		modelAndView.setViewName("static/contact");
		return modelAndView;
	}
	
	
	@RequestMapping("/about")
	public ModelAndView about(ModelAndView modelAndView, Principal principal) {
		modelAndView.setViewName("static/about");
		return modelAndView;
	}
	

}