/* Сравнить скорость работы реплейса классов String и StringBuilder. */

public class Task2 {
    public static void main(String[] args) {
        String my_string = "Самолет построим сами, понесемся над лесами, понесемся над лесами, а потом вернемся к маме";

        String query = "лесами";
        double begin = System.currentTimeMillis();
        System.out.println(my_string);
        System.out.println(my_string.replaceAll(query, "полями"));
        double end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));

        begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(query) > 0) {
            sb.replace(sb.indexOf(query), sb.indexOf(query) + query.length(), "полями");
        }
        System.out.println(sb);
        end = System.currentTimeMillis();
        System.out.println("Время: " + (end - begin));
    }
}
