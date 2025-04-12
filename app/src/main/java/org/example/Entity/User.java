package org.example.Entity;

import java.util.List;

public class User {
    private String name;
    private String passowrd;
    private String hashPassword;
    private List<Ticket> ticketbooked;

    private String userId;

    public User(String passowrd, String name, String hashPassword, List<Ticket> ticketbooked, String userId) {
        this.passowrd = passowrd;
        this.name = name;
        this.hashPassword = hashPassword;
        this.ticketbooked = ticketbooked;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public List<Ticket> getTicketbooked() {
        return ticketbooked;
    }

    public void setTicketbooked(List<Ticket> ticketbooked) {
        this.ticketbooked = ticketbooked;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
