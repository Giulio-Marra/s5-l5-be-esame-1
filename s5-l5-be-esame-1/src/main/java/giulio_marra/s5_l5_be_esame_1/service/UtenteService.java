package giulio_marra.s5_l5_be_esame_1.service;

import giulio_marra.s5_l5_be_esame_1.entities.Utente;
import giulio_marra.s5_l5_be_esame_1.repositories.UtenteDAO;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UtenteService {

    @Autowired
    private UtenteDAO utenteDAO;

    @Transactional
    public void saveUtente(Utente utente) {
        if (utenteDAO.existsByEmail(utente.getEmail())) {
            throw new EntityExistsException("Un utente con l'email " + utente.getEmail() + " è già registrato");
        }

        utenteDAO.save(utente);
    }
}
