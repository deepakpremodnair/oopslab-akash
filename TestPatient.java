import java.util.*;

class Patient
{
	int ID;
	int age;
	String bloodData;
	
	public Patient()
	{
		ID = 0;
		age = 0;
		bloodData = "NULL";
	}
	
	public Patient(int ID, int age, String bloodData)
	{
		this.ID = ID;
		this.age = age;
		this.bloodData = bloodData;
	} 
	
	public void getID()
	{
		System.out.println( "ID : " + ID);
	}
	
	public void getAge()
	{
		System.out.println( "Age : " + age);
	}
	
	public void getBloodData()
	{
		System.out.println( "Blood Data : " + bloodData);
	}
}


public class TestPatient
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int ID = input.nextInt();
		System.out.println("Enter Age : ");
		int age = input.nextInt();
		System.out.println("Enter Blood Data : ");
		String bloodData = input.next();
		Patient P1 = new Patient(ID, age, bloodData);
		P1.getID();
		P1.getAge();
		P1.getBloodData();
	
		
	}
}

