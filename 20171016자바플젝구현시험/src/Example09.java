class Data {
	Object obj = new Object[3];
	
	public Data(Object value) {
		this.obj = value;
	}
}

public class Example09 {

	public static void main(String[] args) {
		Data[] a = new Data[3];
		
		a[0] = new Data(new int[] {1 ,2, 3});
		a[1] = new Data(new Integer[] {1, 2, 3});
		a[2] = new Data("hello");
	}
}
