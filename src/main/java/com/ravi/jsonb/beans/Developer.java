package com.ravi.jsonb.beans;

public class Developer extends User {
    private String developerRole;

    public Developer() {

    }

    public String getDeveloperRole() {
        return developerRole;
    }

    public void setDeveloperRole(String developerRole) {
        this.developerRole = developerRole;
    }
}
