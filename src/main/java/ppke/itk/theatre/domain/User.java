package ppke.itk.theatre.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "myusers")
public class User {

    @Id
    @Column(name = "email", nullable = false)
    private String email;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String permission;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Ticket> tickets;
}