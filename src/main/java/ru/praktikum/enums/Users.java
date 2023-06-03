package ru.praktikum.enums;

public enum Users {

    Ivan("Иван", "Иванов", "Москва", "79257327296", "22.06.2023", "Привезите после 18:00", 1),
    Petr("Петр", "Петров", "Москва", "79257327297", "22.06.2023", "Привезите после 18:00", 2);


    Users(String firstName, String lastName, String address, String phoneNumber, String date, String comment, int numberOfButton) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.comment = comment;
        this.numberOfButton = numberOfButton;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
    public int numberOfButton() {
        return numberOfButton;
    }

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;
    private final String date;
    private final String comment;
    private final int numberOfButton;
}

