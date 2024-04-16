import java.util.ArrayList;
import java.util.List;

public class SILab1_1 {
    public static List<String> filterOddLengthStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.length() % 2 == 0) {
                result.add(s);
            }
        }
        return result;
    }


}