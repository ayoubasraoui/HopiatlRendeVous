package ma.ayouub.hopitalrendezvous.service;

import jakarta.transaction.Transactional;
import ma.ayouub.hopitalrendezvous.repos.ConsultationRepo;
import ma.ayouub.hopitalrendezvous.repos.MedecinRepo;
import ma.ayouub.hopitalrendezvous.repos.PatientRepo;
import ma.ayouub.hopitalrendezvous.repos.RendezvousRepo;
import ma.ayouub.hopitalrendezvous.Entities.Consultation;
import ma.ayouub.hopitalrendezvous.Entities.Medecin;
import ma.ayouub.hopitalrendezvous.Entities.Patient;
import ma.ayouub.hopitalrendezvous.Entities.RendezVous;
import org.springframework.stereotype.Service;

import java.util.UUID;

//lA COUCHE METIER
@Service // les obj de la couche metier generalment utilise la notation service
@Transactional // toutes les methode soit generalment transactionnelle
public class HospitalServiceImpl implements IHospitalService { // une class qui  implement l interface
    private PatientRepo patientRepo ;
    private MedecinRepo medecinRepo;
    private RendezvousRepo rendezvousRepo;
    private ConsultationRepo consultationRepo;
    public HospitalServiceImpl(PatientRepo patientRepository, MedecinRepo medecinRepository, RendezvousRepo rendezVousRepository, ConsultationRepo consultationRepository) {
        this.patientRepo = patientRepository;
        this.medecinRepo = medecinRepository;
        this.rendezvousRepo = rendezVousRepository;
        this.consultationRepo = consultationRepository;
    }
    // tous ca en haut c est l injection des DPNDC
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }
    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }
    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString()); // (Universally Unique Identifiers ) genere une chaine de caracter aleatoire mais il est unique qu ils dependet la datte de systm genere a manier Aleatoire
        return rendezvousRepo.save(rendezVous);
    }
    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }
}
