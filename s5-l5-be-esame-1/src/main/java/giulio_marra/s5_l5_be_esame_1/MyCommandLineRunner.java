package giulio_marra.s5_l5_be_esame_1;

import giulio_marra.s5_l5_be_esame_1.entities.Edificio;
import giulio_marra.s5_l5_be_esame_1.entities.Utente;
import giulio_marra.s5_l5_be_esame_1.service.EdificioService;
import giulio_marra.s5_l5_be_esame_1.service.PostazioneService;
import giulio_marra.s5_l5_be_esame_1.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5L5BeEsame1Application.class);

        Edificio edificio1 = ctx.getBean("biblioteca", Edificio.class);
        Edificio edificio2 = ctx.getBean("palace", Edificio.class);
        Edificio edificio3 = ctx.getBean("grandBar", Edificio.class);
        //edificioService.saveEdificio(edificio3);

        Utente utente1 = new Utente("Giulio", "Marra", "giuliomarramail@gmail.com");
        Utente utente2 = new Utente("Mario", "DiDonato", "diablaopemailxx@gmail.com");
        Utente utente3 = new Utente("Alessia", "Marchese", "noneunamail@gmail.com");
        Utente utente5 = new Utente("Luigina", "Rossi", "questaeunamail@gmail.com");
        //utenteService.saveUtente(utente5);

        Optional<Utente> utente = utenteService.findByEmail("giuliomarramail@gmail.com");

        //Prenotazione prenotazione = new Prenotazione(utente,);


    }
}
