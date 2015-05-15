/**
 * Created by amalyarsky on 05.05.15.
 */
public class Welcome {
    public static void main(String[] args) {
        String[] greetings = new String[2];
        greetings[0] = "Welcome to Java";
        greetings[1] = "Second line to show";

        for(String g : greetings) {
            System.out.println(g);
        }
    }
}
