package Deloitte.Eomployees.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {
	
	@GetMapping(value="/logout")
	public String sessionLogout(Model model) {	
		
		return "signin";
	}
}
