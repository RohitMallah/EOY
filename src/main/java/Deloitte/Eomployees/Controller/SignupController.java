package Deloitte.Eomployees.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import Deloitte.Eomployees.Business.SignUpForm;
import Deloitte.Eomployees.Repository.UserRepository;
import Deloitte.Eomployees.Services.SecurityServiceImpl;
import Deloitte.Eomployees.Services.UserServiceImpl;

@Controller
public class SignupController {

	@Autowired
	private UserServiceImpl userService;
	@Autowired
	private SecurityServiceImpl securityService;
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/signup")
	public String getSignUpForm(Model model) {
		model.addAttribute("title","SIGN UP");
		model.addAttribute("registration",new SignUpForm());
		return "signup";
	}
	
	@PostMapping("/signup")
	public String postSignupForm(@Valid SignUpForm registration, BindingResult bindingResult,Model model) {
		
		if(bindingResult.hasErrors()) {
			System.out.println("Registration failed");
			model.addAttribute("title", "Please fill information correctly");
			model.addAttribute("registration",new SignUpForm());
			return "signup";
		}
		
		else {
			System.out.println("Registration starting");
			userService.save(registration);
			securityService.autologin(registration.getEmplNo(), registration.getPassword());
			model.addAttribute("title","Employee Dashboard");
			model.addAttribute("users",this.userRepo.findAll());
			return "dashboard";
		}
		
		
		
	}
}
