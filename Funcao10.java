/*
Atividade 2
    Implemente uma função recursiva que retorna o Nº elemento da sequência de Fibonacci
        Sequência de Fibonnaci
            0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
*/
package funcao10;
import java.util.Scanner;
    public class Funcao10 {
        static int fibonacci(int n){
            if (n<=0)
                return 0;
            if (n==1)
                return 1;
            
            return fibonacci(n-1) + fibonacci(n-2);
        }
        
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
            System.out.println("Digite o elemento limite da sequencia de Fibonacci a ser mostrado: ");
            int elemento = my_scan.nextInt();
            System.out.println("");
        
            System.out.println("Sequencia de Fibonacci\n");
        for(int i = 0; i <= elemento; i++){
            System.out.println("Elemento " +i+ ": "+fibonacci(i));
        }
    }
}
