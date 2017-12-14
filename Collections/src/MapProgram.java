import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independant language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("algol", "an algorithmic language");
        languages.put("BASIC", "Begineers All purposes Symoblic Instruction Code");

        System.out.println(languages.get("Java"));

        languages.remove("Python");
        System.out.println(languages.get("Python"));

    }
}
