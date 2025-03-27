/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcu;

/**
 *
 * @author abel
 */
public class Calcu {
    
    private float a,b,res;
    
    public Calcu(float n1,float n2)
    {
                this.a=n1;
                this.b=n2;
    
    
    
    }
    
    public float Suma()
    {
        
        int a=5;    
        
        return (this.a+this.b);
    
    
    }
    public float Resta()
    {
    
        return (this.a-this.b);
    
    
    }
    public float Multiplicar()
    {
        
        return(this.a*this.b);
    
    }
    
    public float Dividir()
    {
        
        return (this.a/this.b);
    
    }
            
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    Calcu(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
