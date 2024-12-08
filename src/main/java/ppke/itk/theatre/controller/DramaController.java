package ppke.itk.theatre.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ppke.itk.theatre.controller.dto.DramaDTO;
import ppke.itk.theatre.domain.Drama;
import ppke.itk.theatre.repository.CustomDramaRepository;
import ppke.itk.theatre.repository.DramaRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DramaController {

    private final DramaRepository dramaRepository;
    private final CustomDramaRepository customDramaRepository;

    @GetMapping("/dramas")
    public List<DramaDTO> getDramas() {
        return dramaRepository.findAll().stream()
                .map(DramaDTO::fromDrama)
                .toList();
    }

    @GetMapping("/dramas/{id}")
    public DramaDTO getDramaById(@PathVariable("id") Integer id) {
        return DramaDTO.fromDrama(dramaRepository.getDrama(id).get());
    }

    @PostMapping("/dramas")
    public DramaDTO saveDrama(@RequestBody DramaDTO dramaDTO) {
        Drama drama = customDramaRepository.saveDrama(dramaDTO);
        return DramaDTO.fromDrama(drama);
    }

    @DeleteMapping("/dramas/{id}")
    public void deleteDrama(@PathVariable("id") Integer id) {
        customDramaRepository.deleteDrama(id);
    }

}
