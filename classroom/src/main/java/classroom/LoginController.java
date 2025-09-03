package classroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/")
	public String showLoginPage() {
		return "index";
	}

	@GetMapping("/welcome")
	public String showWelcome() {
		return "welcome";
	}
}
