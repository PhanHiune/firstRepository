import java.util.Scanner;
public class TBPS {

    public static double SumOfArray(double []a, int n) {
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += a[i];
        }
        return sum;
    }
    public static double average(double[] a, int n){
        double sum = SumOfArray(a, n);
        return sum/n;
    }
    public static double phuongsai(double []a, int n){
        double mean = average(a, n);
        double temp = 0 ;
        for(int i = 0; i< n;i++){
            temp +=  Math.pow(mean - a[i],2.0);
        }
        return temp/(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu dai cua mang: ");
        int n = sc.nextInt();  // Nhập độ dài mảng
        
        double[] a = new double[n]; // Khai báo mảng với kích thước n
        
        System.out.print("Nhap gia tri cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();  // Nhập giá trị cho từng phần tử
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");  // In ra các phần tử của mảng
        // }
        System.out.println(average(a, n));
        System.out.println(phuongsai(a, n));

        sc.close(); // Đóng Scanner để tránh rò rỉ bộ nhớ
    }
}
