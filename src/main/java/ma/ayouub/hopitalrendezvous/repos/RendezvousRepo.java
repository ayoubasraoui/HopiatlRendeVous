package ma.ayouub.hopitalrendezvous.repos;

import ma.ayouub.hopitalrendezvous.Entities.Patient;
import ma.ayouub.hopitalrendezvous.Entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepo extends JpaRepository <RendezVous,String>  { // spring Data
}
