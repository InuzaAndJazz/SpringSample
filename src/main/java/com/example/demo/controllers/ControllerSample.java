package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.object.RequestBodySample;

@Controller
public class ControllerSample {
	
	@PostMapping("/helloworld")
	@ResponseBody
	public String helloworld(@RequestBody RequestBodySample body) {
		return "hello "+body.getName();
	}
	
	@GetMapping("/LaTerribleApi")
	@ResponseBody
	public String laTerribleApi() {
		return "la terrible api";
	}
}