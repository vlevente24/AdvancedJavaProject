package ppke.itk.theatre.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ppke.itk.theatre.controller.dto.DramaDTO;
import ppke.itk.theatre.domain.Drama;
import ppke.itk.theatre.repository.CustomDramaRepository;
import ppke.itk.theatre.repository.DramaRepository;

import java.util.List;

@Tag(name = "Dramas")
@RestController
@RequestMapping("/dramas")
@RequiredArgsConstructor
public class DramaController {

    private final DramaRepository dramaRepository;
    private final CustomDramaRepository customDramaRepository;

    @Operation(summary = "Retrieve list of dramas")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of teams retrieved"),
            @ApiResponse(responseCode = "400", description = "Invalid url params supplied")
    })
    @GetMapping
    public List<DramaDTO> getDramas() {
        return dramaRepository.findAll().stream()
                .map(DramaDTO::fromDrama)
                .toList();
    }

    @GetMapping("/{id}")
    public DramaDTO getDramaById(@PathVariable("id") Integer id) {
        return DramaDTO.fromDrama(dramaRepository.getDrama(id).get());
    }

    @PostMapping
    public DramaDTO saveDrama(@RequestBody DramaDTO dramaDTO) {
        Drama drama = customDramaRepository.saveDrama(dramaDTO);
        return DramaDTO.fromDrama(drama);
    }

    @DeleteMapping("/{id}")
    public void deleteDrama(@PathVariable("id") Integer id) {
        customDramaRepository.deleteDrama(id);
    }

}
