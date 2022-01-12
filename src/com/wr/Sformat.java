package com.wr;

import java.util.Scanner;

/**
 * Created by admin on 07/01/22.
 */
public class Sformat {

    public static void main(String[] args) {

     M m1 = new M(10, 20);
      int x = M.SINGLETON.geta();
      int y = M.SINGLETON.getb();


    }
}


class M{

    static M SINGLETON = null;

    private int a;
    private int b;

   private M(int x, int y){
        this.a = x;
        this.b = y;
    }
    int geta(){
       return a;
    }

    int getb(){
        return b;
    }

}


class KM extends M{

    KM(int x, int y){
        super( x, y);
    }

}