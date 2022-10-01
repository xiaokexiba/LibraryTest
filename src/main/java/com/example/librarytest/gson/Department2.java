package com.example.librarytest.gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xoke
 * @date 2022/10/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department2 {
    private long id;
    private String name;
    private List<User> users;
    //省略getter/setter、构造方法、toString方法
}
