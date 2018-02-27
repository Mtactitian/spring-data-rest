package md.alexb.springdatarest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(updatable = false)
    private Timestamp created;

    private String name;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "zone_id")
    private Integer zoneId;

    @ManyToOne
    @JoinColumn(name = "organizer_id", referencedColumnName = "id")
    private Organizer organizer;
//    CREATED         TIMESTAMP    DEFAULT CURRENT_TIMESTAMP,
//    NAME            varchar(256),
//    DESCRIPTION     varchar(2048),
//    START_TIME      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    END_TIME        TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//    ZONE_ID         int,
//    STARTED         int,
//    ORGANIZER_ID    int                          NOT NULL,
//    VENUE_ID        int,
//    PRIMARY KEY (ID),
//    FOREIGN KEY (ORGANIZER_ID) REFERENCES ORGANIZER(ID) ON DELETE CASCADE,
//    FOREIGN KEY (VENUE_ID) REFERENCES VENUE(ID)
}
