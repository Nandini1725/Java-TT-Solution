import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int i=0,j=n-1;

        while(i<n){
            arr[i] = sc.nextInt();
            i++;
        }
        i=0;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k=0;k<n;k++){
            System.out.println(arr[k]+ " ");
        }
    }
}
