package com.design.pattern.prototype;
import lombok.Data;

import java.io.*;
import java.util.List;


@Data
public class ConcreatePrototype implements Cloneable,Serializable {

    private int age;

    private String name;

    private List<String> hobbies;

    /*
    这个方法是浅拷贝，拷贝数据，不拷贝引用，上面的list集合就没有拷贝，拷贝后的对象的
    集合是指向相同的内存空间
     */
    @Override
    protected ConcreatePrototype clone() {
        try {
            return (ConcreatePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    这个方法是深拷贝，拷贝地址，上面的list集合，会拷贝出一个相同内容的数据地址，但对新的内存地址的操作，不会影响到
    原来内存的数据
     */
    public ConcreatePrototype deepClone() {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            oos.writeObject(this);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream ios = new ObjectInputStream(inputStream);
            return (ConcreatePrototype) ios.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        return "ConcreatePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

}
