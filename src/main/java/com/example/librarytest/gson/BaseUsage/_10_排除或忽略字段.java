package com.example.librarytest.gson.BaseUsage;

import com.example.librarytest.gson.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

/**
 * Gson允许我们从Java类中排除或忽略不希望包含在序列化和反序列化中的字段。
 * <p>
 * Gson支持许多内置机制，用于排除顶级类，字段和字段类型。
 *
 * @author xoke
 * @date 2022/10/1
 */
@SuppressWarnings("all")
public class _10_排除或忽略字段 {
    public static void main(String[] args) {
        // 10.1、@Expose注解
        /**
         * GSON @Expose注解(com.google.gson.annotations.Expose)可用于标记对象序列化或反序列化时是否公开（包括活不包括）的字段。
         *
         * @Expose 注释在要显式指定应进行序列化或反序列化的所有字段的编程方式中很有用。
         */
        // 10.1.1. 怎么用 @Expose
        /**
         * @Expose 是可选的，并提供两个配置参数：
         * --/serialize –如果为true，则在序列化时会在JSON中写出带有此注解的字段。
         * --/deserialize –如果为true，则从JSON反序列化带有此注解的字段。
         *
         * @Expose (serialize = false)
         * private String lastName;
         *
         * @Expose (serialize = false, deserialize = false)
         * private String emailAddress;
         */

        // 10.1.2、创建Gson实例
        // 如果我们使用 new Gson()创建 Gson并执行 toJson()和 fromJson()方法，
        // 则 @Expose将不会对序列化和反序列化产生任何影响。要使用此批注，
        // 我们必须使用 GsonBuilder类及其 excludeFieldsWithoutExposeAnnotation()方法创建 Gson实例。
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        // 10.2、用修饰符排除字段
        /**
         * 默认情况下，如果我们仅将字段标记为瞬时态，则Gson会将字段从序列化和反序列化中排除。
         * 请记住，它无法阻止单向转换。它同时阻止了两者。
         * transient 具有与@Expose相同的效果（serialize = false，deserialize = false）。
         *
         * @Expose (serialize = false)
         * private String lastName;
         *
         * private transient String emailAddress;
         */

        // 10.2.2、其他修饰符
        // 通过使用GsonBuilder的excludeFieldsWithModifiers()方法，
        // 我们可以排除具有某些公共修饰符的字段。
        // 例如，我们要排除一个类的所有静态成员，我们可以这样创建Gson对象：
        Gson g1 = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC)
                .create();
        // 我们可以使用任意数量的Modifier常量来“ excludeFieldsWithModifiers”方法。例如：
        Gson g2 = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC,
                        Modifier.TRANSIENT,
                        Modifier.VOLATILE)
                .create();
    }
}
