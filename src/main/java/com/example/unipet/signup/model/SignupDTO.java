package com.example.unipet.signup.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignupDTO {
    private String email;
    private String password;
    private String name;
    private String havePet;
    private String petName;
    private String petBirthday;
    private String petGender;
    private String petType;
    private String petPicture;
    private String doNeutering;
    private String petColor;
    private String petChar;
}