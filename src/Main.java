import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the sockMerchant function below.
    static int countingValleys(int n, String s) {
        int count = 0, valleys = 0;
        boolean  sea_level = true;

        for(int i = 0; i < n; i++){

            if(s.toCharArray()[i] == 'D'){
                count = count + -1;
                System.out.println("D " + count);
                if(count <= 0 ){
                    sea_level = true;
                }
            }else if (s.toCharArray()[i] == 'U'){
                count = count + 1;
                System.out.println("U "+count);
                if(count >= 0 ){
                    sea_level = false;
                }
            }

            if(count == 0 && sea_level == false){
                valleys++;
            }
        }

        return valleys;
    }
    //array a rotar "a", cantidada a rotar a la izq d
    static int[] rotar_izq(int[] a, int d) {
        int dif = 0, pos = 0;
        int arr_aux [] =  new int[a.length];
        for(int i = 0; i< a.length; i++){
            dif = i - d;
            if(dif < 0){
                pos = a.length + dif;
                arr_aux[pos] = a[i];
            }else{
                pos = dif;
                arr_aux[pos] = a[i];
            }
        }
        return arr_aux;
    }
    static int sockMerchant(int n, int[] ar) {
        int count = 0, num, j = 0, suma = 0;
        int [] aux = new int [n];
        int [] cantidad =  new int [n];
        for(int i = 0; i < ar.length; i++){
            num = ar[i];
            if(comprobar(num, aux) == false ){
                aux[j] = num;
                j++;
            }
        }
        for(int k = 0; k < aux.length; k++){
            for(int h = 0; h < ar.length; h++){
                System.out.println("aux " + aux[k] + " ar " + ar[h]);
                if(aux[k] == ar[h]){
                    cantidad[k] = count + 1;
                    count++;
                }
            }
            count = 0;
        }
        for(int l = 0; l < cantidad.length; l++){
            suma = (cantidad[l] / 2) + suma;
        }
        return suma;
    }
    static boolean comprobar(int num, int [] aux){
        boolean flag =  false;
        for(int i = 0; i < aux.length; i++){
            if(num == aux[i]){
                //System.out.println("aca");
                flag = true;
                break;
            }
        }
        return flag;
    }

    static void let(String linea){
        int ed;
        for(ed = 0; ed < 2; ed++){
            for(int i = 0; i < linea.length(); i++){
                if(ed == 0 && i%2 == 0){
                    System.out.print(linea.toCharArray()[i]);
                }
                if(ed == 1 && i % 2 != 0){
                    System.out.print(linea.toCharArray()[i]);
                }
            }
            System.out.print(" ");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        /*int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
        */

        /*int n;
        String linea;
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" n " + n);
        for(int i = 0;i < n; i++){
            linea = scanner.nextLine();

            let(linea);
            System.out.println();
        }*/
        String dummy = "";

        //System.out.println("valleys " + countingValleys(10, dummy));

    }
}