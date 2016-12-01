import pt.arquivo.httrack2arc.HTTrack2ArcConverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Created by ckha on 23-11-2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Date d = new Date();
            String destination = "C:/Users/ckha/Desktop/httracktoarc/httrackBigTest";
            if(!new File(destination).exists()){
                File f = new File(destination);
                f.mkdir();
            }
            HTTrack2ArcConverter htt = new HTTrack2ArcConverter(
                    "C:\\Users\\ckha\\Desktop\\httracktoarc\\ebeltoft.dk", destination, d);
            htt.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
