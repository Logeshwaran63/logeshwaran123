import java.util.HashMap;

public class program1 {

    public static void main(String[] args) {
        HashMap<String, String> credentials = new HashMap<String, String>();

        singUp singUp = new singUp();

        credentials.put("fname","Mr");
        credentials.put("lname","Automa");
        credentials.put("day","19");
        credentials.put("month", "Sep");
        credentials.put("year","1990");

        singUp.doAtumation(credentials);

    }
}
