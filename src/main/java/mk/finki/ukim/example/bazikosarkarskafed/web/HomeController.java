package mk.finki.ukim.example.bazikosarkarskafed.web;

import mk.finki.ukim.example.bazikosarkarskafed.model.Chovek;
import mk.finki.ukim.example.bazikosarkarskafed.model.Igrac;
import mk.finki.ukim.example.bazikosarkarskafed.model.Klub;
import mk.finki.ukim.example.bazikosarkarskafed.model.Sudija;
import mk.finki.ukim.example.bazikosarkarskafed.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final KlubService klubService;
    private final ClubPlayersService clubPlayersService;
    private final IgracService igracService;
    private final ChovekService chovekService;
    private final CoachesService coachesService;
    private final TrenerService trenerService;
    private final RefsService refsService;
    private final SudijaService sudijaService;

    public HomeController(KlubService klubService, ClubPlayersService clubPlayersService, IgracService igracService, ChovekService chovekService, CoachesService coachesService, TrenerService trenerService, RefsService refsService, SudijaService sudijaService) {
        this.klubService = klubService;
        this.clubPlayersService = clubPlayersService;
        this.igracService = igracService;
        this.chovekService = chovekService;
        this.coachesService = coachesService;
        this.trenerService = trenerService;
        this.refsService = refsService;
        this.sudijaService = sudijaService;
    }
    @GetMapping
    public String getHomePage(){
        return "home";
    }

    @GetMapping(value="/clubs")
    public String getClubsPage(Model model) {
        model.addAttribute("lista", klubService.findAll());
        return "clubs";
    }

    @GetMapping(value = "/clubs/addclub")
    public String getAddClubPage() {
        return "addclub";
    }

    @PostMapping(value = "/clubs/addclub")
    public String addClub(@RequestParam String clubname, @RequestParam String homecourt,
                          @RequestParam String adresa, @RequestParam String sponzor) {
        if (clubname.isEmpty() || homecourt.isEmpty())
            return "redirect:/home/clubs";
        Klub klub = new Klub(clubname, adresa, sponzor, homecourt);
        klubService.addClub(klub);
        return "redirect:/home/clubs";
    }
    @GetMapping(value="/players")
    public String getClubPLayersPage(Model model){
        model.addAttribute("listOfClubs",clubPlayersService.listAll());
        return "players";
    }
    @GetMapping ("/clubs/delete/{id}")
    public String deleteClub(@PathVariable Integer id){
        this.klubService.deleteClub(id);
        return "redirect:/home/clubs";
    }
    @GetMapping ("/players/delete/{id}")
    public String deletePlayer(@PathVariable String id){
        this.igracService.deletePlayer(id);
        return "redirect:/home/players";
    }

    @GetMapping(value = "/clubs/addplayer/{id}")
    public String getAddPlayerPage(@PathVariable Integer id,Model model) {
        model.addAttribute("idKlub",id);
        return "addplayer";
    }
    @PostMapping(value = "/clubs/addplayer")
    public String addPlayer(@RequestParam Integer idKlub,@RequestParam String embg, @RequestParam String ime,
                          @RequestParam String prezime, @RequestParam Integer brojNaDres,
                            @RequestParam String pozicija) {
        if (embg.isEmpty() || ime.isEmpty())
            return "redirect:/home/players";
        Chovek chovekIg=new Chovek(embg,ime,prezime);
        chovekService.addChovek(chovekIg);
//        chovekIg=chovekService.getByEMBG(embg);
        igracService.addPlayer(embg,brojNaDres,pozicija,idKlub);
        return "redirect:/home/players";
    }
    @GetMapping(value = "/coaches")
    public String getCoachesPage(Model model){
        model.addAttribute("coachList",coachesService.listAll());
        return "coaches";
    }
    @GetMapping(value = "/clubs/addcoach/{id}")
    public String getAddCoachPage(@PathVariable Integer id,Model model) {
        model.addAttribute("idKlub",id);
        return "addcoach";
    }
    @PostMapping(value = "/clubs/addcoach")
    public String addCoach(@RequestParam Integer idKlub,@RequestParam String embg, @RequestParam String ime,
                            @RequestParam String prezime, @RequestParam String tip) {
        if (embg.isEmpty() || ime.isEmpty())
            return "redirect:/home/coaches";
        Chovek chovekIg=new Chovek(embg,ime,prezime);
        chovekService.addChovek(chovekIg);
        chovekIg=chovekService.getByEMBG(embg);
        trenerService.addCoach(embg,tip,idKlub);
        return "redirect:/home/coaches";
    }
    @GetMapping(value = "/coaches/delete/{id}")
    public String deleteCoach(@PathVariable String id){
        this.trenerService.deleteCoach(id);
        return "redirect:/home/coaches";
    }
    @GetMapping(value = "/refs")
    public String getRefsPage(Model model){
        model.addAttribute("refsList",refsService.listAll());
        return "refs";
    }
    @GetMapping(value = "/refs/delete/{id}")
    public String deleteRef(@PathVariable String id){
        this.sudijaService.deleteRef(id);
        return "redirect:/home/refs";
    }
    @GetMapping(value = "/refs/addref")
    public String getAddRefPage() {
        return "addref";
    }

    @PostMapping(value = "/refs/addref")
    public String addRef(@RequestParam String embg, @RequestParam String ime,
                          @RequestParam String prezime, @RequestParam Integer sudiskoNivo) {
        if (embg.isEmpty() || ime.isEmpty())
            return "redirect:/home/refs";
        Chovek chovekS=new Chovek(embg,ime,prezime);
        chovekService.addChovek(chovekS);
        sudijaService.addRef(embg,sudiskoNivo);
        return "redirect:/home/refs";
    }

}
