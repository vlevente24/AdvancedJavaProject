package ppke.itk.theatre.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.controller.dto.DramaDTO;
import ppke.itk.theatre.domain.Drama;

@Repository
@RequiredArgsConstructor
public class CustomDramaRepository {

    //@PersistenceContext
    //EntityManager entityManager;

    DramaRepository dramaRepository;
    //TODO

    public Drama saveDrama(DramaDTO dramaDTO) {
        //TODO
        return null;
    }

    public void deleteDrama(Integer id) {
        //TODO
    }
}
