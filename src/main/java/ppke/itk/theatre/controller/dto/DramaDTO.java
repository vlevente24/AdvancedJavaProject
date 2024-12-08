package ppke.itk.theatre.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ppke.itk.theatre.domain.Drama;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DramaDTO {

    private Integer id;
    private String title;
    private String genre;
    private Integer duration;
    private String imagePath;
    private Integer directorId;

    public static DramaDTO fromDrama(Drama drama) {
        return new DramaDTO(
                drama.getId(),
                drama.getTitle(),
                drama.getGenre(),
                drama.getDuration(),
                drama.getImagePath(),
                drama.getDirector().getId()
        );
    }
}
