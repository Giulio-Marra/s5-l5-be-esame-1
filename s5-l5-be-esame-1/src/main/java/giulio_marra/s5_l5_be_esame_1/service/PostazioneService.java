package giulio_marra.s5_l5_be_esame_1.service;

import giulio_marra.s5_l5_be_esame_1.repositories.EdificioDAO;
import giulio_marra.s5_l5_be_esame_1.repositories.PostazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneDAO postazioneDAO;

    @Autowired
    private EdificioDAO edificioDAO;

}
