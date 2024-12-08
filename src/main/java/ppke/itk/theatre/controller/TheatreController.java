package ppke.itk.theatre.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
@RequiredArgsConstructor
public class TheatreController {

    @GetMapping(value = "/theatre", produces = "image/jpeg")
    public @ResponseBody byte[] getTheatreAsJpg() throws IOException {
        InputStream in = getClass().getResourceAsStream("/static/theatre.jpg");
        return in.readAllBytes();
    }
}
