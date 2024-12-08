package ppke.itk.theatre.repository;

import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Actor;

@Repository
public class ActorRepository {

    public Actor getActor(Integer id) {
        return new Actor(id, "Lajos Zsuzsi", "Passio: Maria", "oninternet.hu");
    }
}
