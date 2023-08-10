package task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of seats: ");
        int totalSeats = scanner.nextInt();
        
        BusReservationSystem busReservation = new BusReservationSystem(totalSeats);
        
        while (true) {
            System.out.println("\nBus Reservation System Menu:");
            System.out.println("1. Reserve Seat");
            System.out.println("2. Display Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the seat number you want to reserve: ");
                    int seatNumber = scanner.nextInt();
                    busReservation.reserveSeat(seatNumber);
                    break;
                case 2:
                    busReservation.displayAvailableSeats();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    // Don't close the scanner here
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        
    }
}

class BusReservationSystem {
    private boolean[] seats;
    
    public BusReservationSystem(int totalSeats) {
        seats = new boolean[totalSeats];
    }
    
    public void reserveSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seats.length && !seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " reserved successfully.");
        } else {
            System.out.println("Seat " + seatNumber + " is not available.");
        }
    }
    
    public void displayAvailableSeats() {
        System.out.println("Available seats:");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}