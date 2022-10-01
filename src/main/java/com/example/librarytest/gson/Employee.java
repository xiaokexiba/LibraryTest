package com.example.librarytest.gson;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xoke
 * @date 2022/10/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    @Since(1.0)
    private String firstName;
    @Since(1.1)
    private String lastName;
    @Since(1.2)
    @SerializedName(value = "emailId", alternate = "emailAddress")
    private String email;
}
