public class Reformat_of_date {
    public String reformatDate(String date) {
        String Year = date.length()==13?date.substring(9):date.substring(8);
        String Month = date.length()==13?date.substring(5,8):date.substring(4,7);
        String Date = date.length()==13?date.substring(0,2):date.substring(0,1);
        StringBuilder sb = new StringBuilder();
        sb.append(Year).append("-");
        switch(Month){
            case "Jan":
               sb.append("01").append("-");
               break;
            case "Feb":
               sb.append("02").append("-");
               break;
            case "Mar":
               sb.append("03").append("-");
               break;
            case "Apr":
               sb.append("04").append("-");
               break;
            case "May":
               sb.append("05").append("-");
               break;
            case "Jun":
               sb.append("06").append("-");
               break;
            case "Jul":
               sb.append("07").append("-");
               break;
            case "Aug":
               sb.append("08").append("-");
               break;
            case "Sep":
               sb.append("09").append("-");
               break;
            case "Oct":
               sb.append("10").append("-");
               break;
            case "Nov":
               sb.append("11").append("-");
               break;
            case "Dec":
               sb.append("12").append("-");
               break;       
        }
        if(date.length()==13) sb.append(Date);
        else sb.append("0").append(Date);
        return sb.toString();
    }
}
