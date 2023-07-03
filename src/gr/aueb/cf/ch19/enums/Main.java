package gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        WeekDay weekDays;

        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay.getDay());
        }
    }
}
