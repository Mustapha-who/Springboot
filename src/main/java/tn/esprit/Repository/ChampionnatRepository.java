package tn.esprit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Championnat;

@Repository
public interface ChampionnatRepository extends JpaRepository<Championnat,Long> {

}
