package ppke.itk.theatre.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ppke.itk.theatre.domain.Performance;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailedPerformanceDTO {

    private Integer id;
    private String title;
    private String genre;
    private Date date;
    private Integer duration;
    private String location;
    private String imagePath;
    private Integer price;
    private String description;
    private String director;
    private List<PlayRoleDTO> roles;

    public static DetailedPerformanceDTO fromPerformance(Performance p) {
        if (p.getRoles().isEmpty()) {
            return new DetailedPerformanceDTO(
                p.getId(),
                p.getDrama().getTitle(),
                p.getDrama().getGenre(),
                p.getDate(),
                p.getDrama().getDuration(),
                p.getLocation(),
                p.getDrama().getImagePath(),
                p.getPrice(),
                p.getDrama().getDescription(),
                p.getDrama().getDirector().getName(),
                List.of()
            );
        }
        return new DetailedPerformanceDTO(
            p.getId(),
            p.getDrama().getTitle(),
            p.getDrama().getGenre(),
            p.getDate(),
            p.getDrama().getDuration(),
            p.getLocation(),
            p.getDrama().getImagePath(),
            p.getPrice(),
            p.getDrama().getDescription(),
            p.getDrama().getDirector().getName(),
            p.getRoles().stream().map(PlayRoleDTO::fromPlayRole).toList()
        );
    }
}
