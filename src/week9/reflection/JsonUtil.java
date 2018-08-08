package week9.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JsonUtil {

    private JsonUtil(){}

    public static String toJson(Object o) throws IllegalAccessException {
        Class<?> clazz = o.getClass();

        StringBuilder sb = new StringBuilder("{");
        for (Field f : clazz.getDeclaredFields()) {
            f.setAccessible(true);
            Object value = f.get(o);
            sb.append("\"")
                .append(f.getName())
                .append("\":\"")
                .append(value)
                .append("\",");
        }
        sb.replace(sb.length() - 1, sb.length(), "").append("}");

        return sb.toString();
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T instance = clazz.newInstance();

        String[] split = json.replace("}", "").replace("{", "").split(",");
        Map<String, String> map = new HashMap<>();

        for (String s: split) {
            String[] params = s.replaceAll("\"", "").split(":");
            map.put(params[0], params[1]);
        }

        for (Field f : clazz.getDeclaredFields()) {

            f.setAccessible(true);
            String value = map.get(f.getName());
            if(f.getType() == String.class) {
                f.set(instance, value);
            } else if(f.getType() == int.class) {
                f.set(instance, Integer.parseInt(value));
            }

        }


        return instance;
    }

}
