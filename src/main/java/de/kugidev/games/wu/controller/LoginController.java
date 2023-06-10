package de.kugidev.games.wu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
	
	@PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        //TODO: add Auth Manager
		return "redirect:/home"; 
    }

}
