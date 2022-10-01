package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Employee;
import com.google.gson.Gson;

/**
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _03_JSON转化为Java对象 {
    public static void main(String[] args) {
        // 3、JSON-->Java对象
        // 在 Gson进行反序列指的是将 JSON字符串转换为 Java对象。
        // 为了进行反序列化，我们需要使用 Gson对象调用 fromJson()函数，
        // 并在解析完成后传递两个参数，即 JSON字符串和所需的 Java类型。
        String jsonString = "{'id':1001, 'firstName':'Lokesh', 'lastName':'Gupta', 'email':'howtodoinjava@gmail.com'}";
        Gson gson = new Gson();
        Employee empObject = gson.fromJson(jsonString, Employee.class);
        System.out.println(empObject);
    }
}
