package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HumanController {


	@RequestMapping("")
public String index(@RequestParam(value="name", required=false) String firstName, @RequestParam(value="last_name", required=false) String lastName, @RequestParam(value="times", required=false) Integer numTimes) {
		if(numTimes == null) {
			numTimes = 1;
		}
		if(firstName == null && lastName == null) {
			String human = "";
			for(int i = 0; i < numTimes; i++) {
				human += "Hello Human ";
			}
			return human;
		}
		else if(lastName == null) {
			String name1 = "";
			for(int i = 0; i < numTimes; i++) {
				name1 += "Hello " + firstName + " ";
			}
			return name1;
		}
		else {
			String name2 = "";
			for(int i = 0; i < numTimes; i++) {
				name2 += "Hello " + firstName + " " + lastName + " ";
			}
			return name2;
		}
	}
	
	
}
