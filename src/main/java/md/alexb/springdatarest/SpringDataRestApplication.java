package md.alexb.springdatarest;

import md.alexb.springdatarest.model.Event;
import md.alexb.springdatarest.model.Organizer;
import md.alexb.springdatarest.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableJpaRepositories
public class SpringDataRestApplication implements CommandLineRunner {

    @Autowired
    private OrganizerRepository organizerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Organizer organizer = new Organizer();
        organizer.setId(115);
        organizer.setName("ENDAVA");
        organizer.setTimeStamp(Timestamp.valueOf(LocalDateTime.now()));

        Event event = new Event();
        event.setName("PARTY");
        event.setOrganizer(organizer);
        organizer.getEvents().add(event);

        organizerRepository.save(organizer);

    }
}
