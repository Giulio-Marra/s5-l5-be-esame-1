package giulio_marra.s5_l5_be_esame_1.service;

import giulio_marra.s5_l5_be_esame_1.entities.Edificio;
import giulio_marra.s5_l5_be_esame_1.repositories.EdificioDAO;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {

    @Autowired
    private EdificioDAO edificioDAO;

    public void saveEdificio(Edificio edificio) {
        if (edificioDAO.existsByNome(edificio.getNome())) {
            throw new EntityExistsException("L'edificio " + edificio.getNome() + " è già nel database");
        }

        edificioDAO.save(edificio);
    }
}
