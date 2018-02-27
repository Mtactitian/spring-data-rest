package md.alexb.springdatarest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp created;

    private String name;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "zone_id")
    private Integer zoneId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "organizer_id", referencedColumnName = "id")
    private Organizer organizer;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "venue_id", referencedColumnName = "id")
    private Venue venue;

    @OneToMany(mappedBy = "event", cascade = {CascadeType.PERSIST})
    private List<Participant> participants = new ArrayList<>();
}
