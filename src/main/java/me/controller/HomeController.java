/**
 * 
 */
package me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author binh9
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
}
