//    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов

package Seminars.S05;

import java.util.HashMap;

public class Task01
{
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(123456, "Иванов");
        passportsAndNames.put(321456, "Васильев");
        passportsAndNames.put(234561, "Петрова");
        passportsAndNames.put(234432, "Иванов");
        passportsAndNames.put(654321, "Петрова");
        passportsAndNames.put(345678, "Иванов");
        for (var item : passportsAndNames.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item);
            }
        }
    }
}
