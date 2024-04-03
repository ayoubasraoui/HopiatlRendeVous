package ma.ayouub.hopitalrendezvous.web;

import ma.ayouub.hopitalrendezvous.repos.PatientRepo;
import ma.ayouub.hopitalrendezvous.Entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // je viens de cree un controlleur qui permet de consulter La Liste des patient


public class PatientController {

    @Autowired // injct avec autowired

    private PatientRepo patientRepository;

    @GetMapping ("/patients") // ona le probleme des associations bidirectionnelle
    public List<Patient> patientList (){ // methode qui permet de consulter la liste de patient
        // pour accede cette methode en utilise la methode getMapping

        return patientRepository.findAll();
    }

}
