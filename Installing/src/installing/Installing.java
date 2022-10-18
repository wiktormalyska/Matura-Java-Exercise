package installing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Installing {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        String sciezka="C:\\Users\\wikim\\Documents\\InstallingAIBot";
        FileWriter pl = new FileWriter(sciezka+"\\tlumaczenia.txt");
        FileReader plr = new FileReader(sciezka+"\\tlumaczenia.txt");
        pl.write("olooo");
        pl.close();
        System.out.println(plr.read());
        
        
    }
}
