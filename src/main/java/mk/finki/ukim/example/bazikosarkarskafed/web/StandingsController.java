package mk.finki.ukim.example.bazikosarkarskafed.web;

import mk.finki.ukim.example.bazikosarkarskafed.service.KlubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/standings")
public class StandingsController {

private final KlubService klubService;

    public StandingsController(KlubService klubService) {
        this.klubService = klubService;
    }
    @GetMapping
    public String showStandings(Model model){
        model.addAttribute("listClubs",klubService.showStandings());
        return "standings";

    }
}
