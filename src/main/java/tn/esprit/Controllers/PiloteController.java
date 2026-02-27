package tn.esprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Services.IPiloteService;
import tn.esprit.entities.Pilote;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pilote")
public class PiloteController {

    IPiloteService piloteService;

    @PostMapping("/ajouter-pilote")
    public String ajouterPilote(@RequestBody Pilote pilote) {
        return piloteService.ajouterPilote(pilote);
    }

}