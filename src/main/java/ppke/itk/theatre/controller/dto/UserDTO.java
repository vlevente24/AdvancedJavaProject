package ppke.itk.theatre.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ppke.itk.theatre.domain.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String email;
    private String name;
    private List<TicketDTO> tickets;

    public static UserDTO fromUser(User user) {
        return new UserDTO(
                user.getEmail(),
                user.getName(),
                user.getTickets().stream().map(TicketDTO::fromTicket).toList()
        );
    }
}
