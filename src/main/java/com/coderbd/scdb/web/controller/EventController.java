package com.coderbd.scdb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping(value = "/eventmaker")
	public String eventCreationPage() {
		return "createevent";
	}
	
}
