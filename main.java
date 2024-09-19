import java.io.BufferedReader;
import java.io.FileReader;

class main {
    public static void main(String[] args) {
        String filepath = "input.txt";
        try {
            BufferedReader ob = new BufferedReader(new FileReader(filepath));
            String sentence;
            int linenumber = 1;
            while ((sentence = ob.readLine()) != null) {
                System.out.println(linenumber + ":" + sentence);
                linenumber++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}