package com.company;

import java.util.Scanner;

public class Main {


    static Boolean Func (int t, int i, int count, int rec)
    {
        if ((rec == t)  && (count == 2)) return true;


        if (count > 2) return false;

        if (t % i == 0)
        {
            return Func(t, ++i, ++count, ++rec);
        }

        return Func(t, ++i , count , ++rec);

    }


    static boolean Pr(int a)
    {
        return Func(a,1, 0, 0 );
    }



    static int Per (int n, int r)
    {


        if ((n % r == 0) &&(r != 0)){

            if (r == 1) return r;
            else if (Pr(r) == true) System.out.println(r);
            else return Per(n, r-1);

        }

        return Per(n, r-1);

    }

    static int L(int u){ return Per(u,u); }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        System.out.println(L(k));

    }
}
