import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1. Hoàn thành bài tập: Viết một lớp các đối tượng hình chữ nhật
//        lấy tên là Rectangle, mỗi hình chữ nhật đều có những đặc tính sau:
//        + Có thông số chiều dài (int).
//        + Có thông số chiều rộng (int).
//        + Có tính năng tính diện tích.
//                + Có tính năng tính chu vi.
//                => Tạo một đối tượng HCN
//                +  Hiển thị thông tin hình chữ nhật.
//        +  Thay đổi chiều dài và chiều rộng của hình chữ nhật
//        +  In ra màn hình diện tích và chu vi của hình chữ nhật đó.
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập width :");
//        int width = input.nextInt();
//        System.out.println("nhập height :");
//        int height = input.nextInt();
//        Product product = new Product(width,height);
//        System.out.println(product.display());
//        System.out.println("dện tích hình chữ nhật là: " + product.S());
//        System.out.println("chu vi hình chữ nhật là :" + product.V());
        // phương trình bậc 2
//        System.out.println("nhập số number1");
//        double number1 = input.nextDouble();
//        System.out.println("nhập số number2");
//        double number2 = input.nextDouble();
//        System.out.println("nhập số number3");
//        double number3 = input.nextDouble();
//
//        QuadraticEquation quadraticEquation = new QuadraticEquation(number1,number2,number3);
//        double delta =quadraticEquation.denTa();
//
//        System.out.println(delta);
//
//        if(delta>0){
//            System.out.println(quadraticEquation.getRoot1());
//            System.out.println(quadraticEquation.getRoot2());
//        }else  if (delta==0){
//            System.out.println(quadraticEquation.getRoot1());
//        }else {
//            System.out.println("phương trình vô nghiệm");
//        }
        // Xây dựng lớp StopWatch
//        int[] arr = new int[100000];
//        java.util.Random random = new java.util.Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt();
//        }
//
//        // Tạo một đối tượng StopWatch
//        StopWatch stopwatch = new StopWatch();
//
//        // Bắt đầu đo thời gian
//        stopwatch.start();
//
//        // Sắp xếp mảng bằng thuật toán selection sort
//        selectionSort(arr);
//
//        // Dừng đồng hồ và in ra thời gian đã trôi qua
//        stopwatch.stop();
//        System.out.println("Elapsed time for sorting 100,000 numbers: " + stopwatch.getElapsedTime() + " milliseconds");
//    }
//
//    public static void selectionSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i];
//            arr[i] = temp;
//        }
        //Xây dựng lớp Fan
           Fan fan1 = new Fan();
           fan1.setSpeed(fan1.FAST);
           fan1.setRadius(10);
           fan1.setColor("yellow");
           fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.MEDIUM);
//        fan2.setRadius(5);
//        fan2.setColor("blue");//theo giá trị mac định
//        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
