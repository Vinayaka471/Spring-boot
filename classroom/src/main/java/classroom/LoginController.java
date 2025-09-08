package classroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // maps to login.jsp
    }

    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome"; // maps to welcome.jsp
    }
}
