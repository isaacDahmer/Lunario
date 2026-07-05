package controller;

import br.com.lunario.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index() {
        return "/index.html";
    }

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public String loginInfo(@RequestParam("email") String email, @RequestParam("password") String password) {

        boolean validUser = loginService.login(email, password);

        if (validUser) {
            return "redirect:/main.html";
        } else {
            return "redirect:/Login?error=true";
        }
    }
}