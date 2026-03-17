//     Console Based Ticket Booking System:
// Dynamic Ticket Status Updater

// Title: Update Ticket Availability Using Binary Inputs

// Description:
// You are given an initial list of ticket statuses using 0 (available) and 1 (booked).
// Your task is to:

// Continuously update the ticket status based on user input arrays

// Each iteration accepts inputs equal to the number of currently available tickets

// If input is 1, mark a ticket as booked

// If input is 0, leave it unchanged

// The process repeats until no tickets remain available.


import java.util.Scanner;
public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Number Of Tickets:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int bookedTickets = 0;
        int availableTickets = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                bookedTickets++;
            }
            else{
                availableTickets++;
            }
        }
        do {
            System.out.println("Booked Tickets "+bookedTickets);
            System.out.println("Available Tickets "+availableTickets);
            System.out.println("Balance Tickets ");
            int[] ar = new int[availableTickets];
            int index = 0;
            int temp = availableTickets;
            while(temp>0){
                ar[index++] = sc.nextInt();
                temp--;
            }
            for(int i=0;i<ar.length;i++){
                if(ar[i]==1){
                    bookedTickets++;
                    availableTickets--;
                }
            }
        }while(availableTickets>=1);
        System.out.println("Tickets fully Closed!");
    }   
}