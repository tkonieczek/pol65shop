package p.sda.shop.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController{


    @GetMapping("/knight")
    //stary sposob
    //@RequestMapping(value = "/knight", method = RequestMethod.GET)
    public String getKnightData(Model model) {
        model.addAttribute("imie", "Marian");
        model.addAttribute("bron", "Miecz");
        return "knight_details";
    }

}
