public class TimeConversion {
    public static void main(String[] args) {

    }
    public static String timeConversion(String time12){
        String time24 = "";
        int hour = Integer.parseInt(time12.substring(0,2));

        if(time12.charAt(8) == 'A'){
            if(hour == 12){
                hour = 0;
                String hour1 = Integer.toString(hour);
                time24 = hour1 + hour1 + time12.substring(2,8);
            }
            else{
                time24 = time12.substring(0,8);
            }
        }
        else{
            if(hour != 12){
                hour = hour + 12;
                String hour2 = Integer.toString(hour);
                time24 = hour2 + time12.substring(2,8);
            }
            else{
                time24 = time12.substring(0,8);
            }
        }

        return time24;
    }
}
