package com.perisic.tomato.peripherals;

public class UserData {
    private String username;
    private String fullName;

    public UserData(String username, String fullName) {
        this.username = username;
        this.fullName = fullName;
        // Initializing other fields if needed
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

}
