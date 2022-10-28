package at.oenb.cranberry.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        log.debug("StatusController");
        return "Cranberry";
    }
}
