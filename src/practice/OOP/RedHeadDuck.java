/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.OOP;

/**
 *
 * @author muhammad noval aula
 */
public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }
    @Override
    public void display(){
        System.out.println("I am real red head duck");
    }
    
}
