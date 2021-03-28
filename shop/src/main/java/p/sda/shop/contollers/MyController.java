package p.sda.shop.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import p.sda.shop.model.Knight;

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

    @GetMapping("/newknight")
    public String getNewKnightForm(Model model) {
        model.addAttribute("knight", new Knight());
        return "new_knight_form";
    }

    @PostMapping("/newknight")
    public String addNewKnight(Knight knight) {
        String name = knight.getName();
        String weapn = knight.getWeapon();
        System.out.println(name + " " + weapn);
        return "redirect:/products/list";
    }
}
