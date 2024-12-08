package ppke.itk.theatre.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ppke.itk.theatre.domain.Performance;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceDTO {

    private Integer id;
    private String dramaTitle;
    private Date date;
    private String location;
    private String directorName;

    public static PerformanceDTO fromPerformance(Performance performance) {
        return new PerformanceDTO(
                performance.getId(),
                performance.getDrama().getTitle(),
                performance.getDate(),
                performance.getLocation(),
                performance.getDrama().getDirector().getName()
        );
    }
}
