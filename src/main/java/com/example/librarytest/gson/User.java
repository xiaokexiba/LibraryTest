package com.example.librarytest.gson;

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
public class User {
    private long id;
    private String name;
}
