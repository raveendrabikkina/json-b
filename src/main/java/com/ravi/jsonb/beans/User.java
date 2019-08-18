package com.ravi.jsonb.beans;

import com.ravi.jsonb.adapter.CustomAdapter;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbNumberFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@JsonbNillable-  moved to global config using jsonbConfig.withNullValues(true);
//@JsonbPropertyOrder(PropertyOrderStrategy.ANY) - moved to global using         jsonbConfig.withPropertyOrderStrategy(PropertyOrderStrategy.ANY);
//@JsonbTypeAdapter(CustomAdapter.class)
public class User {

    // @JsonbTransient- to remove this property from json when deserialization
    private int userId;
    private String firstName;
    private String lastName;
    //@JsonbDateFormat("dd/MM/yyyy") moved to global config using jsonbConfig.withDateFormat("dd/MM/yyyy", Locale.US);
    private LocalDate dateOfBirth;
    private List<User> roles;

    @JsonbNumberFormat(value = "00.00", locale = "en-us")
    private BigDecimal annualSalary;

    public User(int userId, String firstName, String lastName, LocalDate dateOfBirth, BigDecimal annualSalary, List<User> roles) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.annualSalary = annualSalary;
        this.roles = roles;
    }

//    @JsonbCreator
//    public User(@JsonbProperty(value = "firstName_Custom") String firstName, @JsonbProperty(value = "lastName_Custom") String lastName, @JsonbProperty(value = "annualSalary_Custom") BigDecimal annualSalary, @JsonbProperty(value = "dateOfBirth_Custom") LocalDate dateOfBirth, @JsonbProperty(value = "userId_Custom") int userId) {
//        this.userId = userId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//        this.annualSalary = annualSalary;
//    }

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

    public List<User> getRoles() {
        return roles;
    }

    public void setRoles(List<User> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", roles=" + roles +
                ", annualSalary=" + annualSalary +
                '}';
    }
}
