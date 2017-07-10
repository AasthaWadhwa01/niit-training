package threads;

public class SyncThreadTable {
	
	synchronized void printTable(int n){
	for(int i=1;i<=10;i++)
		System.out.println(n*i);
	
	try{
		Thread.sleep(200);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}

public class SyncThreadTable {
	
	void printTable(int n){
	for(int i=1;i<=10;i++)
		System.out.println(n*i);
	
	try{
		Thread.sleep(200);
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(5);
	}
}