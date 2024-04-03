package ma.ayouub.hopitalrendezvous.repos;

import ma.ayouub.hopitalrendezvous.Entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepo extends JpaRepository <Medecin,Long>  { // spring Data
    Medecin findByNom(String name);
}
