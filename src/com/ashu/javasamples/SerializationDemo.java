package com.ashu.javasamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.setDimensions(12, 15);

		System.out.println("Serialization");
		ObjectIO.serializeObject(foo);

		System.out.println("Deserialization");
		ObjectIO.deserializeObject();
	}
}

class ObjectIO {

	private ObjectIO() {

	}

	public static void serializeObject(Object _obj) {
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(_obj);
			os.close();
		} catch (IOException e) {
			System.out.println("Arghhh!!!!");
			e.printStackTrace();
		}
	}

	public static void deserializeObject() {
		try {
			FileInputStream fs = new FileInputStream("foo.ser");
			ObjectInputStream os = new ObjectInputStream(fs);

			Foo foo = (Foo) os.readObject();
			System.out.println("Deserialized Object");
			foo.viewDimensions();

			os.close();

		} catch (IOException e) {
			System.out.println("can't deserialize");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			e.printStackTrace();
		}
	}

}

class Foo implements Serializable {

	private static final long serialVersionUID = -6533960325099627885L;
	private int height;
	private int width;

	public void setDimensions(int _height, int _width) {
		this.height = _height;
		this.width = _width;
	}

	public void viewDimensions() {
		System.out.println(height);
		System.out.println(width);
	}
}
