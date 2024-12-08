package ppke.itk.theatre.domain;

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

    //jsonbackreference
    private Performance performance;

    private String roleName;

}
