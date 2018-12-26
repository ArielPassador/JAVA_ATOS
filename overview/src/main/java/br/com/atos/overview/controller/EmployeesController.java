package br.com.atos.overview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import br.com.atos.overview.service.EmployeesService;

@Controller
public class EmployeesController {
		
		@Autowired
		private EmployeesService service;
		
		public ModelAndView findAll() {
			
			ModelAndView mv = new ModelAndView("/index");
			mv.addObject("Employees", service.findAll());
			
			return mv;
		}
}
