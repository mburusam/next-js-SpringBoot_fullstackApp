package com.samSoln.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
