/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.OOP;

/**
 *
 * @author muhammad noval aula
 */
public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
        
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
     public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    abstract void display();
    
    public void perfomrFly(){
        flyBehavior.fly();
    }
     public void perfomrQuack(){
        quackBehavior.quack();
    }
     public void swim(){
         System.out.println("All duck float, even decoys!!");
     }
    
}
