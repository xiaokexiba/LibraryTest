package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 应用程序随着时间变化，模型类也随之变化。有时候更新/删除字段可能会被打断。
 * <p>
 * 所有这些更改都可以使用@Since注释进行标记，以跟踪模型类，
 * 在这些系统使用反序列化JSON数据进行交换时，与其他系统的应用程序交互不会中断。
 *
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _08_版本支持 {
    public static void main(String[] args) {
        // 8.1、@Since注解
        // 在 Gson中，可以使用 @Since注释维护同一对象的多个版本。
        // 可以在类，字段以及将来的方法中使用此注释。它采用单个参数 – ignoreVersionsAfter。
        //
        // 当我们为 Gson实例配置版本号 “M.N”时，所有标记有版本大于 M.N的类字段都将被忽略。
        // 例如，如果我们将Gson配置为版本号 “1.2”，则所有版本号更高的字段（例如1.3、1.4…）都将被忽略。
        /**
         * @Since(1.2)
         * private String email;
         */

        // 8.2、如何使用@Since注解编写版本化的类
        // 在 Employee类下面，我们对三个字段进行了版本控制，即 firstName，lastName和 email。

        // 8.3、创建具备版本支持的Gson实例
        // 要创建使用过@Since注解的Gson实例，需要使用GsonBuilder.setVersion()方法:
        Gson g1 = new GsonBuilder()
                .setVersion(1.1)
                .create();

        // 8.4、实例
        // 8.4.1、 具备版本支持的序列化
        // 让序列号以上的Employee对象序列化。
        Employee employeeObj = new Employee(1, "Lokesh", "Gupta", "howtogoinjava@gmail.com");
        Gson gson = new GsonBuilder()
                .setVersion(1.1)
                .setPrettyPrinting()
                .create();
        System.out.println(gson.toJson(employeeObj));

        // 8.4.2、具备版本支持的反序列化
        // 我们将JSON字符串反序列化为版本号为Employee的对象。
        String json = "{'id': 1001, "
                + "'firstName': 'Lokesh',"
                + "'lastName': 'Gupta',"
                + "'email': 'howtodoinjava@gmail.com'}";
//        Gson gson = new GsonBuilder()
//                .setVersion(1.1)
//                .setPrettyPrinting()
//                .create();
        Employee employeeObj1 = gson.fromJson(json, Employee.class);
        System.out.println(employeeObj);
    }
}
