package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Employee;
import com.google.gson.Gson;

/**
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _02_Java对象转化为JSON {
    public static void main(String[] args) {
        // 2、Java对象-->JSON
        // 在 Gson中的序列化即将 Java对象转换为其 JSON表示形式。
        // 为了进行序列化，首先需要一个 Gson对象，该对象可以处理转换。
        // 接下来，需要调用函数 toJson()方法并传入 Employee对象。
        Employee emp = new Employee(1001, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        Gson gson = new Gson();
        String jsonString = gson.toJson(emp);
        System.out.println(jsonString);
    }
}
