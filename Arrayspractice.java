public class Arrayspractice {
	public static void main(String[] args) {
		
		//single dimentional array
		int ar[]=new int[5];
		ar[0]=2;
		ar[1]=3;
		ar[2]=4;
		ar[3]=5;
		ar[4]=6;
		for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
		}
		
		//multi dimentional array
		int arr[][]= {{1,2},{3,4},{5,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
