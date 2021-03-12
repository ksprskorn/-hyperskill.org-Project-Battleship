class TimeConstantsDemo {

    public static void main(String[] args) {
        TimeConstants tc = new TimeConstants();
        System.out.println(tc.getSecondsInDay());
        System.out.println(tc.getSecondsInWeek());
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    public static final int SECONDS_IN_DAY = 24 * SECONDS_IN_HOUR;
    public static final int SECONDS_IN_WEEK = 7 * SECONDS_IN_DAY;
    // write your code here


    public TimeConstants() {
    }

    public static int getSECOND() {
        return SECOND;
    }

    public static int getSecondsInMinute() {
        return SECONDS_IN_MINUTE;
    }

    public static int getSecondsInHour() {
        return SECONDS_IN_HOUR;
    }

    public static int getSecondsInDay() {
        return SECONDS_IN_DAY;
    }

    public static int getSecondsInWeek() {
        return SECONDS_IN_WEEK;
    }
}