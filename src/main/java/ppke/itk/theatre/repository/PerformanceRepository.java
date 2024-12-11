package ppke.itk.theatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Performance;

import java.util.List;
import java.util.Optional;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Integer> {

    @Override
    Optional<Performance> findById(Integer integer);

    @Override
    List<Performance> findAll();

    @Query("select p from Performance p where p.drama.id = ?1")
    List<Performance> findByDrama_Id(Integer id);





}
