package org.example;

public class Printer {

    private String welcomeString;

    public String getWelcomeString() {
        return welcomeString;
    }

    public void setWelcomeString(String welcomeString) {
        this.welcomeString = welcomeString;
    }

    public void print(){
        System.out.println(welcomeString);
    }
}
