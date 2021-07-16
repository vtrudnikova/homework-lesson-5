package com.demoqa;

import com.github.javafaker.Faker;

public class TestData {

    static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String emailAddress = faker.internet().emailAddress();
    public static String gender = "Female";
    public static String mobilePhone = faker.phoneNumber().subscriberNumber(10);
    public static String day = "1";
    public static String month = "February";
    public static String year = "1995";
    public static String subject = "English";
    public static String hobbies = "Reading";
    public static String path = "test.png";
    public static String address = faker.address().fullAddress();
    public static String state = "NCR";
    public static String city = "Gurgaon";
}
