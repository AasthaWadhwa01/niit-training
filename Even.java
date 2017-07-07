package junit;

public class Even {
	
static boolean checkEven(int num){
	
	if(num % 2 ==0)
		return true;
	else 
		return false;
}


static int sum(int a, int b){
	int result = a+b;
	return result;
}

public void getException(){
	int arr[]=new int[2];
	System.out.println(arr[3]);
}


}
