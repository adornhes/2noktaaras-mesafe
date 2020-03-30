/*
 Ad soyad numara bölüm öğretim türü sorun ne çözüm ne...
 */
package pkg2noktaarasımesafe;

import java.util.Scanner; //Scanner kullanımı için gerekli import yazıldı..


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float xa,ya,xb,yb;                                             // koordinatları tutan float tipi değişkenlerimiz...
        Scanner sc=new Scanner(System.in);                     //Scanner sınıfından sc isimli nesne yarattık..
        System.out.println("A noktasının x koordinatını giriniz: ");
        xa=sc.nextFloat();                                      //Scanner sınıfından hazır fonksiyon kullanarak kullanıcıdan a noktası x koordinatı alındı                                    
        System.out.println("A noktasının y koordinatını giriniz: ");
        ya=sc.nextFloat();                                       //Scanner sınıfından hazır fonksiyon kullanarak kullanıcıdan a noktası y koordinatı alındı 
        System.out.println("A noktası koordianatları:"+xa+"  "+ya);
        System.out.println("B noktasının x koordinatını giriniz: ");
        xb=sc.nextFloat();                                      //Scanner sınıfından hazır fonksiyon kullanarak kullanıcıdan b noktası x koordinatı alındı                                    
        System.out.println("B noktasının y koordinatını giriniz: ");
        yb=sc.nextFloat();                                       //Scanner sınıfından hazır fonksiyon kullanarak kullanıcıdan b noktası y koordinatı alındı 
        System.out.println("B noktası koordianatları:"+xb+"  "+yb);
        float mesafe;
        mesafe=(float) Math.sqrt((Math.pow((xa-xb),2))+(Math.pow((ya-yb),2)));  //matematikten bildiğimiz 2 nokta arası mesafe formülünü kullanım çıkan sonucu float tipine çevirdik..
           System.out.println();   
           System.out.println("2 nokta arası mesafe:"+mesafe);
    }
    
}
