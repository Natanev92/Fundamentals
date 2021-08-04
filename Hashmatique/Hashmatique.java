import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Spirit Bird", "give it time,do what we can...");
        trackMap.put("Uncle Remus", "can you see us, uncle remus...");
        trackMap.put("Come Together", "here come old flat top...");
        trackMap.put("Tom Sawyer", "A modern day wrrior Mean, mean stride..");

        String track = trackMap.get("Tom Sawyer");
        System.out.println(track);

        Set<String> allTracks = trackMap.keySet();
        for (String key : allTracks) {
            System.out.println(key+": "+trackMap.get(key));
        }

    }
}