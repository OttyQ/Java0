//1.1.1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a ->");
        int a = in.nextInt();
        System.out.println("Enter b ->");
        int b = in.nextInt();
        System.out.println("Enter c ->");
        int c = in.nextInt();
        int z = ((a - 3) * b / 2) + c;
        System.out.println(z);

    }
}

//1.1.2
import static java.lang.Math.pow;
        import java.util.Scanner;
        import static java.lang.Math.sqrt;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a ->");
        double a = in.nextDouble();
        System.out.println("Enter b ->");
        double b = in.nextDouble();
        System.out.println("Enter c ->");
        double c = in.nextDouble();
        double z = ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2*a)) - pow(a,3)*c + pow(b, -2) ;
        System.out.println(z);

    }
}

//1.1.3
import java.util.Scanner;

        import static java.lang.Math.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x ->");
        int x = in.nextDouble();
        System.out.println("Enter y ->");
        int y = in.nextDouble();
        double z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x*y);
        System.out.println(z);

    }
}

//1.1.4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter R (format nnn,ddd) ->");
        double R = in.nextDouble();
        int iR = (int) R;
        double dR = R - iR;
        double res = (int) (dR * 1000) + iR / 1000.0;
        System.out.println(res);
    }
}

//1.1.5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sec ->");
        int T = in.nextInt();
        System.out.println( T/3600+ " ч " + (T % 3600)/60+" м "+(T % 3600)%60+" с");
    }
}

//1.1.6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x ->");
        int x = in.nextInt();
        System.out.println("Enter y ->");
        int y = in.nextInt();
        if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
            System.out.println("True");
        } else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println("True");
        } else System.out.println("False");

    }
}

//1.2.1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter A ->");
        int a = in.nextInt();
        System.out.println("Enter B ->");
        int b = in.nextInt();
        if (a + b < 180) {
            System.out.println("Треугольник существует");
            if (a + b == 90) {
                System.out.println("Треугольник является прямоугольным");
            }
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}

//1.2.2
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter A ->");
        int a = in.nextInt();
        System.out.println("Enter B ->");
        int b = in.nextInt();
        System.out.println("Enter С ->");
        int c = in.nextInt();
        System.out.println("Enter D ->");
        int d = in.nextInt();
        System.out.println("Max =  " + max(min(a,b), min(c,d)));
    }
}

//1.2.3
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1 ->");
        int x1 = in.nextInt();
        System.out.println("Enter y1 ->");
        int y1 = in.nextInt();
        System.out.println("Enter x2 ->");
        int x2 = in.nextInt();
        System.out.println("Enter y2 ->");
        int y2 = in.nextInt();
        System.out.println("Enter x3 ->");
        int x3 = in.nextInt();
        System.out.println("Enter y3 ->");
        int y3 = in.nextInt();

        if((x2-x1)*(y3-y1)==(x3-x1)*(y2-y1)){
            System.out.println("Точка лежит на прямой");
        } else {
            System.out.println("Точка не лежит на прямой");
        }

    }
}

//1.2.4
import java.util.Scanner;

public class Main {

    private static boolean check(double A, double B, double x, double y){
        return (A >=x && B >= y)|| (A>=y && B>=x);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter A ->");
        int A = in.nextInt();
        System.out.println("Enter B ->");
        int B = in.nextInt();
        System.out.println("Enter x ->");
        int x = in.nextInt();
        System.out.println("Enter y ->");
        int y = in.nextInt();
        System.out.println("Enter z ->");
        int z = in.nextInt();

        if( check(A,B,x,y)|| check(A,B,z,y) ||check(A,B,x,z)){
            System.out.println("Кирпич пройдет");
        } else {
            System.out.println("Кирпич не пройдет");
        }
    }
}

//1.2.5
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter x ->");
        int x = in.nextInt();
        double fx;
        if(x<=3){
            fx = pow(x,2)-3*x+9;
        } else {
            fx = 1/(pow(x,3)+6);
        }
        System.out.println("F(x) = " + fx);
    }
}

//1.3.1
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter positive number ->");
        int x = in.nextInt();
        int sum= 0;
        for (int i = 1;i < x;i++){
            sum+=i;
        }

        System.out.println("Sum = "+sum);
    }
}

//1.3.2
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a ->");
        int a = in.nextInt();
        System.out.println("Enter b ->");
        int b = in.nextInt();
        System.out.println("Enter h ->");
        int h = in.nextInt();
        for (;a<b;a+=h){
            if(a>2) System.out.println(a);
            else System.out.println(-a);
        }
    }
}

