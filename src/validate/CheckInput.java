/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/*
 */
public class CheckInput {
    public static boolean isNumber(String input){
       return input.matches("\\d+");//kiem tra xem co phai la so ko
        //regex matches so bat ky,(1-9)
    }
    public static String normalizeInput(String str){
        return str.trim().replaceAll("\\s+", " ");
        //ky  tu khoang trang 
        //trim xoa khoang trang o dau va cuoi chuoi
        //replaceAll tra ve 1 chuoi thay the tat ca cac chuoi ky tu phu hop vs regex
    }
}
