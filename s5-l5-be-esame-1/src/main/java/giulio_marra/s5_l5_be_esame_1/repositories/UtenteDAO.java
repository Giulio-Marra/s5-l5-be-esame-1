package giulio_marra.s5_l5_be_esame_1.repositories;

import giulio_marra.s5_l5_be_esame_1.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {
    boolean existsByEmail(String email);

    Optional<Utente> findByEmail(String email);
}
