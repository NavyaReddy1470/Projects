package miniproject33;

public class Doctor {
	private int doctor_id;
	private String name;
	private String specialization;
	private long d_Contact;

	public Doctor(int doctor_id, String name, String specialization, long d_Contact) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.specialization = specialization;
		this.d_Contact = d_Contact;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getD_Contact() {
		return d_Contact;
	}

	public void setD_Contact(long d_Contact) {
		this.d_Contact = d_Contact;
	}

	@Override
	public String toString() {
		return "Doctor: " + "doctor_id=" + doctor_id + ", name=" + name + ", specialization=" + specialization
				+ ", d_Contact=" + d_Contact;

	}

}


