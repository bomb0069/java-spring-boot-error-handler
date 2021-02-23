package pub.sck.java.springboot.example.ErrorHandler.solution2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pub.sck.java.springboot.example.ErrorHandler.solution1.ErrorResponse;

@RestController
@RequestMapping("/api/v2")
public class User2Controller {

    @GetMapping("/users/{id}")
    public User2Response getAllUser(@PathVariable int id) {
        if (id == 1)
            return new User2Response("Somebody No 1", 25);
        throw new RuntimeException("User not found");
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public Error2Response handleRuntimeException(RuntimeException exception) {
        return new Error2Response(exception.getMessage());
    }
}
