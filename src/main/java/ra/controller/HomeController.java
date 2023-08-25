package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.model.Persons;

import java.util.Date;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping
    public String home(Model model){
        model.addAttribute("name", "hùng hx");
        model.addAttribute("age", 20);
        model.addAttribute("sex", false);
        model.addAttribute("html", "<h2>Heading 2</h2><p>Đâ là đoạn văn bản</p>");
        model.addAttribute("today",new Date());
        model.addAttribute("avatar","kim-sejeong.jpg");
        model.addAttribute("person",new Persons(1,"Hùng hx",24));

        return "home";
    }
    @GetMapping("/product")
    public  String product(){
        return "product";
    }
}
