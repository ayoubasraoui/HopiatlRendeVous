package ma.ayouub.hopitalrendezvous.service;

import ma.ayouub.hopitalrendezvous.Entities.Consultation;
import ma.ayouub.hopitalrendezvous.Entities.Medecin;
import ma.ayouub.hopitalrendezvous.Entities.Patient;
import ma.ayouub.hopitalrendezvous.Entities.RendezVous;



public interface IHospitalService {
    Patient savePatient (Patient patient) ;// vous avez besoin une methode qui permet ajt un patient
    Medecin saveMedecin (Medecin medecin) ;
    RendezVous saveRendezVous (RendezVous rendezVous);
    Consultation saveConsultation (Consultation consultation);
}
