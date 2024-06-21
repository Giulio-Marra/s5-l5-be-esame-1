package giulio_marra.s5_l5_be_esame_1.service;

import giulio_marra.s5_l5_be_esame_1.entities.Edificio;
import giulio_marra.s5_l5_be_esame_1.entities.Postazione;
import giulio_marra.s5_l5_be_esame_1.repositories.EdificioDAO;
import giulio_marra.s5_l5_be_esame_1.repositories.PostazioneDAO;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EdificioService {

    @Autowired
    private EdificioDAO edificioDAO;

    @Autowired
    private PostazioneDAO postazioneDAO;

    @Transactional
    public void saveEdificio(Edificio edificio) {
        if (edificioDAO.existsByNome(edificio.getNome())) {
            throw new EntityExistsException("L'edificio " + edificio.getNome() + " è già nel database");
        }

        for (Postazione postazione : edificio.getPostazioni()) {
            postazione.setEdificio(edificio);
        }

        edificioDAO.save(edificio);
        postazioneDAO.saveAll(edificio.getPostazioni());

        System.out.println("Edificio salvato con successo");
    }

    public Optional<Edificio> findEdificioByNome(String nome) {
        return edificioDAO.findByNome(nome);
    }
}
