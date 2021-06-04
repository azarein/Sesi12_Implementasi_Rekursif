/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhamad Yamin
 */
public class ProgramRekursif {
    public static void main(String[] args) {


    // Untuk nomor 1
    System.out.println(pangkat(45, 5));
   
    // Untuk nomor 2
    for (int i = 0; i < 10; i++) {
      System.out.println((i + 2) + " : " + fibonacci(i));
    }
    
    // Untuk momor 3
    System.out.println(deret(2));

    // Untuk nomor 4
    System.out.println(nameRepeat("M. Yamin Teknik Informatika 20E", 2));
  }

  public static int pangkat(int angka, int eksponen) {
    int repeatTime = eksponen - 1;
    if (repeatTime == 0 ) {
      return angka;
    } else {
      return angka * pangkat(angka, eksponen - 1); 
    }

  }

  public static int fibonacci(int n) {
    if ( n == 0 ) {
      return 0;
    }

    if ( n == 1) {
      return 1;
    }

    if ( n == 2 ) {
      return 1;
    }

    return (fibonacci(n - 1) + fibonacci(n - 2));

  }

  public static int deret(int n) {
    System.out.println(n);

    if (n >= 95) {
      return n;
    } else {
      return deret(n + 2);
    }

  }

  public static String nameRepeat(String nama, int n) {
    System.out.println(nama);
    if (n == 99) {
      return nama;
    } else {
      return nameRepeat(nama, n + 1);
    }
  }
} 

