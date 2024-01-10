package DateConvertion;

public class dateConvert {
    public String convert (String dates){
        int year = Integer.parseInt(dates.substring(0, 4));
        int month = Integer.parseInt(dates.substring(5, 7));
        int day = Integer.parseInt(dates.substring(8));
        String months = "NA";
        if (month == 1) {
            months = "January";
        } else if (month == 2) {
            months = "February";
        } else if (month == 3) {
            months = "March";
        } else if (month == 4) {
            months = "April";
        } else if (month == 5) {
            months = "May";
        } else if (month == 6) {
            months = "June";
        } else if (month == 7) {
            months = "July";
        } else if (month == 8) {
            months = "August";
        } else if (month == 9) {
            months = "September";
        } else if (month == 10) {
            months = "October";
        } else if (month == 11) {
            months = "November";
        } else if (month == 12) {
            months = "December";
        }
        return "Full date representation: " + months + " " + day + ", " + year;
    }

}
