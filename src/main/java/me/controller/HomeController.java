/**
 * 
 */
package me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/* PATH VARIABLE */
	
    /* Lấy pathVariable trên URL, tên tham số và tên variable phải giống nhau */
	/* Kiểm sát kiểu variable */
	/* Lấy dữ liệu qua model Attribute, trả về ngay trang đó */
	
	@RequestMapping(value = "/{id}")
	public String pathVariable(@PathVariable("id") int id, Model model) {
		model.addAttribute("id",id);
		return "index";
	}
	
	/* PATH VARIABLE */
	
	/* URL cần đủ tham số, nếu không sẽ 404 */
	/* Lấy dữ liệu qua model Attribute, trả về ngay trang đó */
	
	@RequestMapping(value = "home/{var1}/{var2}")
	public String index2(@PathVariable("var1") int id, @PathVariable("var2") String param2, Model model) {
		model.addAttribute("giaTri1",id);
		model.addAttribute("giaTri2", param2);
		return "home";
	}
	
	/* REQUEST PARAM */
	
	/* Data được gửi qua form (trên trang home)*/
	/* Form thường: name của trường trùng với tên param */
	/* Form Spring: path của trường trùng với tên param */
	/* Trả dữ liệu về trang nhận */
	
	@RequestMapping(value = "/form")
	public String formDemo(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord, Model model) {
		model.addAttribute("userNameResponse", userName);
		model.addAttribute("passWordResponse", passWord);
		return "form";
	}
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
}
