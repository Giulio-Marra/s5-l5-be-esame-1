package giulio_marra.s5_l5_be_esame_1.repositories;

import giulio_marra.s5_l5_be_esame_1.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EdificioDAO extends JpaRepository<Edificio, Long> {
    boolean existsByNome(String nome);

    Optional<Edificio> findByNome(String nome);
}
