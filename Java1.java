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

//2.1.4
import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n->");
        int N = in.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if(i%2 != 0 ) {
                    A[i][k] = N - k;
                } else {
                    A[i][k] = k+1;
                }
            }
        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                System.out.print(A[i][k]+ " ");
                }
            System.out.println(" ");
            }
        }
    }

//2.1.5
import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter onn- n->");
        int N = in.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
               if(N< k+i+1)A[i][k] = 0;
               else A[i][k] = i+1;
            }
        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                System.out.print(A[i][k]+ " ");
                }
            System.out.println(" ");
            }
        }
    }

//2.1.6
import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter onn- n->");
        int N = in.nextInt();
        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                if(N<k+i+1 || k<i ) A[i][k] = 0;
                else A[i][k] = 1;
                if(i >= N/2){
                    if(N>k+i+1 || k>i ) A[i][k] = 0;
                    else A[i][k] = 1;
                }
            }
        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                System.out.print(A[i][k]+ " ");
                }
            System.out.println(" ");
            }
        }
    }

//2.1.7
import java.util.*;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter onn- n->");
        int N = in.nextInt();
        float sum = 0;
        float A[][] = new float[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++){
                A[i][k] = (float) sin((pow(i, 2)- pow(k, 2))/N);
                if (A[i][k] > 0 ) sum += A[i][k];
            }
        }
        for (int i = 0; i<A.length;i++){
            for(int k = 0; k<A.length;k++){
                System.out.print(A[i][k]+ " ");
                }
            System.out.println(" ");
            }
        System.out.println("Sum= " + sum);
        }
    }

//2.1.8
import java.util.*;
import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter onn- n->");
        int N = in.nextInt();

        int A[][] = new int[N][N];
        int B[] = new int[N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                A[i][k] = (int) (random() * 100);
                System.out.print(A[i][k] + "\t");
            }
            System.out.println(" ");
        }
        
        System.out.println("Enter number of first column->");
        int j = in.nextInt();
        System.out.println("Enter number of second column->");
        int j1 = in.nextInt();

        for (int i = 0; i < N; i++) {
            B[i] = A[i][j];
            A[i][j] = A[i][j1];
            A[i][j1] = B[i];
        }
        for (int i = 0; i < A.length; i++){
            for (int k = 0; k < A.length; k++){
                System.out.print(A[i][k] + "\t");
            }
            System.out.println(" ");
        }
    }
}

//2.1.9
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter onn- n->");
        int N = in.nextInt(), sum = 0,sum_m = 0, sum_k = 0;

        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                A[i][k] = (int) (random() * 100);
                System.out.print(A[i][k] + "\t");
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i< A.length; i++){
            sum = 0;
            for (int j = 0; j< A.length; j++){
                sum += A[j][i];
            }
            if(sum_m < sum){
                sum_m = sum;
                sum_k = i;
            }
        }
        System.out.println("Max_column index = " + sum_k+ "; Sum = "+sum_m);
    }
}

//2.1.10
import java.util.*;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter onn- n->");
        int N = in.nextInt(), sum = 0,sum_m = 0, sum_k = 0;

        int A[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                A[i][k] = (int) (random() * 100-50);
                System.out.print(A[i][k] + "\t");
            }
            System.out.println(" ");
        }
        for (int i = 0; i< A.length; i++){
            for (int j = 0; j<A.length;j++){
                if(N==i+j+1&& A[i][j] > 0 ) System.out.print(A[i][j] +" ");
            }
        }

    }
}

//2.1.11
public class Main {

    public static void main(String[] args) {


        int A[][] = new int[10][20];
        int p = 0;
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 20; k++) {
                A[i][k] = (int) (Math.random() * 16);
                if (A[i][k] == 5) p++;
            }
            if (p >= 3) {
                System.out.println("In line " + i + " 5 occurs more than 3 times or equal");
                p = 0;
            }
        }
        
        for (int i =0 ; i < 10; i++ ){
            for (int j = 0; j < 20; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println(" ");
        }
    }
}

