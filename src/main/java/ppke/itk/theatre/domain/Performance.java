package ppke.itk.theatre.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Performance {

    private Integer id;

    private Drama drama;

    private Date date;

    private String location;

    private Integer price;

    @JsonManagedReference
    private List<PlayRole> roles;
}
