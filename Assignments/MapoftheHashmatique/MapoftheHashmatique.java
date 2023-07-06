import java.util.Set;
import java.util.HashMap;
public class MapoftheHashmatique {
public static void main(String[] args) {
HashMap<String, String> trackList = new HashMap<String, String>();
trackList.put("Alarm", "You lay here with me");
trackList.put("Beliver", "First things first I'ma say all the words inside my head");
trackList.put("Demons", "When the days are cold And the cards all fold");
trackList.put("Warriors ", "As a child, you would wait And watch from far away");
// get the keys by using the keySet method

String m=trackList.get("Alarm");
System.out.println(m);


Set<String> keys = trackList.keySet();
for(String key : keys) {
System.out.println(key);
System.out.println(trackList.get(key));
}
}
}