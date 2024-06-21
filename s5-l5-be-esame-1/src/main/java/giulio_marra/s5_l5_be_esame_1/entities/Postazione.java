package giulio_marra.s5_l5_be_esame_1.entities;

import giulio_marra.s5_l5_be_esame_1.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    private String descrizione;
    private int numero_occupanti;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    @ManyToOne
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> prenotazioni;

    public Postazione(String descrizione, int numero_occupanti, TipoPostazione tipo) {
        this.descrizione = descrizione;
        this.numero_occupanti = numero_occupanti;
        this.tipo = tipo;
    }
}