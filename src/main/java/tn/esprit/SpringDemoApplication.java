package tn.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.esprit.entities.Categorie;
import tn.esprit.entities.Course;

@EnableScheduling
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
   // Championnat c = new Championnat();
    //Course c = new Course.builder().emplacement("test").build();

}
