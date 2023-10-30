package miniproject33;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HospitalManagementSystem {
	private List<Patients> patients= new ArrayList<Patients>();
	private List<Doctor> doctors=new ArrayList<Doctor>();
	private Scanner scanner;

	public HospitalManagementSystem() {
		
		patients.add(new Patients(101,"Minnu",1,"M",91002,"Fever"));
		patients.add(new Patients(102,"Teja",22,"M",9776453,"Cavities"));
		patients.add(new Patients(103,"Sneha",23,"F",7676453,"Ear pain"));
		scanner = new Scanner(System.in);
		
		doctors.add(new Doctor(21,"Vyshnavi","pediatrician",6253));
		doctors.add(new Doctor(22,"Santhosh","Dentist",9765));
		doctors.add(new Doctor(23,"Ram","ENT",73484));

	}

	public void addPatient() {

		System.out.println("Enter patient id: ");
		int patientid = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter patient name: ");
		String patientName = scanner.nextLine();
		System.out.print("Enter patient age: ");
		int patientAge = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Enter patient gender: ");
		String patientGender = scanner.nextLine();
		System.out.println("Enter patient contact: ");
		long patientcontact = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter patient diagnosis");
		String patientdiagnosis = scanner.nextLine();

		Patients patient = new Patients(patientid, patientName, patientAge, patientGender, patientcontact,
				patientdiagnosis);
		patients.add(patient);
		System.out.println("Patient added successfully!");
	}

	public void addDoctor() {

		System.out.println("Enter doctor id: ");
		int doctorid = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter doctor name: ");
		String doctorName = scanner.nextLine();
		
		System.out.print("Enter doctor specialization: ");
		String doctorSpecialization = scanner.nextLine();
		System.out.println("Enter doctor contact: ");
		long doctorcontact = scanner.nextLong();

		Doctor doctor = new Doctor(doctorid, doctorName, doctorSpecialization, doctorcontact);
		doctors.add(doctor);
		System.out.println("Doctor added successfully!");
	}

	public void displayPatients() {
		if (patients.isEmpty()) {
			System.out.println("No patients found.");
		} else {
			System.out.println("Patient Details:");
			for (Patients patient : patients) {
				System.out.println(patient);
			}
		}
	}

	public void displayDoctors() {
		if (doctors.isEmpty()) {
			System.out.println("No doctors found.");
		} else {
			System.out.println("Doctor Details:");
			for (Doctor doctor : doctors) {
				System.out.println(doctor);
			}
		}
	}

	public void updatePatient(String name) {

		Patients patientToUpdate = null;
		for (Patients patient : patients) {
			if (patient.getName().equalsIgnoreCase(name)) {
				patientToUpdate = patient;
				break;
			}
		}

		if (patientToUpdate != null) {

			System.out.print("Enter updated age for " + patientToUpdate.getName() + ": ");
			int age = scanner.nextInt();
			scanner.nextLine(); 
			patientToUpdate.setAge(age);
			System.out.print("Enter updated gender for " + patientToUpdate.getName() + ": ");
			String gender = scanner.nextLine();
			patientToUpdate.setGender(gender);
			System.out.println("Enter updated contact for " + patientToUpdate.getName() + ": ");
			long contact = scanner.nextLong();
			patientToUpdate.setContact(contact);
			scanner.nextLine();
			System.out.println("Enter updated diagnosis for " + patientToUpdate.getName() + ": ");
			String diagnosis = scanner.nextLine();
			System.out.println("Patient details updated successfully!");
		} else {
			System.out.println("Patient not found.");
		}

	}

	public void updateDoctor(String name) {
		Doctor doctorToUpdate = null;
		for (Doctor doctor : doctors) {
			if (doctor.getName().equalsIgnoreCase(name)) {
				doctorToUpdate = doctor;
				break;
			}
		}

		if (doctorToUpdate != null) {

			System.out.print("Enter updated specialization for " + doctorToUpdate.getName() + ": ");
			String specialization = scanner.nextLine();
			doctorToUpdate.setSpecialization(specialization);
			System.out.println("Enter updated contact for " + doctorToUpdate.getName() + ": ");
			long contact = scanner.nextLong();
			doctorToUpdate.getD_Contact();
			System.out.println("Doctor details updated successfully!");
		} else {
			System.out.println("Doctor not found.");
		}
	}

	public void generatePatientReport(String name) {

		Patients patientToGenerate = null;
		for (Patients patient : patients) {
			if (patient.getName().equalsIgnoreCase(name)) {
				patientToGenerate = patient;
				break;
			}
		}
		if (patientToGenerate != null)
			for (Patients patient : patients) {
				if (patient.getName().equalsIgnoreCase(name)) {
					System.out.println("Patient Report for ID '" + patientToGenerate.getId() + "':");
					System.out.println("Name: " + patient.getName());
					System.out.println("Age: " + patient.getAge());
					System.out.println("Gender: " + patient.getGender());
					System.out.println("Diagnosis: " + patient.getDiagnosis());
					System.out.println();
					return;
				}
			}

		System.out.println("Patient not found!");
	}
	public void bookAppointment(String name) {
		Patients appointmentBook = null;
		for (Patients patient : patients) {
			if (patient.getName().equalsIgnoreCase(name)) {
				appointmentBook = patient;
				break;
			}
		}
		if(appointmentBook !=null) {
			for(Patients patient : patients) {
				if (patient.getName().equalsIgnoreCase(name)) {
				System.out.println("\t\t\t\t\tID:" + appointmentBook.getId() );
				System.out.println("\t\t\t\t\tName: " + patient.getName());
				System.out.println("\t\t\t\t\tAge: " + patient.getAge());
				System.out.println("\t\t\t\t\tGender: " + patient.getGender());
				System.out.println("\t\t\t\t\tDiagnosis: " + patient.getDiagnosis());
				//System.out.println();
				}
			}
		}
	}
		public void bookAppointment1(String name) {
		Doctor appointmentBook = null;
		for(Doctor doctor : doctors) {
		
			if (doctor.getName().equalsIgnoreCase(name)) {
				appointmentBook = doctor;
				break;
			}
			}
			
		
	
	
				for(Doctor doctor : doctors) {
					if (doctor.getName().equalsIgnoreCase(name)) {
						System.out.println("\t\t\t\t\tdoctor Name: " + doctor.getName());
						System.out.println("\t\t\t\t\tSpecialization: " + doctor.getSpecialization());
						//System.out.println();
				
					}
					
					}
				
				
		}
	
				
			
		
	

	public void searchPatient(String name) {
		List<Patients> matchingPatients = new ArrayList<>();
		for (Patients patient : patients) {
			if (patient.getName().equalsIgnoreCase(name)) {
				matchingPatients.add(patient);
			}
		}

		if (matchingPatients.isEmpty()) {
			System.out.println("No patients found with the given name.");
		} else {
			System.out.println("Matching Patients:");
			for (Patients patient : matchingPatients) {
				System.out.println(patient);
			}
		}
	}

	public void searchDoctor(String name) {
		List<Doctor> matchingDoctor = new ArrayList<>();
		for (Doctor doctor : doctors) {
			if (doctor.getName().equalsIgnoreCase(name)) {
				matchingDoctor.add(doctor);
			}
		}

		if (matchingDoctor.isEmpty()) {
			System.out.println("No doctors found with the given name.");
		} else {
			System.out.println("Matching Doctors:");
			for (Doctor doctor : matchingDoctor) {
				System.out.println(doctor);
			}
		}
	}
	public void deletePatientByName(String name) {
	    Patients patientToRemove = null;
	    for (Patients patient : patients) {
	        if (patient.getName().equalsIgnoreCase(name)) {
	            patientToRemove = patient;
	            break;
	        }
	    }

	    if (patientToRemove != null) {
	        patients.remove(patientToRemove);
	        System.out.println("Patient " + name + " has been deleted.");
	    } else {
	        System.out.println("No patient found with the given name.");
	    }
	}
}
	


