package com.ravi.jsonb.beans;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbNillable;
import javax.json.bind.annotation.JsonbNumberFormat;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonbNillable
public class User {

    private int userId;
    private String firstName;
    private String lastName;
    @JsonbDateFormat("dd/MM/yyyy")
    private LocalDateTime dateOfBirth;

    @JsonbNumberFormat(value = "00.00", locale = "en-us")
    private BigDecimal annualSalary;

    public User(int userId, String firstName, String lastName, LocalDateTime dateOfBirth, BigDecimal annualSalary) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.annualSalary = annualSalary;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(BigDecimal annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", annualSalary=" + annualSalary +
                '}';
    }
}
