import java.util.Scanner;
interface sum{
    void get_data();
    void display();
}
class A{
    int a;
    void input_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one number: ");
        a = sc.nextInt();
        
    }
}
class B extends A implements sum {
    int sum;
    int b;
    public void get_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one number: ");
        b = sc.nextInt();
    }
    public void display() {
        sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.input_data();
        obj.get_data();
        obj.display();
    }
}