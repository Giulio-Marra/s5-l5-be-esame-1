package giulio_marra.s5_l5_be_esame_1.repositories;

import giulio_marra.s5_l5_be_esame_1.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {

}