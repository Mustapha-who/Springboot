package tn.esprit.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Repository.EquipeRepository;
import tn.esprit.entities.Equipe;


@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        equipe.setNbPointsTotal(0);
        equipe.setClassementGeneral(0);
        return er.save(equipe);
    }
}