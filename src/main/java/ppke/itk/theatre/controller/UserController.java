package ppke.itk.theatre.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ppke.itk.theatre.controller.dto.TicketDTO;
import ppke.itk.theatre.controller.dto.UserDTO;
import ppke.itk.theatre.repository.CustomUserRepository;
import ppke.itk.theatre.repository.UserRepository;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final CustomUserRepository customUserRepository;

    @GetMapping("/{id}")
    public UserDTO getUserDataById(@PathVariable("id") Integer id) {
        return UserDTO.fromUser(userRepository.getUserDataById(id));
    }

    @PostMapping("/{user_id}/ticket")
    public TicketDTO bookTicket(@PathVariable("user_id") Integer userId, @RequestBody TicketDTO ticket) {
        return TicketDTO.fromTicket(customUserRepository.bookTicket(userId, ticket));
    }

    @DeleteMapping("/{user_id}/ticket/{ticket_id}")
    public void cancelTicket(@PathVariable("user_id") Integer userId,@PathVariable("ticket_id") Integer ticketId) {
        customUserRepository.cancelTicket(userId, ticketId);
    }
}
