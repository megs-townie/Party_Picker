class Friend extends Person{

    private String foodToBring;

    public Friend(String firstName, boolean isInvited, String foodToBring){
        super(firstName, "", isInvited);
        this.foodToBring = foodToBring;
    }

    public String toString(){
        String invitedText = isInvited()? "They are invited to the party." : "They are not invited to the Party.";
        return getFullName() + "is bringing " + foodToBring +". " + invitedText;
    }
}
