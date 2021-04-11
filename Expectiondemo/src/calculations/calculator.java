/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author DhanushaDommati
 */
public class calculator {
    public class Calculator {
    private int numA;
    private int numB;

    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
    public int add(){
    
    return numA+numB;
    
    }
    public int sub(){
        return Math.abs(numA-numB);
    }
    public int mul(){
        return numA*numB;
    }
    public int div(){
        return numA/numB;
    }
    
}
    
}
