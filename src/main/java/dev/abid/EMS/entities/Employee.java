package dev.abid.EMS.entities;

public class Employee {

    private String name;
    private String address;
    private String email;
    private String phno;
    private int salary;

    public Employee(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
