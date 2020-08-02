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
class vol
{
    double l;
    double b;
    double h;
   



void getvalue()
{
System.out.println("enter the l b h");
Scanner obj=new Scanner(System.in);
l=obj.nextDouble();
b=obj.nextDouble();
h=obj.nextDouble();
}

void cal()
{
    System.out.println("the volume"+" "+ l*b*h);
}
}
public class volume1 {
    public static void main(String[] args){
        vol obj=new vol();
        obj.getvalue();
        obj.cal();
    }
    
}
