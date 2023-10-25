package culcGroup.calculatorArtifact;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {
    @Override
    public String hello() {
        return "Привет";
    }



}
