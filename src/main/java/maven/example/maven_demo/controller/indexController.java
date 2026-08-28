package maven.example.maven_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller // Annotation to indicate that this class serves the role of a controller in the Spring MVC framework
public class indexController {
    @GetMapping("/") // Mapping for the root URL ("/") to the Index() method
    public String Index() {
        return "forward:/index.html"; // Return the name of the HTML file to be rendered (index.html)
    }
}