/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner c = new Scanner(System.in);
        
        Scanner d = new Scanner(System.in);
        
        
        
        System.out.println("Welcome To CardBoard Box Factory");
        System.out.println("");
        
        CardBoard box = new CardBoard();
        
        System.out.println("Enter Information About Purchase: ");
        System.out.println("Select Size of Cardboard Box:");
        
        System.out.println("");
        //Array for Box Sizes
        String Sizes[]={"Small","Medium","Large","Jumbo"};
        
        System.out.println("");
        for(int i = 0; i<Sizes.length; i++){
            System.out.println(Sizes[i]);
            System.out.println("");
        }
        
        System.out.println("Enter Size");
        String size = c.nextLine();
        box.setSize(size);
        box.on();
        
        System.out.println("Please Enter The Purpose For Shipping");
        String purpose = c.nextLine();
        
        box.setPurpose(purpose);
        
        System.out.println("");
        
        System.out.println("Now Enter Information About Customer:");
        Customer customer = new Customer();
        
        System.out.println("");
        
        System.out.println("Enter Name: ");
        String name = c.nextLine();
        customer.setName(name);
        
        System.out.println("Enter Phone Number: ");
        String number = d.nextLine();
        customer.setNumber(number);
        
        System.out.println("Enter Address: ");
        String address = d.nextLine();
        customer.setAddress(address);
        
        System.out.println("");
        
        System.out.println("Information You Entered: ");
        System.out.println("");
        System.out.println("Customer Name: "+customer.getName());
        System.out.println("Phone Number: "+customer.getNumber());
        System.out.println("Address: "+ customer.getAddress());
        System.out.println("");
        
        System.out.println("Box Size: "+box.getSize());
        System.out.println("Purpose Of Shipping: "+box.getPurpose());
        box.on();
        
    }
    
}
