package tn.esprit.Services;

import tn.esprit.Repository.EquipeRepository;
import tn.esprit.entities.Equipe;

public class EquipeService {

    EquipeRepository eq;


    public Equipe ajouterEquipe(Equipe equipe){
        return eq.save(equipe);
    };

}