//2.1.12
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int A[][] = {
        {5, 2, 7, 3},
        {1, 8, 4, 6},
        {9, 0, 11, 10}
    };
        //сортировка по возрастанию
        for (int i = 0; i <A.length; i++) {
            Arrays.sort(A[i]);
        }

        //вывод
        for (int i =0 ; i <A.length; i++ ){
            for (int j = 0; j < A.length+1; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println(" ");
        }
        
        System.out.println("Second part of the task ");
        int k , t;
        //cортировка по убыванию
        for (int i  =0; i< A.length; i++){
            k = A.length;
            int j = 0;
               while(k> j){
                   t = A[i][j];
                   A[i][j] = A[i][k];
                   A[i][k] = t;
                   k--;
                   j++;
            }
        }

        for (int i =0 ; i <A.length; i++ ){
            for (int j = 0; j < A.length+1; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println(" ");
        }
    }
}

//2.1.13
public class Main {

    public static void main(String[] args) {
        int A[][] = {
        {5, 2, 7, 3},
        {1, 8, 4, 6},
        {9, 0, 11, 10}
    };
        //сортировка по возрастанию
        int k , t;
        for (int i = 0; i <A.length+1; i++) {
            for (int j =0; j < A.length-1;){
                if(A[j][i] >A[j+1][i]){ 
                    t = A[j][i];
                    A[j][i] = A[j+1][i];
                    A[j+1][i] = t;
                    j = 0;                      //обнуляем если была перестановка
                }else {
                    j++;
                }
            }
        }
        //вывод
        for (int i =0 ; i <A.length; i++ ){
            for (int j = 0; j < A.length+1; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println(" ");
        }

        System.out.println("Second part of the task ");

        //cортировка по убыванию
        for (int i  =0; i< A.length+1; i++){
            k = A.length-1;
            int j = 0;
               while(k> j){
                   t = A[j][i];
                   A[j][i] = A[k][i];
                   A[k][i] = t;
                   k--;
                   j++;
            }
        }

        for (int i =0 ; i <A.length; i++ ){
            for (int j = 0; j < A.length+1; j++){
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println(" ");
        }
    }
}

//2.1.14
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m-> ");
        int m = scan.nextInt();
        System.out.print("Enter n->");
        int n = scan.nextInt();

        int A[][] = new int[m][n];

        for (int i = 0; i <m; i++) {
            for (int j =0; j <n;j++){
                      if(j-i>0) A[i][j] = 1;
                }
            }
        
        for (int i =0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(" ");
        }
        
    }
}

//2.1.15
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter m-> ");
        int m = scan.nextInt();
        System.out.print("Enter n->");
        int n = scan.nextInt();

        int A[][] = new int[m][n];

        int max = 0;
        for (int i = 0; i <m; i++) {
            for (int j =0; j <n;j++){
                A[i][j] = (int)(Math.random()*100);
                System.out.print(A[i][j] + "\t");
                 if(A[i][j] > max){
                     max = A[i][j];
                 }
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        for (int i =0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(A[i][j] % 2 != 0){
                    A[i][j] = max;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}

//2.1.16
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (odd)-> ");
        int size = scanner.nextInt();

        if (size % 2 == 0) {
            System.out.println("N must be odd!");
            return;
        }

        int[][] A = createMagicSquare(size);

        System.out.println("Magic square:");
        printMatrix(A);
    }

    public static int[][] createMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int num = 1;
        int row = 0;
        int col = size / 2;

        while (num <= size * size) {
            magicSquare[row][col] = num;
            num++;

            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;

            if (magicSquare[newRow][newCol] == 0) {
                row = newRow;
                col = newCol;
            } else {
                row = (row + 1) % size;
            }
        }

        return magicSquare;
    }

    //Вывод
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

//2.2.1 // Одномерные массивы. Сортировки

public class Main {
    public static void main(String[] args) {
    int [] a = {10, 9, 8, 7, 6,5,4,3,2,1};
    int [] b = {11,12,4,6,8};
    int k = 4;
    a = insertion(a, b, k);
    for (int i = 0; i < a.length; i++){
        System.out.print(" " + a[i]);
    }
}

    public static int[] insertion(int a[], int b[], int k){
        int finalLength = a.length + b.length;
        int [] res = new int[finalLength];
        int n = 0;
         for(int i = 0; i < res.length; i++){
        if(i<k || n > b.length -1) res[i] = a[i-n];
        else res[i] = b[n];
        n++;
        }
        return  res;
       
    }
}

//2.2.2
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] a = {1, 3, 5, 7, 9};
            int[] b = {2, 4, 6, 8, 10, 11, 12};
            a = resultMass(a, b);

            for (int it : a) {
                System.out.print(it + " ");
            }
        }

        private static int[] resultMass(int[] a, int[] b) {
            int resLength = a.length + b.length;
            int [] res = new int[resLength];
            int i = 0;
            int j = 0;
            for (int k = 0; k < res.length; k++){
                if(i < a.length &&(j>=b.length || a[i] <= b[j])){
                    res[k] = a[i];
                    i++;
                }else{
                    res[k] = b[j];
                    j++;
                }
            }
            return  res;
        }
    }





