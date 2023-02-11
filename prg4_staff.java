import java.util.Scanner;

public class prg4_staff {
	String staffid, name;
	long phone;
	int salary;
	void read_data() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the StaffID: ");
		staffid = sc.next();
		System.out.println("Enter the Name\n");
		name = sc.next();
		System.out.println("Enter the Phone Number\n");
		phone = sc.nextLong();
		System.out.println("Enter the Salary\n");
		salary = sc.nextInt();
	}
	void display() {
		System.out.println("\t"+ staffid + "\t\t" + name + "\t\t" + phone + "\t\t" + salary);
		
	}
}

class Teaching extends prg4_staff{
	String domain;
	int pub;
	void read_data() {
		Scanner sc = new Scanner(System.in);
		super.read_data();
		System.out.println("Enter the Domain: ");
		domain = sc.next();
		System.out.println("Enter the number of publications: ");
		pub = sc.nextInt();
	}
	void display() {
		System.out.println("Domain = " + domain + "\n" + "Publications = " + pub);
		System.out.println("\tStaffID\t\tNAME\t\tPHONE NO\t\tSALARY");
		super.display();
	}
}

class Technical extends prg4_staff{
	String skills;
	void read_data(){
		Scanner sc = new Scanner(System.in);
		super.read_data();
		System.out.println("Enter the Skills: ");
		skills = sc.next();
	}
	void display() {
		System.out.println("Skills = " + skills);
		System.out.println("\tStaffID\t\tNAME\t\tPHONE NO\t\tSALARY");
		super.display();
	}
}
class Contract extends prg4_staff{
	int period;
	void read_data(){
		Scanner sc = new Scanner(System.in);
		super.read_data();
		System.out.println("Enter the Period: ");
		period = sc.nextInt();
	}
	void display() {
		System.out.println("Period = " + period);
		System.out.println("\tStaffID\t\tNAME\t\tPHONE NO\t\tSALARY");
		super.display();
	}
}

class StaffDemo{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1,n2,n3;
	System.out.println("Enter the number of Teaching Staff: ");
	n1 = sc.nextInt();
	Teaching T1[] = new Teaching[n1];
	
	for(int i = 0; i < n1; i++) {
		T1[i] = new Teaching();
		T1[i].read_data();
	}
	for(int i = 0; i < n1; i++) {
		T1[i].display();
	}
	System.out.println("Enter the number of Technical Staff: ");
	n2 = sc.nextInt();
	Technical T2[] = new Technical[n2];
	
	for(int i = 0; i < n2; i++) {
		T2[i] = new Technical();
		T2[i].read_data();
	}
	for(int i = 0; i < n2; i++) {
		T2[i].display();
	}
	System.out.println("Enter the number of Contract: ");
	n3 = sc.nextInt();
	Contract T3[] = new Contract[n3];
	
	for(int i = 0; i < n3; i++) {
		T3[i] = new Contract();
		T3[i].read_data();
	}
	for(int i = 0; i < n3; i++) {
		T3[i].display();
	}
	}	
}
