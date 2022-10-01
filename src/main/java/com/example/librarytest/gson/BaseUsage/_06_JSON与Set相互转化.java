package com.example.librarytest.gson.BaseUsage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _06_JSON与Set相互转化 {
    public static void main(String[] args) {
        // 6.1、Set-->JSON
        // 使用 Gson.toJson()方法将 HashSet序列化为JSON:
        Set<String> userSet = new HashSet<String>();
        userSet.add("Alex");
        userSet.add("Brian");
        userSet.add("Charles");
        Gson gson = new Gson();
        String jsonString = gson.toJson(userSet);
        System.out.println(jsonString);
        System.out.println("------------------------------------------");

        // 6.2、JSON-->Set
        // 使用 Gson.fromJson()方法和 TypeToken将JSON反序列化为 HashSet:
        String jsonString1 = "['Alex','Brian','Charles','Alex']";
//        Gson gson = new Gson();
        java.lang.reflect.Type setType = new TypeToken<HashSet<String>>(){}.getType();
        Set<String> userSet1 = gson.fromJson(jsonString, setType);
        System.out.println(userSet);

    }
}
