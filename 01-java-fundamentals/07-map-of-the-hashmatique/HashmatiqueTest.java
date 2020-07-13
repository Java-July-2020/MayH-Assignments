import java.util.HashMap;
import java.util.Set;


public class HashmatiqueTest {
    public static void main (final String args[]) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Red", "Easy as knowing all the words to your old favorite song");
        trackList.put("All Too Well", "Hey, you call me up again just to break me like a promise");
        trackList.put("The Lucky One", "Riviera views, And your lover in the foyer doesn't even know you");
        trackList.put("I Almost Do", " I hope you know that every time I don't I almost do");

        String favoriteLyrics = trackList.get("All Too Well");
        System.out.println(favoriteLyrics);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}