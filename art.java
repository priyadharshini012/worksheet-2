/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet.pkg2;


import java.util.Scanner;


/**
 *
 * @author DELL
 */
class arithmetic
{
    int a;
    int b;
    
   
   void add(int a,int b)
    {
        System.out.println("sum is"+(a+b));
    }
   void sub(int a,int b)
    {
        System.out.println("difference is"+(a-b));
    }
   void mul(int a,int b)
    {
        System.out.println("product is"+(a*b));
    }
   void division(int a,int b)
    {
        System.out .println("division is"+(a/b));
        
    }
}
public class art {
    public static void main(String[] args){
        arithmetic obj=new arithmetic();
        System.out.println("enter two number");
        Scanner objt=new Scanner(System.in);
        obj.a=objt.nextInt();
        obj.b=objt.nextInt();
        obj.add(obj.a,obj.b);
        obj.sub(obj.a,obj.b);
        obj.mul(obj.a,obj.b);
        obj.division(obj.a,obj.b);
        
    }
    
}
