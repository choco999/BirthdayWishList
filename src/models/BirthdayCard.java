package models;

public class BirthdayCard {
    private String firstName;
    private String lastName;
    private int age;
    private String birthdayItem;

    public BirthdayCard(String firstName, String lastName, int age, String birthdayItem) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthdayItem = birthdayItem;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdayItem() {
        return birthdayItem;
    }

    public void setBirthdayItem(String birthdayItem) {
        this.birthdayItem = birthdayItem;
    }
}
