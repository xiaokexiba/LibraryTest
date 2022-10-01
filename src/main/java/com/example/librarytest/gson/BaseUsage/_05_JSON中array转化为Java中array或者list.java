package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Department;
import com.example.librarytest.gson.Department2;
import com.example.librarytest.gson.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _05_JSON中array转化为Java中array或者list {
    public static void main(String[] args) {
        // 5.1、JSON array -->Java对象
        // 将 json数组反序列化为 Java对象数组：
        /**
         * [
         *     {
         *       "name": "Alex",
         *       "id": 1
         *     },
         *     {
         *       "name": "Brian",
         *       "id": 2
         *     },
         *     {
         *       "name": "Charles",
         *       "id": 3
         *     }
         * ]
         */
        String userJson = "[{'name': 'Alex','id': 1}, "
                + "{'name': 'Brian','id':2}, "
                + "{'name': 'Charles','id': 3}]";
        Gson gson = new Gson();
        User[] userArray = gson.fromJson(userJson, User[].class);
        for (User user : userArray) {
            System.out.println(user);
        }
        System.out.println("------------------------------------");

        // 5.2、JSON array-->List
        // 将 json数组反序列化为根–到 Java对象列表:
//        String userJson = "[{'name': 'Alex','id': 1}, " + "{'name': 'Brian','id':2}, " + "{'name': 'Charles','id': 3}]";
//        Gson gson = new Gson();
        java.lang.reflect.Type userListType = new TypeToken<ArrayList<User>>() {
        }.getType();
        ArrayList<User> userArrayList = gson.fromJson(userJson, userListType);
        for (User user : userArrayList) {
            System.out.println(user);
        }
        System.out.println("------------------------------------");

        // 5.3、JSON array-->成员变量
        // 如果 Json数组是非根对象，则 Gson可以将 JSON数组解析为成员变量。
        // 我们可以按通常的方式使用 fromJson()方法，将 json数组解析为所需的 Java数组或列表。
        /**
         * {
         *     "id"    : 1,
         *     "name"  : "HR",
         *     "users" : [
         *         {
         *           "name": "Alex",
         *           "id": 1
         *         },
         *         {
         *           "name": "Brian",
         *           "id": 2
         *         },
         *         {
         *           "name": "Charles",
         *           "id": 3
         *         }
         *     ]
         */
        // 5.3.1、数组类型成员变量
        String departmentJson = "{'id' : 1, "
                + "'name': 'HR',"
                + "'users' : ["
                + "{'name': 'Alex','id': 1}, "
                + "{'name': 'Brian','id':2}, "
                + "{'name': 'Charles','id': 3}]}";
//        Gson gson = new Gson();
        Department department = gson.fromJson(departmentJson, Department.class);
        System.out.println(department);
        System.out.println("------------------------------------");

        // 5.3.2、List类型成员变量
        // 将json数组反序列化为List类型成员变量。
//        String departmentJson = "{'id' : 1, "
//                + "'name': 'HR',"
//                + "'users' : ["
//                + "{'name': 'Alex','id': 1}, "
//                + "{'name': 'Brian','id':2}, "
//                + "{'name': 'Charles','id': 3}]}";
//        Gson gson = new Gson();
        Department2 department2 = gson.fromJson(departmentJson, Department2.class);
        System.out.println(department2);
    }
}
