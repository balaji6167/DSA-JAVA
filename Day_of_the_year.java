// (leetcode 1154. Day of the Year
// Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

// Example 1:

// Input: date = "2019-01-09"
// Output: 9
// Explanation: Given date is the 9th day of the year in 2019.
// Example 2:

// Input: date = "2019-02-10"
// Output: 41
 

// Constraints:

// date.length == 10
// date[4] == date[7] == '-', and all other date[i]'s are digits
// date represents a calendar date between Jan 1st, 1900 and Dec 31st, 2019.

//using switch case:

public class Day_of_the_year {
    public int dayOfYear(String date) {
        String Year = date.substring(0,4);
        String Month = date.substring(5,7);
        String Date = date.substring(8,date.length());
        int leapOrNot = 0;
        int dayOfTheYear = 0;
        if((Integer.parseInt(Year)%4==0 && Integer.parseInt(Year)%100!=0) || Integer.parseInt(Year)%400==0) leapOrNot = 1;
        else leapOrNot = 0;
        switch(Month){
            case "01":
               dayOfTheYear += Integer.parseInt(Date);
               break;
            case "02":
               dayOfTheYear += Integer.parseInt(Date)+31;
               break;  
            case "03":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+59;
               break; 
            case "04":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+90;
               break; 
            case "05":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+120;
               break; 
            case "06":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+151;
               break; 
            case "07":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+181;
               break; 
            case "08":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+212;
               break; 
            case "09":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+243;
               break; 
            case "10":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+273;
               break; 
            case "11":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+304;
               break; 
            case "12":
               dayOfTheYear += Integer.parseInt(Date)+leapOrNot+334;
               break;                                
        }
        return dayOfTheYear;
    }
}