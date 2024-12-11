package ppke.itk.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.controller.dto.TicketDTO;
import ppke.itk.theatre.domain.Ticket;
import ppke.itk.theatre.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where upper(u.email) = upper(?1)")
    Optional<User> findByEmailIgnoreCase(String email);


}
