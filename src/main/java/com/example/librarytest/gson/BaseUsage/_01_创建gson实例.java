package com.example.librarytest.gson.BaseUsage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _01_创建gson实例 {
    public static void main(String[] args) {
        // 1、创建Gson实例
        // 使用 Gson的第一步是创建一个Gson对象，创建 Gson对象有两种方式：
        // 1.1、new Gson()
        Gson g1 = new Gson();
        // 1.2、GsonBuilder.create()
        GsonBuilder builder = new GsonBuilder();
        Gson g2 = builder.create();
    }
}
