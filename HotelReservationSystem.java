import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        Course course = new Course("", 50); 
        
        final int SMALL_ROOM_COST_PER_DAY = 100;
        final int MEDIUM_ROOM_COST_PER_DAY = 150;
        final int BIG_ROOM_COST_PER_DAY = 200;

        
        System.out.println("SAN PEDRO LAGUNA HOTEL ");
        System.out.println();
        
        while (true) {
            System.out.println("1. Reserve a room");
            System.out.println("2. Check reservations");
            System.out.println("3. Cancel reservation");
            System.out.println("4. Update reservation info");
            System.out.println("5. Quit");
            
            System.out.println();
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println();
            
            if (choice == 1) {
            	
            	System.out.println("1. Small Room - $100");
            	System.out.println("2. Medium room - $150");
            	System.out.println("3. Big room - $200");
            	
            	System.out.println();
            	
            	System.out.print("Enter room number: ");
                int roomNumber = scanner.nextInt();

                int costPerDay;
                switch (roomNumber) {
                    case 1:
                        costPerDay = 100;
                        break;
                    case 2:
                        costPerDay = 150;
                        break;
                    case 3:
                        costPerDay = 200;
                        break;
                    default:
                        System.out.println("Invalid room number.");
                        continue;
                }
                
                System.out.print("Enter days stay: ");
                int dayStay = scanner.nextInt();
                scanner.nextLine();
            	
                final int totalCost = dayStay * costPerDay;
             
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter contact number: ");
                String strand = scanner.nextLine();

                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                
                Student student = new Student(name, id, strand, email, roomNumber, dayStay);
                student.setTotalCost(totalCost);
                
                System.out.println();
                
                if (course.enroll(student)) {
                    System.out.println("Enrollment successful. The total cost is $" + totalCost );
                    System.out.println();
                } 
                else {
                    System.out.println("Enrollment failed. Course is full.");
                    System.out.println();
                }
            } 
            
	            else if (choice == 2) {
	                System.out.println("Reservations: ");
	                System.out.println();
	                
	                for (Student student : course.getEnrolledStudents()) {
	                	
	                    if (student != null) {
	                    	System.out.println("Room number: " + student.getroomNumber());
	                        System.out.println("Day stay: " + student.dayStay());
	                        System.out.println("Name: " + student.getName());
	                        System.out.println("Id: " + student.getId());
	                        System.out.println("Strand: " + student.getStrand());
	                        System.out.println("Email: " + student.getEmail());
	                        System.out.println("Total cost: $" + student.getTotalCost());
	                        System.out.println();
	                        
	                    }
	                }
	            }
            
	            else if (choice == 3) {
	                System.out.print("Enter ID to delete: ");
	                int id = scanner.nextInt();
	                scanner.nextLine();
	                
		                if (course.deleteStudent(id)) {
		                    System.out.println("User ID " + id + " has been deleted.");
		                    System.out.println();
		                } 
		                
		                else {
		                    System.out.println("User ID " + id + " not found.");
		                    System.out.println();
		                }
		            } 
            
	            else if (choice == 4) {
	                System.out.print("Enter ID to update: ");
	                int id = scanner.nextInt();
	                scanner.nextLine();
	                
	                Student studentToUpdate = course.findStudentById(id);
                
	                if (studentToUpdate == null) {
	                    System.out.println("Student with ID " + id + " not found.");
	                    System.out.println();
	                } 
	                
	                else {
	                	System.out.println();
	                    System.out.println("Which field do you want to update?");
	                    System.out.println();
	                    System.out.println("1. Room number");
	                    System.out.println("2. Days stay");
	                    System.out.println("3. Name");
	                    System.out.println("4. ID");
	                    System.out.println("5. Contact number");
	                    System.out.println("6. Email");
	                    System.out.println();
	                    System.out.print("Enter your choice: ");
	                    int fieldChoice = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.println();
	                    
	                    switch (fieldChoice) {
		                    case 1:
		                    	System.out.print("Enter new room number: ");
		                        int newRoomNumber= scanner.nextInt();
		                        studentToUpdate.setroomNumber(newRoomNumber);
		                        System.out.println();
		                        break;
		                    case 2:
		                    	System.out.print("Enter new days stay: ");
		                        int newDayStay= scanner.nextInt();
		                        studentToUpdate.setdayStay(newDayStay);
		                        System.out.println();
		                        break;
	                        case 3:
	                            System.out.print("Enter new name: ");
	                            String newName = scanner.nextLine();
	                            studentToUpdate.setName(newName);
	                            System.out.println();
	                            break;
	                        case 4:
	                            System.out.print("Enter new ID: ");
	                            int newId = scanner.nextInt();
	                            scanner.nextLine();
	                            studentToUpdate.setId(newId);
	                            System.out.println();
	                            break;
	                        case 5:
	                            System.out.print("Enter new contact number: ");
	                            String newStrand = scanner.nextLine();
	                            studentToUpdate.setStrand(newStrand);
	                            System.out.println();
	                            break;
	                        case 6:
	                        	 System.out.print("Enter new email: ");
	                             String newEmail = scanner.nextLine();
	                             studentToUpdate.setEmail(newEmail);
	                             System.out.println();
	                             break;
	                        default:
	                            System.out.println("Invalid choice.");
	                    }
	                }
            } 
	            else if (choice == 5) {
            	System.out.print("Thank you for checking in!");
                break;
            } 
	            else {
                System.out.println("Invalid choice. Please try again.");
                System.out.println();
            }
        }
    }
}
