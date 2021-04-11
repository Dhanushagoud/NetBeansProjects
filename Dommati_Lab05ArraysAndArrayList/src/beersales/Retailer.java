/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

import java.util.ArrayList;

/**
 *
 * @author DhanushaDommati
 */
 public class Retailer {
    private String retailerName;
    private String address;
    private ArrayList<Beer> beerList=new ArrayList<>();

    /**
     *Constructor 
     * @param retailerName
     * @param address
     */
    public Retailer(String retailerName, String address) {
        this.retailerName = retailerName;
        this.address = address;
    }

    /**
     *get gives retailerName
     * @return retailerName
     */
    public String getRetailerName() {
        return retailerName;
    }

    /**
     *get gives address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /** 
     * gives the beerList
     * @return beerList
     */
    public ArrayList<Beer> getBeerList() {
        return beerList;
    }
    
    /**
     *shows beers is available or not
     * @param beerName
     * @return 
     */
    public boolean isAvailable(String beerName){
        boolean output=false;
        for(int i=0;i<beerList.size();i++)
        {
            if(beerList.get(i).getBeerName().equals(beerName))
            output=true;    
        }
        return output;
    }
    
    /**
     *Adds new beer to list
     * @param newBeer
     */
    public void	addNewBeer(Beer newBeer){
         Boolean output=false;
         String beerName=newBeer.getBeerName();
        for(Beer b:beerList){
            if(b.getBeerName().equals(beerName))
                output=true;       
        }
        if(output==false)
            beerList.add(newBeer);
    
    
    }

    /**
     *removes beer from list
     * @param beerName
     * @return 
     */
    public Beer removeBeer(String beerName) {
        for (int i = 0; i < beerList.size(); i++) {
            if (beerList.get(i).getBeerName().equals(beerName)) {
                return beerList.remove(i);

            }
        }
        return null;
    }

    /**
     * gives the StrongBeer
     * @return StrongBeers
     */
    public ArrayList<Beer> getStrongBeers(){
        ArrayList<Beer> strongBeer= new ArrayList<>(); 
        for(Beer b:beerList){
            if(b.getAbv()>4.0){
            strongBeer.add(b);
            
            }
        
        }
    
    return strongBeer;
    }

    /**
     * gives the LightBeers
     * @return LightBeers
     */
    public ArrayList<Beer> getLightBeers() {
        ArrayList<Beer> drinks = new ArrayList<>();

        for (int i = 0; i < beerList.size(); i++) {
            if (beerList.get(i).getAbv() <= 4.0) {
                drinks.add(beerList.get(i));
            }
        }
        return drinks;
    }

    /**
     * gets gives the index of the beerName
     * @param beerName
     * @return 
     */
    public int	getIndexinList(String beerName){
        
        for(int i=0;i<beerList.size();i++){
            if (beerList.get(i).getBeerName().equals(beerName)) {
            return i;
            }
        
        }
    
    return -1;
    }

    /**
     *represents the retailerName and beers informations
     * @return
     */
    @Override
 public String toString(){
        String s= ""+retailerName+
                "\n"+address+
                "\n*****Beers List*****"+
                "\n********************"
                ;
        for(int i=0;i<beerList.size();i++){
            s+=beerList.get(i).toString();
        }
        s+="\n********************\n";
    return s;
    }
}
