package ppke.itk.theatre.repository;

import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Actor;

@Repository
public class ActorRepository {

    public Actor getActor() {
        return new Actor(1, "Lajos Zsuzsi", "Passio: Maria", "oninternet.hu");
    }
}
