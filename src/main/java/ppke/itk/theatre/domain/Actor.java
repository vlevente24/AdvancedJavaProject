package ppke.itk.theatre.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    private Integer id;

    private String name;

    private String bio;

    private String imagePath;
}
