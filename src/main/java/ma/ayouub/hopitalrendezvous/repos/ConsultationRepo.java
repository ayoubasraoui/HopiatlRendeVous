package ma.ayouub.hopitalrendezvous.repos;

import ma.ayouub.hopitalrendezvous.Entities.Consultation;
import ma.ayouub.hopitalrendezvous.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository <Consultation,Long>  { // spring Data
}
