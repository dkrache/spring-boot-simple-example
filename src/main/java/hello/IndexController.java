package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public void get() {
        System.out.println("OK pour le GET");
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public void post() {
        System.out.println("OK pour le POST");
    }
}
