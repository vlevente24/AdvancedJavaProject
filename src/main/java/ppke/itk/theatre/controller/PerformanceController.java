package ppke.itk.theatre.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import ppke.itk.theatre.controller.dto.DetailedPerformanceDTO;
import ppke.itk.theatre.controller.dto.PerformanceDTO;
import ppke.itk.theatre.repository.PerformanceRepository;

import java.util.List;

@RestController
@RequestMapping("/performances")
@RequiredArgsConstructor
public class PerformanceController {

    private final PerformanceRepository performanceRepository;

    @GetMapping
    public List<PerformanceDTO> getPerformances(@RequestParam(required = false, defaultValue = "100") Integer limit, @RequestParam(required = false, defaultValue = "asc") String sort) {
        if ( !sort.equalsIgnoreCase("desc") && !sort.equalsIgnoreCase("asc") ) {
            throw new IllegalArgumentException("Invalid sorting param!!!");
        }
        var sortParam = sort.equalsIgnoreCase("asc") ? Sort.by(Sort.Direction.ASC, "date") : Sort.by(Sort.Direction.DESC,"date");
        return performanceRepository.findAll(PageRequest.of(0, limit, sortParam)).stream()
            .map(PerformanceDTO::fromPerformance)
            .toList();
    }

    @GetMapping("/drama/{drama_id}")
    public List<PerformanceDTO> getPerformancesById(@PathVariable("drama_id") Integer dramaId) {
        return performanceRepository.findByDrama_Id(dramaId).stream()
            .map(PerformanceDTO::fromPerformance)
            .toList();
    }

    @GetMapping("/{id}")
    public DetailedPerformanceDTO getPerformanceDetails(@PathVariable("id") Integer id) {
        return DetailedPerformanceDTO.fromPerformance(performanceRepository.findById(id).get());
    }
}
