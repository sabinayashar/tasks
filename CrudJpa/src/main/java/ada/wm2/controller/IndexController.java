package ada.wm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("welcomeText")
    String welcome;

    @RequestMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("welcome", welcome);
        return "index";
    }

    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }
}
