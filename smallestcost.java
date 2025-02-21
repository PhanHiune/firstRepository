import java.util.Scanner;
public class smallestcost {
    public static void quickSort(int []a, int low, int high){
        if(low < high){
        int pivot = partition(a,low, high);
        quickSort(a, low, pivot - 1);
        quickSort(a, pivot + 1, high);           
        } 
    }
    public static int partition(int []a, int low, int high){
        int pivot = a[high];
        int i = low - 1;
        for(int j = low; j < high;j++){
            if(a[j] < pivot){
                i++;
                swap(a,i, j);
            }
        }
        swap(a,i+1,high);
        return (i+1);
    }
    public static void swap(int []a,int i, int j){
        int temp = a[i];
        a[i]= a[j];
        a[j] = temp; 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so du an: ");
        int numberProject = sc.nextInt();
        int []arrCoder = new int[numberProject];
        int [] arrTester = new int [numberProject];
        for (int i = 0; i < numberProject; i++) {
            System.out.println("Nhap so tien cho coder "+arrCoder[i]+": ");
            arrCoder[i] = sc.nextInt();            
        }
        for (int i = 0; i < numberProject; i++) {
            System.out.println("Nhap so tien cho tester "+arrTester[i]+": ");
            arrTester[i] = sc.nextInt();            
        }
        quickSort(arrCoder, 0, numberProject-1);
        quickSort(arrTester, 0, numberProject-1);
        int sum = 0;
        for(int i = 0; i < numberProject; i++){
            sum+= arrCoder[i] * arrTester[numberProject-i-1];
        }
        System.out.println(sum);
        sc.close();
    }
}
