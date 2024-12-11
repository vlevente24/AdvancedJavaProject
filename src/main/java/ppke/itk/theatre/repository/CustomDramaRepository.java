package ppke.itk.theatre.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.controller.dto.DramaDTO;
import ppke.itk.theatre.domain.Drama;

import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CustomDramaRepository {

    @PersistenceContext
    EntityManager entityManager;

    private final DramaRepository dr;
    private final ActorRepository ar;

    @Transactional
    public Drama saveDrama(DramaDTO dramaDTO) {
        if (ar.findById(dramaDTO.getDirectorId()).isEmpty()) {
            throw new NoSuchElementException(String.format("No director found with id %d", dramaDTO.getDirectorId()));
        }
        Drama drama;
        Optional<Drama> dramaOpt = dr.findById(dramaDTO.getId());
        if (dramaOpt.isPresent()) {
            drama = dramaOpt.get();
            drama.setTitle(entityManager.merge(dramaDTO.getTitle()));
            drama.setGenre(entityManager.merge(dramaDTO.getGenre()));
            drama.setDuration(entityManager.merge(dramaDTO.getDuration()));
            drama.setImagePath(entityManager.merge(dramaDTO.getImagePath()));
            drama.setDirector(ar.findById(dramaDTO.getDirectorId()).get());
            dr.saveAndFlush(drama);
        } else {
            drama = new Drama();
            drama.setTitle(entityManager.merge(dramaDTO.getTitle()));
            drama.setGenre(entityManager.merge(dramaDTO.getGenre()));
            drama.setDuration(entityManager.merge(dramaDTO.getDuration()));
            drama.setImagePath(entityManager.merge(dramaDTO.getImagePath()));
            drama.setDirector(ar.findById(dramaDTO.getDirectorId()).get());
            entityManager.persist(drama);
        }
        return drama;
    }

    @Transactional
    public void deleteDrama(Integer id) {
        Optional<Drama> drama = dr.findById(id);
        if (drama.isEmpty()) {
            throw new NoSuchElementException(String.format("No drama found with id %d", id));
        }
        entityManager.remove(drama.get());
    }
}
