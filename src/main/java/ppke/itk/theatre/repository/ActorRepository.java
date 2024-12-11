package ppke.itk.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Actor;

import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Override
    Optional<Actor> findById(Integer id);

    /*public Actor getActor(Integer id) {
        return new Actor(id, "Lajos Zsuzsi", "Passio: Maria", "oninternet.hu");
    }*/
}
