package ppke.itk.theatre.domain;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "users")
public class User {

    //@Column
    private Integer email;

    //@Column
    private String name;

    //@Column
    private String password;

    //@Column
    private UserType permission;

    @JsonManagedReference
    private List<Ticket> tickets;
}