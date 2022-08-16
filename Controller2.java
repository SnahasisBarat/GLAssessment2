package com.java;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {
	 @RequestMapping("/register")

	  public String display(HttpServletRequest req,Model m) throws Exception

	  {
	  
	    //read the provided form data
		  	String name=req.getParameter("Name");

		    String em=req.getParameter("empno");
		    String des=req.getParameter("designation");
		    String sa=req.getParameter("salary");
			
		    if(name.isEmpty()||em.isEmpty()||des.isEmpty()||sa.isEmpty())
		    {
		    	String error="Enter all details";
		    	m.addAttribute("err",error);
		    	return "welcome";
		    }
		    else {
		    	m.addAttribute("Welcome","Your details are");
		    	m.addAttribute("name",name);
		    	m.addAttribute("no",em);
		    	m.addAttribute("designation",des);
		    	m.addAttribute("salary",sa);
		    	
		    }
		    return "welcome";
		    
	
}
	 

}
