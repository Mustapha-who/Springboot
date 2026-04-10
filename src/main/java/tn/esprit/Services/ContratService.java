package tn.esprit.Services;


import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.Repository.EquipeRepository;
import tn.esprit.Repository.ContratRepository;
import tn.esprit.entities.Contrat;

import java.time.Year;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService{
    private final ContratRepository contratRepository;
    @Scheduled(fixedRate = 30000)
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe(){
        int anneeCourante = Year.now().getValue();
        List<Contrat> contrats = contratRepository.findAll();
        for (Contrat  c : contrats){
            int anneeContrat = Integer.parseInt(c.getAnnee());
            if (anneeContrat < anneeCourante){
                c.setArchived(true);
                contratRepository.save(c);
            }
        }
        List<Contrat> actifs = contratRepository.findByArchivedFalse();
        for (Contrat c :actifs){
            if (c.getEquipe() != null) {
                System.out.println("L'équipe " + c.getEquipe().getLibelle() +
                        " a un contrat actif de " + c.getMontant() +
                        " DT pour l'année " + c.getAnnee());
            }
        }
     }


}
