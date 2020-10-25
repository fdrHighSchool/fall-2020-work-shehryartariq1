import java.util.Scanner;

class Email {
    public static void main(String[] args) {
	
        email();
	}

    public static void email(){
		
		

		Scanner name1 = new Scanner (System.in);
		System.out.print("What is your first name? \n");
		String FirstName = name1.nextLine();
		System.out.println(FirstName.length());


        Scanner name2 = new Scanner (System.in);
        System.out.print("What is your Last name? \n");
        String LastName = name2.nextLine();
        System.out.println(LastName.length());

        Scanner ID1  = new Scanner (System.in);
        System.out.print("What is your ID? \n");
        String ID  = ID1.nextLine();
        System.out.println(ID.length());

        System.out.println(FirstName.substring(0,1) + (LastName.substring(0)) + (ID.substring(5)) + "@fdrhs.org");
		
	}
}


  




