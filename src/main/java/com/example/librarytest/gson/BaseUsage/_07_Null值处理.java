package com.example.librarytest.gson.BaseUsage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson中实现的默认行为是忽略空对象字段。
 * <p>
 * 例如，如果在Employee对象中未指定电子邮件（即email为null），
 * 则电子邮件将不会被序列化JSON输出。Gson会忽略null字段，
 * 因为此行为允许使用更紧凑的JSON输出格式。
 *
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _07_Null值处理 {
    public static void main(String[] args) {
        // 7.1、如何在序列化时允许空值
        // 要配置Gson实例以输出null，我们必须使用 GsonBuilder对象的serializeNulls()。
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();
    }
}
