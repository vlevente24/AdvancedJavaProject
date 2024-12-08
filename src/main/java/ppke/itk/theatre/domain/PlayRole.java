package ppke.itk.theatre.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayRole {

    private Integer id;

    private Actor actor;

    @JsonBackReference
    private Performance performance;

    private String roleName;

}
