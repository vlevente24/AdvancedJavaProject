package ppke.itk.theatre.repository;

import org.springframework.stereotype.Repository;
import ppke.itk.theatre.domain.Performance;

import java.util.List;

@Repository
public class PerformanceRepository {
    public List<Performance> findAll() {
        return null;
    }

    public List<Performance> findByTitle(String title) {
        return null;
    }

    public Performance findById(Integer id) {
        return null;
    }
}
