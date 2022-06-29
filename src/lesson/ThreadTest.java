package lesson;

import java.io.File;
import java.io.FileOutputStream;

class Total {
	int sum;

	Total() {
		sum = 0;
	}

	synchronized void total(int n) {
	//void total(int n) {
		sum += n;
		System.out.println("+" + n + " = " + sum);
	}

	int get() {
		return sum;
	}

}

class AThread extends Thread {
	Total t;
	int startNo;
	int endNo;

	AThread(Total t, int a, int b) {
		this.t = t;
		startNo = a;
		endNo = b;
	}

	public void run() {
		for (int i = startNo; i <= endNo; i++) {
			t.total(i);
			
			if (i == endNo) {
				System.out.println(endNo + " for ¹® ³¡");
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(startNo + ":" + t.get());
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		int n = 50;
		Total t = new Total();
		AThread a = new AThread(t, 1, n);
		AThread b = new AThread(t, n + 1, n * 2);
		a.start();
		b.start();
//		try {
//			a.join();
//			b.join();
//		} catch (Exception e) {
//		}
		
	}

}
