package Interface;

interface Mergesort{
	void merge();
}
interface Bubblesort{
	void bubble();
}
 class Kinds_of_sort implements Mergesort,Bubblesort{ 

@Override
public void bubble() {
	int arr[]= {4,1,0,5,2,3};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}


public void merge() {
	System.out.println();
	System.out.println("yes merge sort is called ");
	
}
}
 
 public class Mainmethod {
	 public static void main(String[] args) {
		
		 Kinds_of_sort kos=new Kinds_of_sort();
		 kos.bubble();
		 kos.merge();
	}
	 
	
 }