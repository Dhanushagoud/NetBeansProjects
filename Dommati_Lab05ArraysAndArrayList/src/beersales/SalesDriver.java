/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class SalesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
         Scanner sc=new Scanner(new File("inputFile1.txt")); 
        PrintWriter output =new PrintWriter(new File("outputFileText1.txt"));
        ArrayList<Retailer> retailers=new ArrayList<>();
       
        while(sc.hasNext()){
             sc.nextLine();
            String name=sc.nextLine();
             String address=sc.nextLine();
            Retailer r=new Retailer(name,address);
            do{
                String beerName=sc.nextLine();
                 String beerStyle=sc.nextLine();
               String beerType=sc.next();
                double abv=sc.nextDouble();
                sc.nextLine();
                
               String p = sc.nextLine();
                    String[] arr = p.split(" ");
                    int[] availablePackages = new int[arr.length];
                    for (int i = 0; i < availablePackages.length; i++) {
                        availablePackages[i] = Integer.parseInt(arr[i]);
                        } 
            Beer b=new Beer(beerName,beerType,beerStyle,abv,availablePackages);
            r.addNewBeer(b);
            if(sc.hasNext())
            {
               continue;
          }
           else{
           break;}
            }while(!(sc.hasNext("Retailer")));
        retailers.add(r);
        }
        ArrayList<Beer> beerList=new ArrayList<>();
        System.out.println("***************************************");
        System.out.println("******Walmart Inventory for Beer's*****");
        System.out.println("***************************************");
        output.println("***************************************");
        output.println("******Walmart Inventory for Beer's*****");
        output.println("***************************************");
        
        for(int i=0;i<retailers.size();i++){
            beerList=retailers.get(i).getBeerList();
            if(retailers.get(i).getRetailerName().equalsIgnoreCase("Walmart")){
                System.out.println(retailers.get(i).toString());
                output.println(retailers.get(i).toString());
                
            
            }
           
        }
        System.out.println("***********************************");
        System.out.println("***Remove Wells IPA from Walmart****");
        System.out.print("***********************************");
        output.println("***********************************");
        output.println("***Remove Wells IPA from Walmart****");
        output.print("***********************************");
        
        int index=0;
        Beer wellipBeer=null;
        
        for(int i=0;i<retailers.size();i++){
            beerList=retailers.get(i).getBeerList();
            if(retailers.get(i).getRetailerName().equalsIgnoreCase("Walmart")){
                
                 wellipBeer= retailers.get(i).removeBeer("Wells IPA");
                 System.out.println(wellipBeer);
                 output.println(wellipBeer);
                 
                break;
            }
           
        }
        System.out.println("***************************************");
        System.out.println("****List of strong beer from Hy-Vee****");
        System.out.print("***************************************");
        output.println("***************************************");
        output.println("****List of strong beer from Hy-Vee****");
        output.print("***************************************");
        
        for(int i=0;i<retailers.size();i++){
            beerList=retailers.get(i).getBeerList();
            if(retailers.get(i).getRetailerName().equalsIgnoreCase("Hy-Vee")){
                index=i;
                
            }
           
        }
        ArrayList<Beer> getStrongBeers=retailers.get(index).getStrongBeers();
        for(int i=0;i<getStrongBeers.size();i++){
            System.out.print( getStrongBeers.get(i).toString());
            output.print( getStrongBeers.get(i).toString());
      
        }
        System.out.println("\n******************************************");
        System.out.println("****List of light beer from Sam's Club****");
        System.out.print("******************************************");
        output.println("\n******************************************");
        output.println("****List of light beer from Sam's Club****");
        output.print("******************************************");
        
        for(int i=0;i<retailers.size();i++){
            beerList=retailers.get(i).getBeerList();
            if(retailers.get(i).getRetailerName().equalsIgnoreCase("Sam's Club")){
                index=i;
                
            }
           
        }
         ArrayList<Beer> getLightBeers=retailers.get(index).getLightBeers();
        for(int i=0;i<getLightBeers.size();i++){
            System.out.print( getLightBeers.get(i).toString());
            output.print( getLightBeers.get(i).toString());
        
        }
        System.out.println("\n*************************************************************");
        System.out.println("****Count of different beers available from each retailer****");
        System.out.print("*************************************************************");
        output.println("\n*************************************************************");
        output.println("****Count of different beers available from each retailer****");
        output.print("*************************************************************");
      
       for(Retailer r: retailers){
           System.out.print("\n"+r.getRetailerName()+": ");
           output.print("\n"+r.getRetailerName()+": ");
           
           ArrayList<Beer> beerlistReta=r.getBeerList();
           System.out.print(beerlistReta.size());
            output.print(beerlistReta.size());
       
       }
        System.out.println("");
        System.out.println("\n********************************************************");
        System.out.println("****All different beers available from all retailers****");
        System.out.println("********************************************************");
        output.println("");
        output.println("\n********************************************************");
        output.println("****All different beers available from all retailers****");
        output.println("********************************************************");
         ArrayList<String> listNames = new ArrayList<String>();
        for(Retailer retailer: retailers) {
            for(Beer beer: retailer.getBeerList())   {
                if(!listNames.contains(beer.getBeerName())){
                 listNames.add(beer.getBeerName());
                }
            }
        }
        for(String beerName:listNames) {
            System.out.println(beerName);
            output.println(beerName);
        }
        sc.close();
   output.close();
    }
    
}
    
    

