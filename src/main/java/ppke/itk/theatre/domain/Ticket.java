package ppke.itk.theatre.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    //id, generatedvalue, column
    private Integer id;

    //jsonbackreference
    private User user;

    //manytoone
    private Performance performance;
}
