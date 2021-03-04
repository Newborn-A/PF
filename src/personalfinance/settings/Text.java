package personalfinance.settings;

import java.util.HashMap;

final public class Text {
    private static HashMap<String, String> data = new HashMap();

    public static String get(String key){
        return data.get(key);
    }

    public static String [] getMonth(){

        String [] month = new String[12];
        month[0] = get("JANUARY");
        month[1] = get("FEBRUARY");
        month[2] = get("MARCH");
        month[3] = get("APRIL");
        month[4] = get("MAY");
        month[5] = get("JUNE");
        month[6] = get("JULY");
        month[7] = get("AUGUST");
        month[8] = get("SEPTEMBER");
        month[9] = get("OCTOBER");
        month[10] = get("NOVEMBER");
        month[11] = get("DECEMBER");
        return month;
    }

    public static void init() {
        data.put("PROGRAM_NAME", "Домашняя бухгалтерия" );
        data.put("MENU_FILE", "Файл" );
        data.put("MENU_EDIT", "Правка" );
        data.put("MENU_VIEW", "Вид" );
        data.put("MENU_HELP", "Помощь" );

        data.put("JANUARY", "Январь" );
        data.put("FEBRUARY", "Фераль" );
        data.put("MARCH", "Март" );
        data.put("APRIL", "Апрель" );
        data.put("MAY", "Май" );
        data.put("JUNE", "Июнь" );
        data.put("JULY", "Июль" );
        data.put("AUGUST", "Август" );
        data.put("SEPTEMBER", "Сентябрь" );
        data.put("OCTOBER", "Октябрь" );
        data.put("NOVEMBER", "Ноябрь" );
        data.put("DECEMBER", "Декабрь" );

    }
}
