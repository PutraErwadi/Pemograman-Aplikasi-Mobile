/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author TOSHIBA
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        char gender = 'l';
//        if ( gender == 'L' || gender == 'l' || gender == 'M' || gender =='m' ){
//            System.out.println("laki laki");
//        }
//        else if ( gender == 'P' || gender == 'p' || gender == 'F'||gender =='f'){
//            System.out.println("perempuan");
//        }
//        else{
//        System.out.println("gander tidak invalid");}
////    }
//        
//    
//}
           int nilaiAndroid = 65;
           String paras = "cantik";
           String asal  = "malang";
           
            System.out.println("Apakah saya mau menikah?");
            
           char nilaiAndroidhuruf;         
           if( nilaiAndroid >= 85){
               nilaiAndroidhuruf = 'A';
           }
           else if (nilaiAndroid >= 75 ){
               nilaiAndroidhuruf = 'B';
           }
           else if( nilaiAndroid >= 65){
               nilaiAndroidhuruf = 'C';
           }
           else if (nilaiAndroid >= 55){
               nilaiAndroidhuruf = 'D';
           }
           else{nilaiAndroidhuruf = 'E';
           }
           if( nilaiAndroidhuruf =='A' && paras == "cantik" && asal == "malang"){
               System.out.println("jelas");
           }
           else if  ((nilaiAndroidhuruf == 'A' || nilaiAndroidhuruf == 'C' ) && paras == "cantik" && asal == "malang"){
               System.out.println("ok lah");
           }
           else {
               if(asal == "malang"){
                   System.out.println("saya pikir dulu");
               }
               else{System.out.println("jelas tidak");
           }
    }       
}           