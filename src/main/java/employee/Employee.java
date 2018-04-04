package employee;

public class Employee { // parent class

    private static int count = 0;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;

    //CONSTRUCTOR
    public Employee(String firstN, String lastN, String socialSN) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.socialSecurityNumber = socialSN;
        count++;

        //System.out.printf("Constructed employee %s %s | count=d%w%n", firstName, lastName, count);
    }


        //GETTERS BUT NO SETTERS
    public static int getCount() {
        return count;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public double earnings(){
        return 0.0;
    }


        //OVERRIDE AND toSTRING
        @Override
        public String toString() {
            return "Employee{" +
                    "firstName = '" + firstName + '\'' +
                    ", lastName = '" + lastName + '\'' +
                    '}';
        }


}
