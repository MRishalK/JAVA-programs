import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecopy {
    public static void main(String[] args) throws IOException {
        File inf = new File("input.txt");
        File outf = new File("output.txt");
        FileReader in = new FileReader(inf);
        FileWriter out = new FileWriter(outf);
        try {
            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            out.flush();
            out.close();
            in.close();
            System.out.println("File copied successfully..");
        } catch (IOException e) {
            System.out.println("An error occurred" + e.getMessage());
        }
    }
}