//2.2.3
    //если изначально отсортирован
   public class Main {
        public static void main(String[] args) {
            int[] a = {1, 5, 5, 6, 9, 12, 15};
            sortChos(a);
            for (int it : a) {
                System.out.print(it + " ");
            }
        }

        private static void sortChos(int[] a) {
            for (int i = 0; i < a.length/2; i++){
                int temp = a[i];
                a[i] = a[a.length-1-i];
                a[a.length-1-i] = temp;
            }
        }
       //or
      /* private static void sortChos(int[] a) {
            for (int i = 0; i < a.length; i++){
                int maxInd = i;
               for (int k = i+1; k < a.length; k++){
                   if(a[k] > a[maxInd]) maxInd = k;
               }
               int temp = a[i];
               a[i] = a[maxInd];
               a[maxInd] = temp;
            }
        }*/
    }

//2.2.4
 public class Main {
        public static void main(String[] args) {
            int[] a = {15, 12, 9, 6, 5, 4, 3, 2, 1};
            sort(a);
            for (int it : a) {
                System.out.print(it + " ");
            }
        }

        private static void sort(int[] a) {
            int counter = 0;
            for (int i = 0; i < a.length; i++){
               for (int k = 0; k < a.length-i-1; k++){
                   if(a[k] > a[k+1]) {
                       int temp = a[k];
                       a[k] = a[k+1];
                       a[k+1] = temp;
                       counter++;
                   }
               }

            }
            System.out.println("Count of changes: " + counter );
        }
    }

//2.2.5
 public class Main {
        public static void main(String[] args) {
            int[] a = {15, 12, 9, 6, 5, 4, 3, 2, 1};
            sort(a);
            for (int it : a) {
                System.out.print(it + " ");
            }
        }

        private static void sort(int[] a) {
            for (int i = 1; i < a.length; i++){
                int sorted = i -1;
                while(sorted > -1 && a[sorted] > a[sorted+1]){
                    int temp = a[sorted];
                    a[sorted] = a[sorted+1];
                    a[sorted+1] = temp;
                    sorted--;
                }
            }
        }
    }

//2.2.6
 public class Main {
        public static void main(String[] args) {
            int[] a = {1, 15, 9, 6, 5, 4, 3, 2, 12};
            sort(a);
            for (int it : a) {
                System.out.print(it + " ");
            }

        }

        private static void sort(int[] a) {
            int len = a.length;
            for (int sh = len/2; sh>0; sh/=2 ){
                for (int i = sh; i < len; i++){
                    int temp = a[i];
                    int ti = i;
                    while(ti>=sh &&a[ti-sh] > temp){
                        a[ti] = a[ti-sh];
                        ti -= sh;
                    }
                    a[ti] = temp;
                }
            }
        }

    }

