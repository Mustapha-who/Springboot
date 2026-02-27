package tn.esprit.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Repository.PiloteRepository;
import tn.esprit.entities.Pilote;


@Service
@RequiredArgsConstructor
public class PiloteService implements IPiloteService {

   final PiloteRepository piloteRepository;

    @Override
    public String ajouterPilote(Pilote pilote) {
        pilote.setClassementGeneral(0);
        pilote.setNbPointsTotal(0);
        piloteRepository.save(pilote);
        return "Pilote ajouté avec succès";
    }
}
