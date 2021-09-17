/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;


public class CardBoard implements SizeAvailability{

    private String size;
    private String purpose;

    public CardBoard() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    
    
    @Override
    public void on() {
    
        System.out.println("This Size is Available");
        
    }

    @Override
    public void off() {
   
        System.out.println("This Size is Unavailable");
    
    }
    
}
