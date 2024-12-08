package ppke.itk.theatre.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ppke.itk.theatre.domain.Actor;
import ppke.itk.theatre.repository.ActorRepository;

@RestController
@RequiredArgsConstructor
public class ActorController {

    private final ActorRepository actorRepository;

    @GetMapping("/actors/{id}")
    public Actor getActorById(@PathVariable("id") Integer id) {
        return actorRepository.getActor(id);
    }
}
