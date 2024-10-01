package Test;

import java.io.FileReader;
import java.io.IOException;

public class RandomQ {
    public static void main(String[] args) {

    }




    public static StringBuilder readFile (String path){
        StringBuilder text = new StringBuilder();

        try {
            FileReader reader = new FileReader(path);
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
                text.append(character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;

    }


}
