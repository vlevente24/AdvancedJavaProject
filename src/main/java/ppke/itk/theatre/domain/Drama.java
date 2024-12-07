package ppke.itk.theatre.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Drama {

    private Integer id;

    private String title;

    private String genre;

    private Integer duration;

    private String details;

    private Integer directorId;
}
