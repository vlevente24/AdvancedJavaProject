package ppke.itk.theatre.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ppke.itk.theatre.domain.PlayRole;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayRoleDTO {

        private Integer id;
        private String role;
        private Integer actorId;
        private String actorName;

        public static PlayRoleDTO fromPlayRole(PlayRole playRole) {
            return new PlayRoleDTO(
                    playRole.getId(),
                    playRole.getRoleName(),
                    playRole.getActor().getId(),
                    playRole.getActor().getName()
            );
        }
}
