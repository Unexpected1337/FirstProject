/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise3;

/**
 *
 * @author CP
 */
public class Poo {
    String name;
    int length;
    String cosistens;

    public Poo(String name, int length, String consistens) {
        this.name = name;
        this.length = length;
        this.cosistens = consistens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getCosistens() {
        return cosistens;
    }

    public void setCosistens(String cosistens) {
        this.cosistens = cosistens;
    }
    
    
    public String toString(){
        return "your poos name: " + name + " size:" + length +"cm "+ "consistens: "+
                cosistens +"\n";
    }
}
