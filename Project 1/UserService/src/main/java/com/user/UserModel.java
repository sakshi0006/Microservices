package com.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {

    private int userId;
    private String userName;
    private String userPhoneNumber;
    private ProfileModel profile;

}
