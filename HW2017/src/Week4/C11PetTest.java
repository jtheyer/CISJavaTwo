/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

/**
 *
 * @author 55heyerjt01
 */
public class C11PetTest {
    public static void main(String[] args) {
        C11Pet pc1 = new C11PetCat();
        pc1.setPetName("Boots");
        C11Pet pd1 = new C11PetDog();
        pd1.setPetName("Cujo");
        System.out.println("Cat says: "+ pc1.speak() + "...\nDog says: "
               + pd1.speak());
        System.out.println(pc1.toString());
        System.out.println(pd1.toString());
    }
}
