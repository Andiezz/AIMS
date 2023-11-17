package entity.db;


import entity.media.Media;
import java.util.ArrayList;

public class AIMSDB {
    public static ArrayList<Media> media = new ArrayList<Media>();

    public AIMSDB() {
        main();
    }

    public static void main() {
        Media media1 = new Media(1, "First Media", "test", 450, 15, "test");
        media.add(media1);
    }
}
