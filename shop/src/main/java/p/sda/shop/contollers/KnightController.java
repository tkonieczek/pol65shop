package p.sda.shop.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import p.sda.shop.model.Knight;
import p.sda.shop.services.KnightService;

import java.util.List;

@Controller
public class KnightController {

    @Autowired
    KnightService knightService;

    @GetMapping("/knight")
    //stary sposob
    //@RequestMapping(value = "/knight", method = RequestMethod.GET)
    public String getKnightData(Model model) {

        List<Knight> allKnights = knightService.getAllKnights();
        model.addAttribute("knights", allKnights);
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