//1.3.3
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {

        int rez = 0;
        for (int i = 0;i<=100;i++){
            rez += i*i;
        }
        System.out.println(rez);
    }
}

//1.3.4
import java.math.BigInteger;

        import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {

        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }
}

//1.3.5
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter e->");
        double e = in.nextDouble();
        double sum = 0;
        for (int n =1; ;n++){
            double An = 1/pow(2, n) + 1/pow(3,n);
            if(abs(An) >= e ){
                sum+= An;
            } else {
                break;
            }
        }
        System.out.println("Sum = " +sum);
    }
}

//1.3.6
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {


        for (char c = 'A'; c <= 'Z'; c++) {
            int ascii = (int) c; // получение численного обозначения символа в памяти компьютера
            System.out.println("Символ: " + c + ", Численное обозначение: " + ascii);
        }
    }
}

//1.3.7
import java.util.Scanner;

        import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter m->");
        int m = in.nextInt();
        System.out.println("Enter n->");
        int n = in.nextInt();
        for (int i = m; i<n; i++){
            System.out.println("Делители числа " + i);
            for (int k = 2; k<i; k++){
                if(i%k==0){
                    System.out.print( k +" ");
                }
            }
            System.out.println();
        }
    }
}

//1.3.8
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter m->");
        int m = in.nextInt();
        System.out.println("Enter n->");
        int n = in.nextInt();
        int s = 0, k;
        while(m>0)
        {
            s = m%10;
            k = n;
            while(k>0)
            {
                if (s == k%10)
                    System.out.println("Цифра " + s + " входит в оба числа");
                k/=10;
            }
            m/=10;
        }
    }
    
//2.1
import java.util.Scanner;
import static java.lang.Math.*;


    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            System.out.println("Enter K->");
            int K = in.nextInt();
            int A[] = new int[N]; // объявление массива
            int sum = 0;

            for (int i = 0, k =1; i < N; i++, k++){
                A[i] = k;
                if (A[i]%K == 0 ){
                    System.out.println("Число " + A[i] + " кратно " + K);
                    sum+=A[i];
                }
            }
            System.out.println("Sum= " + sum);
        }
    }
    
//2.2
import java.util.Scanner;
import static java.lang.Math.*;


    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            System.out.println("Enter Z->");
            int Z = in.nextInt();
            int A[] = new int[N]; // объявление массива
            int sum = 0;
            for (int i = 0; i < N; i++){
                A[i] = i*2+5-10;
                if (A[i] > Z){
                    A[i] = Z;
                    sum++;
                }
                System.out.print(A[i] +" ");
            }
            System.out.println("Sum= " + sum);
        }
    }

//2.3
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;


    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N]; // объявление массива


            int sumP = 0, sum0 = 0, sumN = 0;
            for (int i = 0; i < N; i++){
                A[i] = (int)(random()*200) - 100;
                System.out.println(A[i]);
                sumP += (A[i] > 0) ? 1 : 0;
                sum0 += (A[i] == 0) ? 1 : 0;
                sumN += (A[i] < 0) ? 1 : 0;
            }
            System.out.println("SumP = " + sumP + " Sum0= " +sum0 + " SumN = " + sumN);
        }
    }

//2.4
import java.util.*;
import java.util.Arrays;
import static java.lang.Math.*;


    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N]; // объявление массива
            for (int i = 0; i < N; i++){
                A[i] = (int)(random()*200) - 100;
                System.out.println(A[i]);
            }
            Arrays.sort(A);
            int A1;
            A1 = A[0];
            A[0] = A[A.length-1];
            A[A.length-1] =A1;
            System.out.println("Min element is " + A[0]);
            System.out.println("Min element is " + A[A.length-1]);
            for (int i = 0; i < N; i++){
                System.out.println(A[i]);
            }

        }
    }

//2.5
import java.util.*;
import java.util.Arrays;
import static java.lang.Math.*;
import java.util.Random;


    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N]; // объявление массива

            for (int i = 0; i < N; i++){
                A[i] = (int)(Math.random()*10);
            }

            System.out.println("Задание");
            for (int i = 0; i < N; i++){
                if(A[i] > i)
                    System.out.println(A[i]);

            }

        }
    }

