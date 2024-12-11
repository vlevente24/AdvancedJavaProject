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

    @GetMapping("/{email}")
    public UserDTO getUserDataById(@PathVariable("email") String email) {
        return UserDTO.fromUser(userRepository.findByEmailIgnoreCase(email).get());
    }

    @PostMapping("/{user_email}/ticket")
    public TicketDTO bookTicket(@PathVariable("user_email") String userEmail, @RequestBody TicketDTO ticket) {
        return TicketDTO.fromTicket(customUserRepository.bookTicket(userEmail, ticket));
    }

    @DeleteMapping("/{user_email}/ticket/{ticket_id}")
    public void cancelTicket(@PathVariable("user_email") String userEmail, @PathVariable("ticket_id") Integer ticketId) {
        customUserRepository.cancelTicket(userEmail, ticketId);
    }
}
