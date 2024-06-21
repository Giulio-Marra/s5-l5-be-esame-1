package giulio_marra.s5_l5_be_esame_1.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "id_postazione")
    private Postazione postazione;

    private LocalDate giornoPrenotazione;

    public Prenotazione(Utente utente, Postazione postazione, LocalDate giornoPrenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.giornoPrenotazione = giornoPrenotazione;
    }


}
