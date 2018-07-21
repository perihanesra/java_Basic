/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfase2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Esfase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    System.out.println("Hello World");
    
    int x =10;
    int y;
    int z;
    z =10;
    System.out.println("Hello World "+z);
    z=20;
    System.out.println("Hello World "+z);
    
    double pi = 3.14 ;
    System.out.println("pi:" +pi);
    
    String s = "benim ismim perihan esra";
    System.out.println("10.karakter:"+s.charAt(10));
    s=s.toUpperCase();
    
    int ilkBosluk= s.indexOf(" ");
    String ilkKelime =s.substring(0,ilkBosluk);
    
    int sonBosluk=s.lastIndexOf(" ");
    String sonKelime= s.substring(10,sonBosluk);
    
    System.out.println("dizgi "+s+" pi: "+pi+" ilk bosluk: "+ ilkBosluk + " son kelime: " + sonKelime );
    
    
   int a=10,b=20,c=30 ;
    System.out.println("sonuc1 : "+(a+b));
    System.out.println("sonuc2:"+a+b);
    System.out.println("sonuc3:"+ a*b);
    System.out.println("sonuc4:"+(float)(float)a/(float)b);
    System.out.println("sonuc5:"+(a-b));
    System.out.println("sonuc6:"+(10>>2));
    System.out.println("sonuc7:"+(10<<2));
    System.out.println("sonuc8:"+(10>>>2));
    System.out.println("sonuc9:"+(a<b));
    
   for(int i=0; i<10;i++){   //loop variable
        System.out.println("Mesaj"+i);
    } 
    
    int i=0;
    while(i<10){
        i++;
        System.out.println("mesaj"+i);
    }
    
    int t=0;
    do{
        System.out.println("ikinci mesaj"+t);
        t++;
    }while(t<10);
    
    int k=10;
    if(k==10){
        System.out.println("k'nin değeri 10'dur");
    }
    else {
        System.out.println("k'nin değeri 10'dan farklıdır");
    }

    for(int v=0 ;v<10;v++){
        if(v==5){
            break;
        }
        System.out.println(v);
    }

    int d[] = new int [5];    
    d[3]=8;
    System.out.println(""+d[3]);
    int m[]={1,3,5,8,2};
    String str[]={"ali","baba","ve","kırk","haramiler"};
    System.out.println(str[2] + m[3] + str[4]);
        
    
    System.out.println("Lüfen notu giriniz");
    Scanner o= new Scanner (System.in);
    int g= o.nextInt();
        if(g==10){
            System.out.println("i'nin değeri 10'dur");
        }
        else if (g<10){
           System.out.println("i'nin değeri 10'dan küçüktür");
       }
        else {
            System.out.println("i'nin değeri 10'dan farklıdır ve 10'dan küçük değildir");
        }
    }
}

