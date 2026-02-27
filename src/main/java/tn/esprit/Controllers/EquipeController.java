package tn.esprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Services.IEquipeService;
import tn.esprit.entities.Equipe;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {

    IEquipeService equipeService;

    @PostMapping("/ajouter-equipe")
    public Equipe ajouterEquipe(@RequestBody Equipe equipe) {
        return equipeService.ajouterEquipe(equipe);
    }
}