import java.io.BufferedReader;
import java.io.FileReader;

public class File_Reader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(reader);
            String name = "";
            do {
                    name = br.readLine();
                    if (name != null) {
                        System.out.println(name);
                    }

            } while (name != null);

        }
        catch(Exception ex) {
            System.out.println("deu ruim");
        }
    }
}
