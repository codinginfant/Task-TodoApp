package codinginfant.Todo.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecommandationsController {
    @GetMapping
    public String helloWorld() {
        return "To-do Application !";
    }


}
