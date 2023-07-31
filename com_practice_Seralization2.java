package com.practice.Collection_Methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class com_practice_Seralization2 {
    public static void main(String[] args) throws Exception {
        com_practice_seralization ps = new com_practice_seralization(22, "Mahi", 22000.00f, "Sathupaly");
        com_practice_seralization ps1 = new com_practice_seralization(23, "Ramu", 23400f, "khanna");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\seralization\\mahi.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ps);
fileOutputStream.close();
objectOutputStream.close();

FileInputStream fileInputStream = new FileInputStream ("D:\\seralization\\mahi.txt");
    ObjectInputStream objectinput = new ObjectInputStream(fileInputStream);
    com_practice_seralization ob = (com_practice_seralization) objectinput.readObject();
    fileInputStream.close();
    objectinput.close();
    System.out.println(ob.getName());
    }
    

}
