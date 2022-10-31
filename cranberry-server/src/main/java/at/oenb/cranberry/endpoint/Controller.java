package at.oenb.cranberry.endpoint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @GetMapping("")
    public Information index() {
        log.debug("StatusController");
//        Observation.

        return new Information("info1", "info2");
    }






}
record Information (String info1, String info2) {

}