//2.2.7
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] q1 = {1, 3, 5, 8, 9};
            int[] q2 = {2, 4, 6, 10, 11};

            int[] ins = findInsPoints(q1, q2);

            System.out.println("answ:");
            for (int item : ins) {
                System.out.print(item + " ");
            }
        }

        public static int[] findInsPoints(double[] q1, double[] q2) {

            int[] insPosRes = new int[q2.length]; //cтавим m т.к последовательность q2 может быть больше q1
            int i = 0; // Индекс для q1
            int j = 0; // Индекс для q2
            int k = 0; // Индекс для insPosRes

            while(i < q1.length && j < q2.length) {
                if (q1[i] <= q2[j]) {
                    i++;
                } else {
                    insPosRes[k] = i;
                    j++;
                    k++;
                }
            }
            while(j<q1.length){               //если мы выйдем за пределы
                    insPosRes[k] = q1.length; //массива q1 то оставшиеся
                    j++;                      //элементы будут записаны после
                    k++;                      //последнего эл-та q1
            }
            return insPosRes;
        }
    }

//2.2.8
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] p = {1, 8, 5, 3, 9};
            int[] q = {2, 10, 6, 4, 11};

            System.out.println("answ:");
            int g = findGCD(q);
            for (int i =0; i < p.length; i++){
                p[i] = g / q[i];
                q[i] = g;
            }

            for (int i = 0; i<p.length-1; i++){
                for (int j = 0; j < p.length-1; j++){
                    double pq = (double) p[j]/q[j];
                    double pq1 = (double) p[j+1]/q[j+1];
                    if( pq > pq1 ) {
                        swap(p, j, j+1);
                        swap(q, j, j+1);
                    }
                }
            }
            for (int item : p) {
                System.out.print(item + "\t");
            }
            System.out.print("\n");
            for (int item : q) {
                System.out.print(item + "\t");
            }
        }
        private static int findGCD(int [] arr ){
            int res = arr[0];
            for (int i = 0; i< arr.length; i ++){
                res = GCD(res, arr[i]);
            }
            return res;
        }

        private static int GCD(int a, int b){
            int temp = a*b;
            while(a!=b){
                if(a>b) a = a-b;
                else b= b-a;
            }
            return temp/a;
        }
        public static void swap(int[] arr, int a, int a1){
            int temp = arr[a];
            arr[a] = arr[a1];
            arr[a1] = temp;
        }
    }

//2.3.1

    public class Main {
        public static void main(String[] args) {
            int p = 23;
            int q = 32;
            System.out.print(HOK(p,q));
        }
        private static int HOK(int a, int b ){
            return a*b/GCD(a,b);
        }

        private static int GCD(int a, int b){
            while(a!=b){
                if(a>b) a = a-b;
                else b= b-a;
            }
            return a;
        }
    }

//2.3.2

    public class Main {
        public static void main(String[] args) {
            int[] p = {1,2,3,4};
            System.out.print(LCMforArr(p));
        }
        private static int LCMforArr(int [] p){
            int res = p[0];
            for (int i=1; i < p.length; i++){
                res = LCM(res, p[i]);
            }
            return res;
        }

        private static int LCM(int a, int b){
            return (a*b)/GCD(a,b);
        }
        private static int GCD(int a, int b){
            while(a!=b){
                if(a>b) a = a-b;
                else b= b-a;
            }
            return a;
        }
    }

//2.3.3
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
        public static void main(String[] args) {
            int a = 16;
            System.out.print(findSquare(a));
        }
        private static double findSquare(int a){
            return 6*findTriangleSq(a);
        }

        private static double findTriangleSq(int a) {
            return pow(a,2)*sqrt(3)/4;
        }
}

//2.2.4
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
        public static void main(String[] args) {
            int [][]coorPoint = {
                    {1,2},
                    {3,4},
                    {5,8},
                    {4,9}
            };

            findDist(coorPoint);
        }
        private static void findDist(int [][] a){
          double res = sqrt(pow(a[0][0] - a[1][0], 2)+ pow(a[0][1] - a[1][1],2));
          int [] pos1 = a[0];
          int [] pos2 = a[1];
          for (int i = 0; i < a.length; i++){
              for (int j =i+1; j < a.length-1; j++){
                  double temp = sqrt(pow(a[i][0] - a[j][0], 2)+ pow(a[i][1] - a[j][1],2));
                  if(temp > res){
                      res = temp;
                      pos1 = a[i];
                      pos2 = a[j];
                  }
              }
          }
          System.out.println(pos1[0]+" " + pos1[1] + " and "+ pos2[0]+ " "+pos2[1]);
          System.out.println(res);
        }
}

