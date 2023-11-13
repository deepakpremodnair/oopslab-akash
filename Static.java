import java.util.*;

class InternetUsers{
	static int count = 0;
	static int happyCustomers = 0;
	final static int MAXTIME = 2;
	String loginName;
	static void show(){
		System.out.println("number of internet users : "+ count);
		System.out.println("number of happy customers : "+ happyCustomers);
	}
	void compute(){
		System.out.println("Is customer happy (yes/no)");
		Scanner sc = new Scanner(System.in);
		String ans = sc.nextLine();
		if(ans.equals("yes")){
			happyCustomers++;
			System.out.println(loginName + " is a Happy customer"); 
		}
	}
	static{
		System.out.println("Let's start browsing");
		System.out.println("Max no of alloted hours = " + MAXTIME);
	}
	InternetUsers(){
		count++;
	}
}


public class Static{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            InternetUsers obj = new InternetUsers();
            System.out.println("Enter name : ");
            obj.loginName = sc.nextLine();
            obj.compute();
            System.out.println("Do you want to create another object? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equals("no")) {
                exit = true;
            }
        }
        InternetUsers.show();
	}
}
