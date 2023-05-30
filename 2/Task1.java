import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Russia");
        params.put("city", "Moscow");
        params.put("age", null);
        System.out.println(getQuery(params));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder string = new StringBuilder();
        String result = " ";
        if (params.isEmpty())
            return " ";
        else {
            for (Map.Entry<String, String> pair : params.entrySet()) {
                String key = pair.getKey();
                String value = pair.getValue();
                if (key == null) {
                    continue;
                } else if (value == null) {
                    continue;
                } else {
                    string.append(key + " = " + value + ";    ");
                }
            }

            if (string.length() > 5) {
                string.delete(string.length() - 5, string.length());
                result = string.toString().trim();
            }
            return result;
        }
    }
}