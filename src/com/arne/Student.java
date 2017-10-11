package com.arne;


public class Student {

    private String name;
    private String SSN;


    // Encapsulated variables:
    private String phone;
    private String city;
    private String state;

    private int accountBalance;

//    - Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
//    - Use encapsulation to set variables (phone, city, state)

    public Student(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        System.out.println("Student: " + name + ", email: " + generateEmail(name) + ", ID: " + generateID(SSN));
    }
    public Student(String name, String SSN, String phone, String city, String state) {
        this.name = name;
        this.SSN = SSN;
        System.out.println("Student: " + name + ", email: " + generateEmail(name) + ", ID: " + generateID(SSN));
    }

    public void checkBalance(){
        System.out.println("Balance is now " + accountBalance);
    }

    public void pay(int amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(amount + "$ successfully added to account.");
            checkBalance();
        } else {
            System.out.println(amount + " is an invalid deposit.");
        }
    }

    public void enroll() {
        if (accountBalance >= 10_000) {
            System.out.println(name + " successfully enrolled at the University");
        } else {
            System.out.println(name + " currently cannot afford enrollment.");
        }
    }

    private String generateID(String SSN) {
        String studentNumber;
        int random;
        int range = (9000 - 1000) + 1;
        random = (int) Math.round(Math.random() * range) + 1000;
        String randomID = String.valueOf(random);
        studentNumber = SSN.substring(7, 11) + randomID;
        return studentNumber;
    }

    private String generateEmail(String name) {
        String emailName = name.toLowerCase();
        emailName = emailName.replaceAll("\\s+", "_");
        return emailName + "@student.uni";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
