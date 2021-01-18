/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursijametodai;

/**
 *
 * @author Andrius
 */
public class RekursijaMetodai {

    public static int fakt(int sk) {
        if (sk == 0) {
            return 1;
        }
        if (sk < 0) {
            return -1;
        }
        return sk * fakt(sk - 1);
    }
    /*
        Faktorialas
        4! = 4 * 3!
        3! = 3 * 2!
        2! = 2 * 1!
        1! = 1 
     */
    public static void main(String[] args) {
        int f = fakt(4);
        System.out.println(f);

//         destytojo varijantas                              
//        int sk = 4;
//        int f = 1;
//        for (int i = sk; i >= 1; i--) {
//            f *= i;
//           
//        }
//        mano budas FAKTORIALAS
//            int sk = 4;
//         for (int i = sk; i > 1; i--) {
//             
//             sk *= i -1;
//             
//            
//        }
    }

}
