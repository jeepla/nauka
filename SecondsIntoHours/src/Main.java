public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "invalid time";
        } else {
            return (seconds / 60) /60 +"h" +  (seconds / 60) % 60 + "m" + seconds % 60 + " s";

        }
    }

public static String getDurationString(int minutes, int seconds){
    if (minutes <0 ||  seconds <0 ||  seconds >59  ){
        return "invalid time";

    }
    else {

        return minutes / 60 + "h" + minutes % 60 + "m"  + seconds + " s";

    }

}

}