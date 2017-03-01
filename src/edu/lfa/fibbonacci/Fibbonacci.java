
package edu.lfa.fibbonacci;

/**
 *
 * @author kafle
 */
public class Fibbonacci {

    public static void main(String[] args) {
       int a=1;
       int b=1;
       int c=0;
        for (int i = 0; i < 10; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(" " + c);
        }
        
    }
    
}
