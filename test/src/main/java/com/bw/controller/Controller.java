package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("list")
	public String list(){
		return "list";
	}
}
