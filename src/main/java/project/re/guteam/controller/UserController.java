package project.re.guteam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import project.re.guteam.domain.UserInfoVO;
import project.re.guteam.domain.UserVO;

@Controller
@RequestMapping(value="/user")
public class UserController {
	static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/login")
	public void LoginGET() {}
	
	@PostMapping("/login")
	public void loginPOST(UserVO uvo) {
		logger.info(uvo.toString());
	}
	
	@GetMapping("/register")
	public void RegisterGET() {}
	
	@PostMapping("/register")
	public String RegisterPOST(UserVO uvo, UserInfoVO uivo) {
		logger.info("uvo="+uvo.toString()+", uivo="+uivo.toString());
		return "redirect:/user/login";
	}
	
}
