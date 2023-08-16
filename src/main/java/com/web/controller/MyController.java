package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
@RequestMapping("/")
public String MyRegForm() {
	return "reg";
}
@RequestMapping("/reg")
public String MyRegData(@RequestParam String uname,@RequestParam String psw,@RequestParam String mail,@RequestParam String gender,@RequestParam String add,@RequestParam String state,ModelMap model) {
	model.put("un", uname);
	model.put("ps", psw);
	model.put("ml", mail);
	model.put("gn", gender);
	model.put("ad", add);
	model.put("st", state);
	
	return "result";
	
}
}
