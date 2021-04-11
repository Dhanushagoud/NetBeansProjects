/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelexpenses;

/**
 *
 * @author DhanushaDommati 
 */
public class RouteCalculator {
    private int routeNo;
    private int numpassengers;
    private boolean isMember;
    private boolean isFirstTimeUser;
    private boolean haveCoupon;
    public static final double COUPON = 5.00;
    public static final double SALESTAX = 7.50;  
    /**
     * RouteCalculator of attribute
     * @param routeNo this is routeNo
     * @param numpassengers this is number passengers
     * @param isMember this is isMember
     * @param isFirstTimeUser this is isFirstTimeUser    
     * @param haveCoupon this is haveCoupon
     */

    public RouteCalculator(int routeNo, int numpassengers, boolean isMember, 
            boolean isFirstTimeUser, boolean haveCoupon) {
        this.routeNo = routeNo;
        this.numpassengers = numpassengers;
        this.isMember = isMember;
        this.isFirstTimeUser = isFirstTimeUser;
        this.haveCoupon = haveCoupon;
        
        
    }
/**
 *  gives RouteNo
 * @return RouteNo
 */
    public int getRouteNo() {
        return routeNo;
    }
/**
 *  gives number passengers
 * @return number passengers
 */
    public int getNumpassengers() {
        return numpassengers;
    }
/**
 * gives IsMember
 * @return IsMember
 */
    public boolean isIsMember() {
        return isMember;
    }
/**
 *  gives isIsFirstTimeUser true or false
 * @return isFirstTimeUser
 */
    public boolean isIsFirstTimeUser() {
        return isFirstTimeUser;
    }
/**
 * gives isHaveCoupon true or false
 * @return haveCoupon
 */
    public boolean isHaveCoupon() {
        return haveCoupon;
    }
/**
 * sets routeNo
 * @param routeNo this is given routeNo
 */
    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }
/**
 * sets number passengers
 * @param numpassengers this is given number passengers
 */
    public void setNumpassengers(int numpassengers) {
        this.numpassengers = numpassengers;
    }
/**
 * sets isMember
 * @param isMember this is given isMember
 */
    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }
/**
 * sets isFirstTimeUser
 * @param isFirstTimeUser this is given isFirstTimeUser
 */
    public void setIsFirstTimeUser(boolean isFirstTimeUser) {
        this.isFirstTimeUser = isFirstTimeUser;
    }
/**
 * sets haveCoupon
 * @param haveCoupon this is given haveCoupon
 */
    public void setHaveCoupon(boolean haveCoupon) {
        this.haveCoupon = haveCoupon;
    }
/**
 * it returns the values in the form of string
 * @return 
 */
    @Override
    public String toString() {
        return  "routeNo=" + routeNo + ", "
                + "numpassengers=" + numpassengers + ","
                + " isMember=" + isMember + ", "
                + "isFirstTimeUser=" + isFirstTimeUser + ","
                + " haveCoupon=" + haveCoupon ;
        
    }
    /**
     *  calculating the calcRouteprice
     * @return calcRouteprice
     */
    private double calcRoutePrice(){
        if(routeNo==1 && numpassengers==1)
            return 35;
        else if(routeNo==1 && numpassengers==2 )
            return 60;
        else if(routeNo==1 && numpassengers>2)
            return numpassengers*26.50;
        if(routeNo==2 && numpassengers==1)
            return 32.89;
        else if(routeNo==2 && numpassengers==2)
            return 53.12;
        else if( routeNo==2 && numpassengers>2)
            return numpassengers*24.20;
        if(routeNo==3 && numpassengers==1)
            return 38;
        else if(routeNo==3 && numpassengers==2)
            return 63.78;
        else 
            return numpassengers*28.78;}
    /**
         *  calculating the calcMembershipDiscount
         * @return calcMembershipDiscount
         */
        private double calcMembershipDiscount(){
            
            if(this.isMember==true && this.numpassengers==1)
            {  
            return this.calcRoutePrice()*(5.0/100.0);
             }
            else if(isMember==true && numpassengers==2)
            { return this.calcRoutePrice()*(6.2/100.0);
            }
            else if (isMember==true && numpassengers>2)
            {
                return this.calcRoutePrice()*(8.0/100.0);
            }
            else
            {
                
                return 0.0;
            }
        }
        double calculateBouns(double paper,double electric){
            return 2*
        }
    /**
         *  calculating the calcFirstTimeUserDiscount
         * @return calcFirstTimeUserDiscount
         */
        private double calcFirstTimeUserDiscount(){
            double routerprice=this.calcRoutePrice();
            if(isFirstTimeUser==true&& numpassengers==1)
            return routerprice*(10.0/100.0);
        else if(isFirstTimeUser==true&& numpassengers==2)
         return routerprice*(7.0/100.0);
        else if (isFirstTimeUser==true && numpassengers>2)
            {
                return routerprice*(4.0/100.0);
            }
            
        else 
            return  0.0;
        }
    /**
         *  calculating the calcCouponDiscount
         * @return calcCouponDiscount
         */    
        private double calcCouponDiscount(){
           
            if(haveCoupon==true)
                return COUPON;
            else
                return 0.0;
        }
     /**
      *  calculating the totalPrice
      * @return totalPrice
      */   
        private double totalPrice()
        {
                 
        double routerprice=this.calcRoutePrice();
        return routerprice-this.calcMembershipDiscount()-this.calcFirstTimeUserDiscount()
                -this.calcCouponDiscount();
        }
        private double totalPriceWithSalesTax()
        {
            return this.totalPrice()+(this.totalPrice()*SALESTAX/100);
        }
    /**
     *  calculating the printReceipt
     * @return printReceipt
     */    
        public String printReceipt()
        {   double mem=this.calcMembershipDiscount();
            return "\nTravel Charges for 1 passengers on route 1:"
                +this.calcRoutePrice()+
                "\nMembership Discount:"+mem
                    +"\nFirst time user discount:"
                +this.calcFirstTimeUserDiscount()
                +"\nCoupon Discount:"
                +(this.calcRoutePrice()-this.calcCouponDiscount())
                +"\nCharges After applying Discount:"
                +this.totalPrice()
                +"\nTotal Price with Tax:"+Math.round(this.totalPriceWithSalesTax()*100.0)/100.0;
            
        }
        
      
        
            
            
     
          
            
        
           
                
            }
            
            
            
            
             
        
        
        
        
    
                    
        
        
            
       
            
    
     
    
    



