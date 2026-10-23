import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("array 1 ");
        int a[]=new int[5];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();

        System.out.println("ARRAY 2");
        int b[]=new int[5];
        b[0]=sc.nextInt();
        b[1]=sc.nextInt();
        b[2]=sc.nextInt();
        b[3]=sc.nextInt();
        b[4]=sc.nextInt();


        System.out.println(" COMBINACION");
        int resultado[]=new int[5];
        for (int i=0;i<resultado.length;i++) {
            resultado[i] = a[i] + b[i];

            System.out.print(resultado[i] + ",");
        }



    }
}