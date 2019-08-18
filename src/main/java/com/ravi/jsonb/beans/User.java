package com.ravi.jsonb.beans;

import javax.json.bind.annotation.JsonbNumberFormat;
import java.math.BigDecimal;
import java.time.LocalDate;

//@JsonbNillable-  moved to global config using jsonbConfig.withNullValues(true);
//@JsonbPropertyOrder(PropertyOrderStrategy.ANY) - moved to global using         jsonbConfig.withPropertyOrderStrategy(PropertyOrderStrategy.ANY);
public class User {

    // @JsonbTransient- to remove this property from json when deserialization
    private int userId;
    private String firstName;
    private String lastName;
    //@JsonbDateFormat("dd/MM/yyyy") moved to global config using jsonbConfig.withDateFormat("dd/MM/yyyy", Locale.US);
    private LocalDate dateOfBirth;


    @JsonbNumberFormat(value = "00.00", locale = "en-us")
    private BigDecimal annualSalary;

    public User(int userId, String firstName, String lastName, LocalDate dateOfBirth, BigDecimal annualSalary) {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
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
