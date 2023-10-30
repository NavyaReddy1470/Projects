package miniproject33;


	
	import java.util.Scanner;
	

	public class MiniProject {

		public static void main(String[] args)  {
			
			Scanner scanner = new Scanner(System.in);
			String ch;
			HospitalManagementSystem system = new HospitalManagementSystem();
			
			
			
			do{
			
				System.out.println("\n--- Hospital Management System ---");
		    	System.out.println("1. Add a patient");
				System.out.println("2. Add a doctor");
				System.out.println("3. Display all patients");
				System.out.println("4. Display all doctors");
				System.out.println("5. Update Doctors");
				System.out.println("6. Update Patients");
				System.out.println("7. Search Patients");
				System.out.println("8. Search Doctors");
				System.out.println("9. generate Patient Report");
				System.out.println("10. Book Appointment");
				System.out.println("11.delete patient");
				System.out.println("0. exit");
				System.out.println("----------------------------------------");

				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline character

				switch (choice) {
				case 1:
					system.addPatient();
					break;
				case 2:
					system.addDoctor();
					break;
				case 3:
					system.displayPatients();
					break;
				case 4:
					system.displayDoctors();
					break;
				case 5:
					System.out.print("Enter the name of the doctor to update: ");
					String doctorToUpdate = scanner.nextLine();
					system.updateDoctor(doctorToUpdate);
					break;
				case 6:
					System.out.print("Enter the name of the patient to update: ");
					String patientToUpdate = scanner.nextLine();
					system.updatePatient(patientToUpdate);
					break;
				case 7:
					System.out.print("Enter the name of the patient to search: ");
					String patientToSearch = scanner.nextLine();
					system.searchPatient(patientToSearch);
					break;
				case 8:
					System.out.print("Enter the name of the doctor to search: ");
					String doctorToSearch = scanner.nextLine();
					system.searchDoctor(doctorToSearch);
					break;
				case 9:
					System.out.println("Enter the name of the patient to generate the report: ");
					String patientToGenerate = scanner.nextLine();
					system.generatePatientReport(patientToGenerate);
					break;
				case 10:
					System.out.println("Enter the name of the patient to book appointment : ");
					String appointmentBook = scanner.nextLine();
					System.out.println("Enter the name of the doctor to book appointment : ");
					String appointmentBook2= scanner.nextLine();
					System.out.println("Enter the date  to book appointment : ");
					String date=scanner.nextLine();	
					System.out.println("\t\t\t\tAppointment boooked successfully!!!");
					system.bookAppointment(appointmentBook);
					system.bookAppointment1(appointmentBook2);
					System.out.println("\t\t\t\t\tDate:"+date);
					break;
				case 11:
					System.out.println("Enter the name of the patient: ");
					String s=scanner.nextLine();
				
					system.deletePatientByName(s);
					
					break;
				case 0:
					System.out.println("Exiting...Thankyou");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
				System.out.println("====================================================================");

				
System.out.println("Do you want to continue? (Y-Yes / N-No)");
				 ch=scanner.next();
				
}while(ch.equals("Y")||ch.equals("y"));
				
			System.out.println("====================================================================");

			System.out.println("Bye....");

				System.out.println("====================================================================");


			}
		}
		
		
	

