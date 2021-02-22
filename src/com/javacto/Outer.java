package com.javacto;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Outer
{
    int out_x  = 0;
     void method()
    {
        Inner1 inner1 = new Inner1();
        class Inner2   //在方法体内部定义的内部类
        {
            public void method()
            {
                out_x = 3;
            }
        }
        Inner2 inner2 = new Inner2();
    }

    public static class Inner1{
         public static void aaa(){}
    }

}

class Inner3{
    //Outer outer = new Outer();
    //Outer.Inner1 inner1 = outer.new Inner1();
    Outer.Inner1 inner = new Outer.Inner1();



    public static void main(String[] args) {
    }
}

class Ouer
{
     int x=2;
     class Inner
    {
        int x=1;
        void test()
        {
            int a=0;
            System.out.println(x);
        }
    }
}
