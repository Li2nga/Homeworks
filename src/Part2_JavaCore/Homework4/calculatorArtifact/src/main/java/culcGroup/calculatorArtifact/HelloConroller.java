package culcGroup.calculatorArtifact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloConroller {

    private final HelloService helloService;

    public HelloConroller(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping()
    public String hello() {
        return helloService.hello();
    }

}
