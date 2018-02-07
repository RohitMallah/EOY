package Deloitte.Eomployees.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Deloitte.Eomployees.Repository.UserRepository;

@Controller
public class TooleHomeController {
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public String getToolHome(Model model) {
		model.addAttribute("title","Employee Dashboard");
		return "dashboard";
	}
	
	@GetMapping("/dashboard")
	public String getDashboard(Model model) {
		//model.addAttribute("title","Dashboard");
		model.addAttribute("users",this.userRepo.findAll());
		return "dashboard";
	}


}
