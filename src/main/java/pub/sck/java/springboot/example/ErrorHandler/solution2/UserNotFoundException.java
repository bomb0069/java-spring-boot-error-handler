package pub.sck.java.springboot.example.ErrorHandler.solution2;

public class UserNotFoundException extends RuntimeException {

    @Override
    public String getMessage(){
        return "User not found";
    }
}
