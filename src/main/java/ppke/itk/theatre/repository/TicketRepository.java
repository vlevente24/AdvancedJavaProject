package ppke.itk.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Ticket;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query("select t from Ticket t where t.performance.id = ?1 and t.seat = ?2")
    List<Ticket> findByPerformance_IdAndSeat(Integer id, Integer seat);


    @Override
    Optional<Ticket> findById(Integer id);
}
