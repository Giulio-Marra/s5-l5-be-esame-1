package giulio_marra.s5_l5_be_esame_1;

import giulio_marra.s5_l5_be_esame_1.entities.Edificio;
import giulio_marra.s5_l5_be_esame_1.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;

    @Autowired
    private AnnotationConfigApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5L5BeEsame1Application.class);

        Edificio edificio1 = ctx.getBean("biblioteca", Edificio.class);
        edificioService.saveEdificio(edificio1);


    }
}
