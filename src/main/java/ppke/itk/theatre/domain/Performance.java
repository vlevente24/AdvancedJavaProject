package ppke.itk.theatre.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Performance {

    private Integer id;

    private Integer dramaId;

    private String date;

    private String time;

    private String location;

    private Integer price;
}
