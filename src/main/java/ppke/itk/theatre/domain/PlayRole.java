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

    private Integer actorId;

    private Integer performanceId;

    private String roleName;

}
