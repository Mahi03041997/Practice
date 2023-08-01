package com.practice.Collection_Methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Com_Se_DE   {
	
public static void main(String[] args) throws Exception{
	com_Seralization cs = new com_Seralization(22, "mahi");
	FileOutputStream fileoutput = new FileOutputStream("D:\\seralization\\MahiNew.pdf");
	ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
	objectoutput.writeObject(cs);
	objectoutput.close();
	fileoutput.close();
	
	System.out.println(" serlization success");
	
	FileInputStream fileinput = new FileInputStream("D:\\seralization\\MahiNew.pdf");
	ObjectInputStream objectinput = new ObjectInputStream(fileinput);
	com_Seralization com_Ser = (com_Seralization) objectinput.readObject();
	fileinput.close();
	objectinput.close();
	System.out.println(com_Ser.getId() + " "+ com_Ser.getName());
}
}
