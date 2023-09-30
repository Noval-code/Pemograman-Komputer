/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.OOP;

/**
 *
 * @author muhammad noval aula
 */
public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    public void display(){
        System.out.println("I'm a duck Decoy");
    }
    
}
