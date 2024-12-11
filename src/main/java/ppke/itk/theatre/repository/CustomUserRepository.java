package ppke.itk.theatre.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.controller.dto.TicketDTO;
import ppke.itk.theatre.domain.Ticket;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CustomUserRepository {

    @PersistenceContext
    EntityManager entityManager;

    private final UserRepository ur;
    private final TicketRepository tr;
    private final PerformanceRepository pr;

    @Transactional
    public Ticket bookTicket(String userEmail, TicketDTO ticket) {
        if (ur.findByEmailIgnoreCase(userEmail).isEmpty()) {
            throw new IllegalArgumentException("No such user.");
        }
        if (pr.findById(ticket.getPerformance().getId()).isEmpty()) {
            throw new IllegalArgumentException("No such performance.");
        }
        if (ticket.getSeat() < 0 || ticket.getSeat() >= 500) {
            throw new IllegalArgumentException("Invalid seat number.");
        }
        if (!tr.findByPerformance_IdAndSeat(ticket.getPerformance().getId(),ticket.getSeat()).isEmpty()) {
            throw new IllegalArgumentException(String.format("Seat at row %d, column %d is already taken.", ticket.getSeat()/20+1, ticket.getSeat()%20+1));
        }

        Ticket t = new Ticket();
        t.setUser(ur.findByEmailIgnoreCase(userEmail).get());
        t.setPerformance(pr.findById(ticket.getPerformance().getId()).get());
        t.setSeat(entityManager.merge(ticket.getSeat()));
        entityManager.persist(t);
        return t;
    }

    @Transactional
    public void cancelTicket(String userEmail, Integer ticketId) {
        if (ur.findByEmailIgnoreCase(userEmail).isEmpty()) {
            throw new IllegalArgumentException("No such user.");
        }
        Optional<Ticket> tOpt = tr.findById(ticketId);
        if (tOpt.isEmpty()) {
            throw new IllegalArgumentException("No such ticket.");
        }
        entityManager.remove(tOpt.get());
    }
}
