import java.util.Scanner;
class Main {

  
  public static void main(String[] args) {
    final int SIZE = 3; 
    Event[] event = new Event[SIZE];
    Scanner myObj = new Scanner(System.in); 
    
    for(int i = 0; i < event.length; i++){
         System.out.println("Enter number of guests ");
          int num=Integer.parseInt(myObj.nextLine());

         System.out.println("Enter event number: ");
         String eveNum = myObj.nextLine();

        System.out.println("Enter event type: ");
         int eveType=Integer.parseInt(myObj.nextLine());

        System.out.println("Enter phone number: ");
         String evePhone =myObj.nextLine();
     
          event[i]=new Event();
          event[i].setGuests(num);
          event[i].setEventType(eveType);
          event[i].getPhoneNumber(evePhone);
          event[i].displayDetails(num,eveNum);
    }

}
}