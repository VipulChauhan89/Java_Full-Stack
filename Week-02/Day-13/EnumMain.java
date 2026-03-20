enum Day {
    MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMain {
    public static void main(String[] args) {
        for(Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
