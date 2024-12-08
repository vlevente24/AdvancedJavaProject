package ppke.itk.theatre.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.controller.dto.TicketDTO;
import ppke.itk.theatre.domain.Ticket;

@Repository
@RequiredArgsConstructor
public class CustomUserRepository {

    //@PersistenceContext
    //EntityManager entityManager;

    UserRepository userRepository;
    //TODO

    public Ticket bookTicket(Integer userId, TicketDTO ticket) {
        //TODO
        return null;
    }

    public void cancelTicket(Integer userId, Integer ticketId) {
        //TODO
    }
}
