/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.OOP;

import java.util.Scanner;

/**
 *
 * @author muhammad noval aula
 */
public class DuckSimulator {
    
    public static void main(String[] args){
        

        boolean IsContinue = true;
        while(IsContinue){
        
        System.out.println("pilih model bebek berdasarkan nomor : ");
        System.out.println("1.Mallard Duck");
        System.out.println("2.RedHead Duck");
        System.out.println("3.Rubber Duck");
        System.out.println("4.Decoy Duck");
        System.out.println("masukkan pilihan anda di bawah sini :");


        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        
        switch(choice){
            case 1 -> {
                Duck jason = new MallarDuck();
                jason.display();
                jason.setFlyBehavior(new FlyWithWings());
                jason.setQuackBehavior(new Quack());
                jason.perfomrFly();
                jason.perfomrQuack();
                break;
            }
            case 2 -> {
                Duck smith = new RedHeadDuck();
                smith.display();
                smith.setFlyBehavior(new FlyWithWings());
                smith.setQuackBehavior(new Quack());
                smith.perfomrFly();
                smith.perfomrQuack();
                break;
            }
            case 3 -> {
                QuackBehavior squeaky = () -> System.out.println("Squeak");
                Duck kuro = new RubberDuck(new FlyNoWay(),squeaky);
                kuro.display();
                kuro.perfomrFly();
                kuro.perfomrQuack();
                break;
            }
            case 4 -> {
                Duck aki = new DecoyDuck();
                aki.display();
                aki.setFlyBehavior(new FlyNoWay());
                aki.setQuackBehavior(new MuteQuack());
                aki.perfomrFly();
                aki.perfomrQuack();
                break;
            }
            default -> System.out.println("pilihsn yang anda masukkan salah");
        }
        System.out.println("mau pilih lagi ?");
        System.out.println("pilih ya atau tidak");

        String action = input.next();
        
        if("tidak".equals(action)){
            IsContinue = false;
            System.out.println("anda berhenti memilih");
        }
    }
        
    }
}
