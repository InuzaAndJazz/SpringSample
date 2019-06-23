package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerSample {
	
	@PostMapping("/helloworld")
	@ResponseBody
	public String helloworld(@RequestParam Map<String,String> params) {
		return "hello "+params.get("name");
	}
}