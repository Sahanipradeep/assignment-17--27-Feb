package com.company;


class A
{
    public A()
    {
        //public constructor
    }
}
 
package pack2;

import pack1.*;

class B
{
    A a = new A();   	//Compile Time Error
}



