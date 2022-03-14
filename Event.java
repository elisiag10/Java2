
public class Event {

    public int pricePerGuests;

    // Two fields that holds the high and low price per guest

    public final static int lowPricePerGuest = 32;
    public final static int highPricePerGuest = 35;

    // Public final static fields
    public final static int CUT_OFF_VALUE = 50;

    // three private fields
    private static String eventNumber;
    private static int numberOfGuests;
    public static int priceTotal = 0;

    // Add a contact phone number field
    public static String phoneNumber = "";
    public static String phoneNumberFinal = "";
    public static String formattedPhoneNumber = "";

    // CH8 integer field that holds an event type
    int eventType;
    String typeOutput;

    // CH8 Final String array that holds names of the types of events
    public final String[] typesOfEvents = { "wedding", "baptism", "birthday", "corporate", "other" };

    // three public get methods
    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumberOfGuest() {
        return numberOfGuests;
    }

    public String setEventNumber(String x) {
      if (x.length() > 4) {
            x = "A000";
        } else if (x.length() == 4) {
            if (!Character.isAlphabetic(x.charAt(0)) || !Character.isDigit(x.charAt(1))
                    || !Character.isDigit(x.charAt(2)) || !Character.isDigit(x.charAt(3))) {
            } 
        }
      return  eventNumber = x;
    }

    // *CH8 get and set methods for the int event type*
    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        int size = typesOfEvents.length;
        for (int x = 0; x < size; x++) {
            if (eventType > 5) {
                typeOutput = typesOfEvents[4];
            } else {
                typeOutput = typesOfEvents[eventType - 1];
            }
        }
        // return typeOutput;
    }

    // CH3**************************
    public void setGuests(int x) {
        if (x < 50) {
            pricePerGuests = lowPricePerGuest;
        } else {
            pricePerGuests = highPricePerGuest;
        }
    }

    public int priceTotal(int numberOfGuests) {
        priceTotal = pricePerGuests * numberOfGuests;
        return priceTotal;
    }

    // Add a set method for the contact phone number field
    public String getPhoneNumber(String x) {
        phoneNumber = x;
        setPhoneNumber(phoneNumber);
        return phoneNumber;
    }

    public static String setPhoneNumber(String x) {
     if (x.length() >= 10) {
     x = x;
     phoneNumberFinal =  x.replaceAll("[^a-zA-Z ]", "");
        } else {
      phoneNumberFinal = "000000000";
        }
        getPhone(phoneNumberFinal);
      
        return phoneNumberFinal;
    }

    // Format Phone number
    public static String getPhone(String x) {

        if (x.length() == 10) {
            formattedPhoneNumber = x.replaceAll("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        }else{
          formattedPhoneNumber = "000-000-0000";
        }
      System.out.println("Strange Code lives here " + formattedPhoneNumber);
        return formattedPhoneNumber;
    }

    // Add a new method named isLargeEvent()
    public boolean isLargeEvent(int x) {
        if (x >= CUT_OFF_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    // Display event details
    public void displayDetails(int x, String y) {
        System.out.println("\n");
        System.out.println("Event number: " + setEventNumber(y));
        System.out.println("Number of guests: " + x);
        System.out.println("The price per guests: " + pricePerGuests);
        System.out.println("Final price: $" + priceTotal(x));
        System.out.println("Is large event: " + isLargeEvent(x));
        System.out.println("Phone Number: " +  formattedPhoneNumber);
        System.out.println("Event Type: " + typeOutput);
        System.out.println("\n");
    }

}
