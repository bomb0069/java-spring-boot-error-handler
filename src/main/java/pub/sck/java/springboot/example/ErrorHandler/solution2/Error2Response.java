package pub.sck.java.springboot.example.ErrorHandler.solution2;

public class Error2Response {
    private String message;

    public Error2Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
