package mk.finki.ukim.example.bazikosarkarskafed.web;

import mk.finki.ukim.example.bazikosarkarskafed.service.GameCoachesService;
import mk.finki.ukim.example.bazikosarkarskafed.service.GamePlayersService;
import mk.finki.ukim.example.bazikosarkarskafed.service.GameRefsService;
import mk.finki.ukim.example.bazikosarkarskafed.service.GamesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/games")
public class GamesController {
   private final GamesService gamesService;
   private final GamePlayersService gamePlayersService;
   private final GameCoachesService gameCoachesService;
   private final GameRefsService gameRefsService;

    public GamesController(GamesService gamesService, GamePlayersService gamePlayersService, GameCoachesService gameCoachesService, GameRefsService gameRefsService) {
        this.gamesService = gamesService;
        this.gamePlayersService = gamePlayersService;
        this.gameCoachesService = gameCoachesService;
        this.gameRefsService = gameRefsService;
    }

    @GetMapping
    public String getGamesPage(Model model){
        model.addAttribute("listOfGames",gamesService.listAll());
        return "games";
    }
//    @GetMapping(value = "/info")
//    public String getGameInfoPage() {
//        return "gamesIngo";
//    }
    @GetMapping(value = "/info/{id}")
    public String getGameInfo(@PathVariable Integer id,Model model) {
        model.addAttribute("gamePlayers",gamePlayersService.listByGameId(id));
        model.addAttribute("gameCoaches",gameCoachesService.listByGameId(id));
        model.addAttribute("refGames",gameRefsService.listByGameId(id));
        return "gamesInfo";
    }

}
