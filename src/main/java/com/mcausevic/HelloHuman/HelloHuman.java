package com.mcausevic.HelloHuman;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloHuman {
	@RequestMapping("/query")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		System.out.println("Hello");
		System.out.println(searchQuery);
		if(searchQuery == null) {
			
			return "Hello Human";
			
		}else {
			return "Hello:" + searchQuery;
		}
		
	}
}
