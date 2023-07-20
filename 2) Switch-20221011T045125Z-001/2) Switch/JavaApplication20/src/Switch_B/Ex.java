 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_B;

/**
 *
 * @author Moatasem
 */
public class Ex {
    
     public static void main(String[] args) {

//        int x = 3;
// 
//        switch( x ) {   // x إختبر قيمة المتغير
// 
//            case 5:   // في حال كانت تساوي 1 سيتم تنفيذ أمر الطباعة الموضوع فيها
//                System.out.println("x contain 5");
//            break;
// 
//            case 2:   // في حال كانت تساوي 2 سيتم تنفيذ أمر الطباعة الموضوع فيها
//                System.out.println("x contain 2");
//            break;
// 
//            case 3:   // في حال كانت تساوي 3 سيتم تنفيذ أمر الطباعة الموضوع فيها
//                System.out.println("x contain 3");
//            break;
// 
//            default:   // في حال كانت لا تساوي أي قيمة من القيم الموضوعة سيتم تنفيذ أمر الطباعة الموضوع فيها
//                System.out.println("x contain a different value");
// 
//        }

      
 
         
         int A = 2;
 
        switch( A ) {   // A إختبر قيمة المتغير
 
            case 1:     // في حال كانت تساوي 1 أو 2 أو 3 سيتم تنفيذ أمر الطباعة
            case 2:
            case 3:
                System.out.println("A contain 1 or 2 or 3");
                break;       // هنا نفذ الامر وخرج من الجملة كلها لوجود بريك
 
            default:   // في حال كانت لا تساوي أي قيمة من القيم الموضوعة سيتم تنفيذ أمر الطباعة الموضوع فيها
               System.out.println("A contain a different value");
}
      

    }
    
}
