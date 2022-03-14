import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    final int SIZE = 7; 
    Event[] event = new Event[SIZE];
    Scanner myObj = new Scanner(System.in); 
    
       for(int i = 0; i < event.length; i++){
         System.out.println("Enter contract number: ");
        String contractNum = myObj.nextLine();

        System.out.println("Enter number of minutes of rental: ");
         int rentalMins = Integer.parseInt(myObj.nextLine());

          System.out.println("Enter number for rental equipment: ");
         int equipType = Integer.parseInt(myObj.nextLine());

        System.out.println("Enter phone number: ");
         String phoneNum = myObj.nextLine();
     
          event[i]=new Event();
          event[i].setContractNumber(contractNum);
          event[i].setEquipType(equipType);
          event[i].setHoursAndMinutes(rentalMins);
          event[i].getPhoneNumber(phoneNum);
          event[i].displayDetails(contractNum);
    }
      
    }
  }