//2.2.5
import java.util.Arrays;


public class Main {
        public static void main(String[] args) {
            int []a = {1,2,10,34,234,15,68,100};
            Arrays.sort(a);
            for(int item: a){
                System.out.print(item+ " ");
            }
            findNumAfterMax(a);
        }
        private static void findNumAfterMax(int [] a){
         Arrays.sort(a);
         System.out.println("Number: " + a[a.length-2]);
        }
}

//2.2.6

public class Main {
        public static void main(String[] args) {
            int a = 5;
            int b = 7;
            int c = 11;
            if(areSimpl(a,b,c)){
                System.out.println("Number are relative");
            }else System.out.println("This numbres not relative");
        }
        private static int gcd(int a, int b){
            if(b==0){
                return a;
            }
            return gcd(b, a%b);
        }

        private static boolean areSimpl(int a, int b, int c){
            int ab = gcd(a,b);
            int ac = gcd(a, c);
            int bc = gcd(b,c);
            return (ab == 1&& ac == 1&& bc == 1);
        }
}

//2.2.7

public class Main {
        public static void main(String[] args) {
        System.out.println("res="+sum(9));
        }
        private static int fact(int a){
            if(a==1){
                return 1;
            }
            return  a* fact(a-1);
        }
        private static int sum(int a){
            int sum = 0;
            for (int i= 1; i<=a; i+=2){
                sum += fact(i);
            }
            return sum;
        }



}

//2.2.8


public class Main {
        public static void main(String[] args) {
        int [] mass = {1,2,3,4,5,6,7};
        System.out.println("First sum: "+ diapSum(mass, 0,2) );
        System.out.println("First sum: "+ diapSum(mass, 2,4) );
        System.out.println("First sum: "+ diapSum(mass, 3,5) );
        }
        private static int diapSum(int [] m,int a, int b){
            int sum = 0;
           for (int i = a; i<=b; i++){
                sum += m[i];
           }
           return sum;
        }
}

//2.2.9
import static java.lang.Math.sqrt;

public class Main {
        public static void main(String[] args) {
        int x  =10, y =15, z = 7, t = 9;
        System.out.println("Answer: "+findSquare(x,y,z,t));
        }
        private static double findSquare(int x,int y, int z, int t){
            double hPer = (x+y+z+t)/2;
            return sqrt((hPer-x)*(hPer-y)*(hPer-z)*(hPer-t));
        }

}

//2.2.10
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int n = 10;
            int [] resArray = makeMass(10);
            for (int it : resArray){
                System.out.print(it +" ");
            }
        }
        private static int [] makeMass(int n){
           Scanner in = new Scanner(System.in);
           System.out.println("Enter array length->");
           int len = in.nextInt();
           int [] arrRes;
           arrRes = new int[len];
            Arrays.fill(arrRes, n);
            return arrRes;
        }
}

//2.2.11

public class Main {
        public static void main(String[] args) {
            int a = 1000, b = 11250;
        switch (wheresMore(a, b)) {
            case 0:
                System.out.println(a + " is bigger then" + b);
                break;
            case 1:
                System.out.println(b + " is bigger then " + a);
                break;
            case 2:
                System.out.println("Both numbers are equal!");
        }
        }
        private static int  wheresMore(int a, int b){
           String a1 = Integer.toString(a);
           String a2 = Integer.toString(b);
           if(a1.length() > a2.length()){
               return 0;
           } else if(a1.length() == a2.length()) return 2;
           return 1;
        }
}

//2.2.12

public class Main {
        public static void main(String[] args) {
            int k = 12, n =6;
            int[] mas = makeArr(k, n);
            for (int item : mas){
                System.out.print(item + " ");
            }
        }
        private static int[]  makeArr(int k, int n){
          int [] a = new int[10];
          for (int i =0; i< a.length; i++){
              a[i] = makeNum(k, n);
          }
          return a;
        }

