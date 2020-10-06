import java.util.Scanner;

public class BubbleSort {

	public static void bubble(int arr[], int n) {
		int temp;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.print("Enter elements : ");
		
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		//sorting arr1 by bubble sort
		bubble(arr1, n);
		System.out.print("Sorted array using bubble sort : ");
		for(int i=0; i<n; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		
		sc.close();
	}

}
