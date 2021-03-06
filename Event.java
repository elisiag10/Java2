public class Event {
    // Two public final static fields that hold the number of minutes in an hour and
    // the hourly rental rate
    final static int MINUTES_IN_AN_HOUR = 60;
    final int RENT_PER_HOUR = 40;
    final int ADDITIONAL_HOUR = 1;

    private String contractNumber;
    private int hoursRented;
    private int additionalMinutes;
    private int total;

    // Add a contact phone number field
    public static String phoneNumber = "";
    public static String phoneNumberFinal = "";
    public static String formattedPhoneNumber = "";

    // CH8 integer field that holds an event type
    int equipType;
    String typeOutput;

    // CH8 Final String array that holds names of the types of events
    public final String[] typesOfEquips = { "personal", "watercraft", "pontoon boat", "rowboat", "canoe", "kayak",
            "beach", " chair", "umbrella", "other" };

    // Two public set methods
    public String  setContractNumber(String x) {
    if (x.length() > 4) {
            x = "A000";
        } else if (x.length() == 4) {
            if (!Character.isAlphabetic(x.charAt(0)) || !Character.isDigit(x.charAt(1))
                    || !Character.isDigit(x.charAt(2)) || !Character.isDigit(x.charAt(3))) {
            }
        }
        return contractNumber = x;
    }

    public void setHoursAndMinutes(int x) {
        int user_input_time;
        if (x >= RENT_PER_HOUR) {
            user_input_time = x / MINUTES_IN_AN_HOUR;
            additionalMinutes = x % MINUTES_IN_AN_HOUR;
            total = (user_input_time * RENT_PER_HOUR + additionalMinutes) * ADDITIONAL_HOUR;
        } else {
            user_input_time = x / MINUTES_IN_AN_HOUR;
            additionalMinutes = x % MINUTES_IN_AN_HOUR;
            total = user_input_time * RENT_PER_HOUR + additionalMinutes;
        }

    }

    // Four public get methods that return the values in the four nonstatic fields.
    public String getcontractNumber() {
        return contractNumber;
    }

    public int gethoursRented() {
        return hoursRented;
    }

    public int getAdditionalMinutes() {
        return additionalMinutes;
    }

    // ########CH8 get and set methods for the int event type####
    public int getEquipType() {
        return equipType;
    }

    public void setEquipType(int equipType) {
        int size = typesOfEquips.length;
        for (int x = 0; x < size; x++) {
            if (equipType > 7) {
                typeOutput = typesOfEquips[9];
            } else {
                typeOutput = typesOfEquips[equipType - 1];
            }
        }
        // return typeOutput;
    }

    public String getPhoneNumber(String x) {
        phoneNumber = x;
        setPhoneNumber(phoneNumber);
        return phoneNumber;
    }

    public static String setPhoneNumber(String x) {
        if (x.length() == 10) {
            x.replaceAll("[^a-zA-Z ]", "");
            phoneNumberFinal = x;
        } else {
            x = "0000000000";
            phoneNumberFinal = x;
        }
        getPhone(phoneNumberFinal);
        return phoneNumberFinal;
    }

    // Format Phone number
    public static String getPhone(String x) {

        if (x.length() >= 10) {
            formattedPhoneNumber = x.replaceAll("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        }
     
        return formattedPhoneNumber;
    }

    public void displayDetails(String v) {
        System.out.println("\n");
        System.out.println("Contract Number: " + contractNumber);
        System.out.println("Type of equipment: " + typeOutput);
        System.out.println("Hourly Rate: " + RENT_PER_HOUR);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Total: " + total);
        System.out.println("Phone Number: " + formattedPhoneNumber);
        System.out.println("\n");
    }
}