    private static int makeNum(int k, int n) {
            int num;
            int tens = 10;
            num = (int) (Math.random()*n);
            while(sumOfEl(num) < k){
                int numt2 = (int) (1+Math.random()*(k-sumOfEl(num)));
                int numt = (int) (tens*numt2);
                num+=numt;
                tens*=10;
            }
        return num;
    }

    private static int sumOfEl(int n){
            int temp = n;
            int sum = 0;
            while (temp!=0){
                sum += temp%10;
                temp/=10;
            }
            return sum;
    }

//2.2.13
public class Main {
        public static void main(String[] args) {
            int n = 12;
            findTwin(12);
        }
        private static void findTwin(int s){
            int e = 2*s;
            for (int i= s; i <=e-2;i++){
                int n = i+2;
                if(isTwin(i, n)) System.out.println("Twin " + i+" "+n);
            }
        }
    private static boolean isTwin(int k, int n) {
        if(n-k==2) return true;
        return false;
    }
}
    
    //2.2.14
public class Main {
    public static void main(String[] args) {
        int k = 12;
        armstrongNum(153);
    }

    private static void armstrongNum(int s) {
        for (int i = 1; i <= s; i++) {
            if(isArmNumber(i, elOfNum(i))) System.out.println(i);
        }

    }

    private static boolean isArmNumber(int n, int el) {
        int temp = n;
        int sum = 0;
        int k = 0;
        while (temp != 0) {
            k=temp%10;
            sum += pow(k,el);
            temp /= 10;
        }
        if(n == sum) return true;
        return false;
    }

    private static int elOfNum(int n){
        return  Integer.toString(n).length();
    }
}

//2.2.15
public class Main {
    public static void main(String[] args) {
        int k = 1000;
        isNumSorted(k);

    }

    private static void isNumSorted(int s) {
        for (int i = 123; i <= s; i++) {
            if(isSorted(divindNumber(i, elOfNum(i)))) System.out.println(i);
        }
    }

    private static int [] divindNumber(int n, int el) {
        int mass[] = new int[el];
        int length = el-1 ;
        int temp = n;
        int i = 0;
        int k = 0;
        while (temp != 0) {
            k=temp/(int)(pow(10,length));
            mass[i] = k;
            temp %= (pow(10,length));
            length--;
            i++;
        }
        return mass;

    }

    private static int elOfNum(int n){
        return  Integer.toString(n).length();
    }

