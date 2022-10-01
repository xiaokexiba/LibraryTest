package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _04_漂亮地输出 {
    public static void main(String[] args) {
        // 4、漂亮地输出
        // 上述输出方式结果太过紧凑，不方便阅读，转化为传统 JSON格式方便进行阅读
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Employee employeeObj = new Employee(1, "Lokesh", "Gupta", "howtogoinjava@gmail.com");
        System.out.println(gson.toJson(employeeObj));
    }
}
