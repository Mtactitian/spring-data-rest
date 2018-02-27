package md.alexb.springdatarest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    private String name;

    @Column(name = "created", updatable = false)
    private Timestamp timeStamp;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "organizer")
    private List<Event> events = new ArrayList<>();
}
