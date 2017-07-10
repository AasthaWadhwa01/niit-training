package threads;

public class SumThreadArray extends Thread {
	private int lo, hi;
	private int[] arr;
	private int ans = 0;

	public SumThreadArray(int[] arr, int lo, int hi) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}

public void run()
{
//Date dt= new Date
	for(int i=lo;i<hi;i++){
		 ans+=arr[i];
		}
}

	public static int sum(int[] arr) throws InterruptedException {
		int len = arr.length;
		int ans = 0;
		SumThreadArray[] ts = new SumThreadArray[4];
		for (int i = 0; i < 4; i++) {
			ts[i] = new SumThreadArray(arr, (i + 1) * len / 4, (i * len) / 4);
			ts[i].start();
		}
		for(int i=0; i<4; i++){
			ts[i].join();
			ans += ts[i].ans;
		}
		return ans;
	}

	public static void main(String[] args) throws InterruptedException {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		int sum = sum(arr);
		System.out.println("Sum:" + sum);
	}
}