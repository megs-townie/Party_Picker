public class Person {

    //region Variables
    private String firstName;
    private String lastName;
    private boolean isInvited;

    //endregion

    //region Constructor
    public Person(String firstName, String lastName, boolean isInvited){
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }
    //endregion

    //region Getters and Setters
    public boolean isInvited() {
        return isInvited;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