    private static boolean isSorted(int[]mass){
        for (int i = 0; i < mass.length-1; i++){
            if (mass[i] >= mass[i+1]) return false;
            else if( mass[i+1] > mass[i]+1) return false;
        }
        return true;
    }
}
    //2.2.16
public class Main {
    public static void main(String[] args) {
        int n = 3;
        int sum =0;
        for (int i = (int)pow(10,n-1); i < pow(10,n); i++ ){
            if(isNumberOdd(i)){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("Answer: " + sum);
        System.out.println("Even numbers in answer: " +howEvenDigit(sum));
    }


    private static boolean isNumberOdd(int n) {
        int temp = n;
        int k = 0;
        while (temp != 0) {
            k=temp%10;
            if(k%2==0) return false;
            temp/=10;
        }
        return true;
    }

    private static int howEvenDigit(int n) {
        int temp = n;
        int sum = 0;
        int k = 0;
        while (temp != 0) {
            k=temp%10;
            if(k%2==0) sum++;
            temp/=10;
        }
        return sum;
    }
}

//2.2.17
public class Main {
    public static void main(String[] args) {
        int n = 31;
        System.out.println("result: " + count(n));
    }


    private static int sumOfEl(int n){

        int temp = n;
        int sum = 0;
        while (temp!=0){
            sum += temp%10;
            temp/=10;
        }
        return sum;
    }

    private  static int count(int n){
        if(n<=0) return 0;
        return 1+count(n-sumOfEl(n));
    }
}

//3.1.1
public class Main {
    public static void main(String[] args) {
      String [] array = {"intCount","stringPosition", "boolNeTry"};
        for (int i = 0; i < array.length; i++){
            System.out.print(convertToSnakeCase(array[i])+" ");
        }
    }

    public static String convertToSnakeCase(String a){
        char[] charArray = a.toCharArray();
        String snake ="";
        for (int i = 0; i < a.length(); i++){
            char curChar = charArray[i];
            if(Character.isUpperCase(curChar)){
                snake +="_"+Character.toLowerCase(curChar);
            }else snake+=curChar;
        }
        return snake;
    }
}

//3.1.2
public class Main {
    public static void main(String[] args) {
      String per = "my word is my word";
        System.out.print(per.replace("word", "letter"));
    }
}

//3.1.3
public class Main {
    public static void main(String[] args) {
        int counter = 0;
      String per = "my word11 is my word22";
        for (int i = 0; i < per.length(); i++){
            char curChar = per.charAt(i);
            if(curChar<=57 && curChar >= 48){
                counter++;
            }
        }
        System.out.print("Count of numbers in string: "+counter);
    }
}
    
//3.1.4

    public class Main {
    public static void main(String[] args) {
        int countNumber = 0;
        String per = "my word1111 is11 my324 word22";
        boolean isDig = false;

        for (int i = 0; i < per.length(); i++) {
            char curChar = per.charAt(i);
            if (Character.isDigit(curChar)) {
                isDig = true;
                if(isDig && i+1==per.length()) countNumber++;
            } else if (isDig && !Character.isDigit(curChar)) {
                countNumber++;
                isDig = false;
            }
        }
        System.out.print(countNumber);
    }
}

    //3.1.5
    public class Main {
    public static void main(String[] args) {
        int countNumber = 0;
        String per = "     my  word   is     my word     ";
        System.out.print(per.trim().replaceAll("\\s+"," "));
    }
}

    //3.2.1
public class Main {
    public static void main(String[] args) {
        String per = "       my  word   is     my word     ";
        System.out.print("Max spaces: "+findMaxSpace(per));
    }

    private static int findMaxSpace(String inp){
        int maxSpace = 0;
        int currentSpaces = 0;

        char [] charArray = inp.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            char currentChar = inp.charAt(i);
            if(currentChar == 32){
                currentSpaces++;
                if(currentSpaces>maxSpace) maxSpace = currentSpaces;
            }else{
                currentSpaces=0;
            }
        }
        return maxSpace;
    }
}
    //3.2.2

public class Main {
    public static void main(String[] args) {
        String per = "aaa aaa";
        System.out.print(insBAftA(per));
    }

    private static String insBAftA(String inp){
    StringBuilder res = new StringBuilder();
    for (int i =0; i < inp.length(); i++){
        char curChar = inp.charAt(i);
        res.append(curChar);
        if(curChar == 'a')res.append('b');
        }
        return res.toString();
    }
}

//3.2.3
public class Main {
    public static void main(String[] args) {
        String per = "aaabbb";
        System.out.print(palCheck(per));
    }

    private static boolean palCheck(String inp){
        int len = inp.length();
        for (int i =0;i <len/2; i++){
            if(inp.charAt(i)!=inp.charAt(len-i-1)) return false;
        }
        return true;
    }
}
    //3.2.4
public class Main {
    public static void main(String[] args) {
        String per = "информатика";
        System.out.print(makeCake(per));
    }

    private static String makeCake(String inp){
       String p1, p2, p3;
        int a = findLetter(inp,'т');
       p1 = inp.substring(a,a+1);
        a = findLetter(inp, 'о');
       p2 = inp.substring(a, a+1);
        a = findLetter(inp, 'р');
       p3 = inp.substring(a, a+1);
       String res = p1+p2+p3+p1;
       return  res;
    }

    private static int findLetter(String inp, char letter){
        for (int i =0; i < inp.length(); i++){
            char curChar = inp.charAt(i);
            if(curChar == letter) return i;
        }
        return 0;
    }
}
    //3.2.5
public class Main {
    public static void main(String[] args) {
        String per = "aaaaaa информатика";
        System.out.print(countA(per));
    }

