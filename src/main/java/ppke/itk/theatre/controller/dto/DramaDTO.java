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
        if (drama.getDirector() == null || drama.getDirector().getId() == null) {
            return new DramaDTO(
                    drama.getId(),
                    drama.getTitle(),
                    drama.getGenre(),
                    drama.getDuration(),
                    drama.getImagePath(),
                    -1
            );
        }
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
