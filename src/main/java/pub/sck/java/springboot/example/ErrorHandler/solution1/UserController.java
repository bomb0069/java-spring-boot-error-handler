package pub.sck.java.springboot.example.ErrorHandler.solution1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("/users/{id}")
    public ResponseEntity getAllUser(@PathVariable int id) {
        try {
            if (id == 1)
                return ResponseEntity.status(HttpStatus.OK).body(new UserResponse("Somebody No 1", 25));
            throw new RuntimeException("User not found");
        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(exception.getMessage()));
        }
    }
}
