package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 在此Gson @SerializedName示例中，演示在序列化和反序列化过程中更改json和java对象之间的字段名称。
 *
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _09_更改Java对象和JSON的字段名映射 {
    public static void main(String[] args) {
        // 9.1、@SerializedName
        /**
         * 默认情况下，我们假设 Java模型类和 JSON将具有完全相同的字段名称。
         *
         * 但有时情况并非如此，某些名称有所不同。
         * 现在我们必须将 json中的 someName映射到Java类中的 someOtherName。
         * 这是 @SerializedName注解用到的地方。
         *
         * @SerializedName
         * 注解指示带注解的成员变量应使用提供的名称值作为其字段名称序列化为 JSON。
         * 此注解将覆盖可能一直在使用GsonBuilder类的任何 FieldNamingPolicy，包括默认的字段命名策略。
         *
         * 请注意，在此注解中指定的值必须是有效的JSON字段名称。
         *
         * 注解包含属性
         * --/value > 序列化或反序列化时所需的字段名称。
         * --/alternate > 反序列化时字段的备用名称。除了“值”属性外，它还提供了更多可能的名称。
         *                如果有多个字段匹配一个属性，则Gson将使用最后处理的那个。
         */

        // 9.2、序列化期时更改字段名称
        // 让我们以只有四个字段的 Employee类为例。
        // 我们要创建一个JSON，其中 “email”被写为字段名 “emailId”：在 Employee类中已进行添加

        // 让我们序列化一个Employee实例并查看JSON输出：
        Employee emp = new Employee(1001, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        System.out.println(gson.toJson(emp));
        System.out.println("---------------------------------");

        // 9.3、反序列化时更改字段名称
        /**
         * {
         *   "id": 1001,
         *   "firstName": "Lokesh",
         *   "lastName": "Gupta",
         *   "email": "howtodoinjava@gmail.com",
         *   "emailAddress": "admin@gmail.com"
         * }
         */
        String json = "{'id': 1001,"
                + "'firstName': 'Lokesh',"
                + "'lastName': 'Gupta',"
                + "'email': 'howtodoinjava@gmail.com',"
                + "'emailAddress': 'admin@gmail.com'}";
//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .create();
        Employee emp1 = gson.fromJson(json, Employee.class);
        System.out.println(emp1);
    }
}