    private static int countA(String inp){
        int counter = 0;
      for (int i = 0; i<inp.length(); i++){
          char curChar = inp.charAt(i);
          if(curChar == 'а' || curChar == 'a') counter++;
      }
      return counter;
    }
}
    //3.2.6
public class Main {
    public static void main(String[] args) {
        String per = "информатика";
        System.out.print(newDoubledString(per));
    }

    private static String newDoubledString(String inp) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < inp.length(); i++) {
            char curChar = inp.charAt(i);
            res.append(curChar).append(curChar);
        }
        return res.toString();
    }
}
    //3.2.7
public class Main {
    public static void main(String[] args) {
        String per = " информа тика  ";
        System.out.print(clearString(per));
    }

    private static String clearString(String inp) {
        String res = "";
        for (int i = 0; i < inp.length(); i++) {
            char curChar = inp.charAt(i);
            if(curChar!=' ' && !res.contains(String.valueOf(curChar))){
                res+=curChar;
            }
        }
        return res;
    }
}
    //3.2.8
public class Main {
    public static void main(String[] args) {
        String per = " информа тика nbnffd  ";
        System.out.print(findBiggestStr(per));
    }

    private static String findBiggestStr(String inp) {
        String max = " ";
        String res = "";
       for (int i = 0; i<inp.length(); i++){
           char curChar = inp.charAt(i);
           if(curChar!=' '){
               res+=curChar;
           }else res =" ";
           if(max.length()<res.length()) max = res;
       }
        return max;
    }
}

//3.2.9
public class Main {
    public static void main(String[] args) {
        String per = " иНформа тика nbnffd  ";
      findLowAndBigg(per);
    }

    private static void findLowAndBigg(String inp) {
        int upp = 0;
        int low = 0;
        for (int i = 0; i < inp.length(); i++){
            char curChar = inp.charAt(i);
            if(Character.isUpperCase(curChar)) upp++;
            if(Character.isLowerCase(curChar)) low++;
        }
        System.out.print("Letter in Uppercase: " + upp +"\nIn lowercase: "+low);
    }
}
    //3.2.10
public class Main {
    public static void main(String[] args) {
        String per = " иНформа? тика. nbnffd!  ";
      System.out.print(findCountOfSug(per));
    }

    private static int findCountOfSug(String inp) {
        int countSuq = 0;
       for (int i = 0; i < inp.length(); i++){
           char curChar = inp.charAt(i);
           if(curChar=='!' || curChar == '.' || curChar =='?'){
                countSuq++;
           }
       }
       return countSuq;
    }
}
    //4.1.1
public class Main {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.setV1andV2(1,2);
        System.out.println(t1.sumV1andV2());
        t1.showMax();
    }

    public static class Test1{
        private int v1;
        private int v2;


        public void showV1() {
            System.out.print(v1);
        }
        public void showV2() {
            System.out.print(v2);
        }

        public void setV1andV2(int a, int b){
            v1 = a;
            v2 = b;
        }

        public int sumV1andV2(){
            return v1+v2;
        }

        public void showMax(){
            System.out.print(Math.max(v1, v2));
        }
    }
}
    //4.1.2
public class Main {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        Test2 t22 = new Test2(1,2);
        System.out.println(t2.getV1() +" "+t2.getV2());
        System.out.println(t22.getV1() +" "+t22.getV2());
        t2.setV1(10);
        t2.setV2(20);
        System.out.println("After changes: "+t2.getV1() +" "+t2.getV2());
    }

    public static class Test2{
        private int v1;
        private int v2;

        Test2(int a, int b ){
            v1 = a;
            v2 = b;
        }
        Test2(){
            v1 = 4;
            v2 = 6;
        }

        public int getV1() {
            return v1;
        }
        public void setV1(int a ) {
            v1 =a;
        }
        public int getV2() {
            return v2;
        }
        public void setV2(int a ) {
            v2 =a;
        }
    }
}
