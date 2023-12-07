package JavedSirMultithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Driver {
String s="christmas";
String path="D:\\Class work\\JavedSir\\Output.txt";
synchronized public void WriteIntoFile() throws FileNotFoundException, InterruptedException {
	FileOutputStream fos=new FileOutputStream(path);
	PrintWriter pw=new PrintWriter(fos);
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		pw.write(c);
		System.out.println("Writing into file");
		Thread.sleep(1000);
	}
	pw.flush();
}

synchronized void modfiyData(String s) {
	this.s=s;
}
}


class A extends Thread{
	Driver d;
	A(Driver d){
		this.d=d;
	}
	@Override
	public void run() {
		try {
			d.WriteIntoFile();
		} catch (Exception e) {
			System.out.println("handled");
		}
	}
}

class B extends Thread{
	Driver d;
	B(Driver d){
		this.d=d;
	}
	
	@Override
	public void run() {
		d.modfiyData("holi");
	}
}

class Driver1{
	public static void main(String[] args) throws InterruptedException {
		Driver d=new Driver();
		A t1=new A(d);
		B t2=new B(d);
		t1.start();
		Thread.sleep(2000);
		t2.start();
		Thread.sleep(10000);
		System.out.println(d.s);
		
	}
}
