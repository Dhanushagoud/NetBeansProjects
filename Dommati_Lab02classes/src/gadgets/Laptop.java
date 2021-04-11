/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

/**
 *
 * @author DhanushaDommati 
 */
public class Laptop {
    private String laptopBrand;
    private String processor;
    private double display;
    private int hardDrive;
    private String operatingSystem;
    private boolean touch;

public Laptop(String laptopBrand, String processor, String operatingSystem, int hardDrive, double display, boolean touch) {        
        this.laptopBrand = laptopBrand;
        this.processor = processor;
        this.display = display;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.touch = touch;
    }

    public Laptop() {
    }

    /**
     *
     * @return
     */
    public String getLaptopBrand() {
        return laptopBrand;
    }

    public String getProcessor() {
        return processor;
    }

    public double getDisplay() {
        return display;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public boolean isTouch() {
        return touch;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }

    @Override
    public String toString() {
        return "Laptop Brand: " + laptopBrand +"\nLaptop processor: "+ processor+ "\n Laptop Operating System:" + operatingSystem + "\n Laptop Hard Drive:" +hardDrive+ "\nLaptop Display:" +display+ "\nLaptop Is Touch: "+ touch;
    }
    
    
   
    }
