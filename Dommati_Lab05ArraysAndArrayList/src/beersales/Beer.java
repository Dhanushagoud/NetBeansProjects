/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

/**
 *
 * @author DhanushaDommati
 */
public class Beer {
    private String beerName;
    private String beerType;
    private String beerStyle;
    private double abv;
    private int[] availablePackages;

    /**
     *
     * @param beerName this is beerName
     * @param beerType this is beerType
     * @param beerStyle this is beerStyle
     * @param abv this is ABV
     * @param availablePackages this is availablePackage
     */
    public Beer(String beerName, String beerType, String beerStyle, double abv, 
            int[] availablePackages) {
        this.beerName = beerName;
        this.beerType = beerType;
        this.beerStyle = beerStyle;
        this.abv = abv;
        this.availablePackages = availablePackages;
    }

    /**
     *gets gives beerName
     * @return beerName
     */
    public String getBeerName() {
        return beerName;
    }

    /**
     *gets gives beerType
     * @return beerType
     */
    public String getBeerType() {
        return beerType;
    }

    /**
     *gets the beerStyle
     * @return beerStyles
     */
    public String getBeerStyle() {
        return beerStyle;
    }

    /**
     *gets gives ABV
     * @return ABV
     */
    public double getAbv() {
        return abv;
    }

    /**
     *gets gives AvailablePackages
     * @return AvailablePackage
     */
    public int[] getAvailablePackages() {
        return availablePackages;
    }
    
    /**
     *gets gives LightBeer
     * @return LightBeer
     */
    public boolean isLightBeer(){
        if(this.abv<=4.0)
            return true;
        else 
            return false;
    }

    /**
     *represents the String 
     * @return beerName,beerType,beerStyle,ABV
     */
    @Override
    public String toString(){
     
   
   String output= "\nBeer Name: "+this.getBeerName()
           +"\nBeer Type: "+this.beerType+", Beer Style: "+this.getBeerStyle()+
           "\nabv: "+this.abv+"%"+
           "\nAvailable in packs of: ";
     String Str="";
       for(int i=0;i<availablePackages.length;i++){
           if(i==availablePackages.length-1)
           Str+=availablePackages[i]+".";
           else
              Str+=availablePackages[i]+", "; 
    
       }
                
   output+=Str;
   output+="\n--------------------";
           
   return output;        
   }
    
}
   
