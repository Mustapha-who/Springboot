package tn.esprit.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Repository.ChampionnatRepository;
import tn.esprit.entities.Championnat;


@Service
@AllArgsConstructor
public class ChampionnatService implements IChampionnatService{
    ChampionnatRepository championnatRepository;

    @Override
    public Championnat ajouterChampionnat(Championnat championnat) {
        return championnatRepository.save(championnat);
    }
}
