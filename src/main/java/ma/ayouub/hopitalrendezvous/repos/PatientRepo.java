package ma.ayouub.hopitalrendezvous.repos;

import ma.ayouub.hopitalrendezvous.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository <Patient,Long>  { // spring Data
    Patient findByNom(String name);// pour chercher le patient par son nom
}