//2.6
import java.util.*;
import static java.lang.Math.*;


    public class Main {

        public static boolean isSimpl(int a){
            if(a > 2){
                for (int i = 2; i <= sqrt(a); i++){
                    if (a % i == 0)return false;
                }
                return true;
            }
            else return false;
        }

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N]; // объявление массива
            int sum =0;
            for (int i = 0; i < N; i++) {
                A[i] = (int) (random() * 200)-100;
                if(isSimpl(A[i])){
                    sum += A[i];
                    System.out.println(A[i] + "- простое");
                }
            }

            System.out.println("Sum= " + sum);
        }
    }
    
//2.7
import java.util.*;
import java.util.Arrays;
import static java.lang.Math.*;


    public class Main {



        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N]; // объявление массива
            int k =0;

            for (int i = 0; i < N; i++){
                A[i] = (int)(Math.random()*10);
                System.out.println(A[i]);
            }

            for (int i = 0; i < N-2; i++) {
                k = max(k, A[i] + A[i+1]);
                System.out.println("max("+ (A[i] +A[i+1])+","+(A[i+1] +A[i+2]) +")");
            }

            System.out.println("K= " + k);
        }
    }
    
//2.8
import java.util.*;
    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N]; // объявление массива
            int min = 0, sum0 = 0;
            for (int i = 0; i < N; i++){
                A[i] = (int)(Math.random()*10);
                if (min > A[i]) {
                    min = A[i];
                }
                System.out.println(A[i]);
            }
            for (int i = 0; i < N; i++){
                if(A[i]== min){
                    sum0++;
                }
            }
            int B[] = new int[N-sum0];
            for (int i = 0, ik = 0; i<N;i++){
                if(A[i] != min){
                    B[ik] = A[i];
                    ik++;
                }
            }
            System.out.println("New massive: ");
            for (int i =0; i < B.length; i++){
                System.out.println(B[i]);
            }
        }
    }

//2.9
import java.util.*;

import static java.lang.Math.random;

    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N];
            int mc = 1, ii=0, ai = 0;
            for (int i = 0; i <N; i++) {
                A[i] = (int) (random() * 100);
                System.out.println(A[i]);
            }

            for(int i =0; i<N; i++){
                int c = 0;
                for (int j=i; j<N; j++){
                    if(A[i]==A[j]) {
                        c++;
                        if(c>1){
                            ai = A[i];
                        }
                    }
                    if(mc < c && A[i] <= ai){
                        mc = c;
                        ii = i;
                    }

                }
            }
            if(A[ii] == A[0]){
                System.out.println("Все числа встречаются 1 раз");
            } else  System.out.println("Наиболее часто встречающееся: " + A[ii]);
        }
    }

//2.10
import java.util.*;

import static java.lang.Math.random;

    public class Main {


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter N->");
            int N = in.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = (int) (random() * 100);
                System.out.println(A[i]);
            }
            for (int i = 1; i < N; i += 2) {
                A[i] = 0;
            }
            int j =0;
            for (int i = 0; i<N; i++){
                if(A[i] != 0){
                    if(i!=j){
                        int temp = A[j];
                        A[j] = A[i];
                        A[i] = temp;
                    }
                    j++;
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.println(A[i]);
            }
        }
    }

//2.1.1
import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter N->");
        int N = in.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.print("Enter A["+i+"]["+k+"]-> ");
                A[i][k] = in.nextInt();
            }
            System.out.println("The "+i+" column is full, Enter next one ");

        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                if(i%2 == 0 || i == 0){
                    if(A[i][0] > A[i][A.length-1]){
                        System.out.print(A[i][k]+ " ");
                    }
                }
            }
            System.out.println("");
        }
    }
}

//2.1.2
import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter N->");
        int N = in.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.print("Enter A["+i+"]["+k+"]-> ");
                A[i][k] = in.nextInt();
            }
            System.out.println("The "+i+" column is full, Enter next one ");

        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                if(i==k){
                    System.out.print(A[i][k]+" ");
                }
            }
            System.out.println("");
        }
    }
}

//2.1.3
import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter N->");
        int N = in.nextInt();
        System.out.print("Enter K->");
        int K = in.nextInt();
        System.out.print("Enter P->");
        int P =in.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                System.out.print("Enter A["+i+"]["+k+"]-> ");
                A[i][k] = in.nextInt();
            }
            System.out.println("The "+i+" column is full, Enter next one\n");

        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                if(i == K)System.out.print(A[i][k]+ " ");
                else if(k == P){
                    if(P>0){
                        for (int j = 0; j<P; j++) System.out.print("  ");
                    }
                    System.out.print(A[i][k]);
                }
            }
            System.out.println("");
        }
    }
}
