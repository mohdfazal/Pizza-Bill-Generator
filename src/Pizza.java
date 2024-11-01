public class Pizza {

    /*the price here will be printed on bill*/
    private int price;
    //all variable prices
    public int basePrice;
    public int ExtraCheesePrice;
    public int ExtraToppingsPrice;
    public int paperBagPrice;

    private String bill;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isGetBill;



    public Pizza(Boolean isVeg){
        // your code goes here
        this.ExtraCheesePrice=80;
        this.paperBagPrice=20;
        if(isVeg){
            this.basePrice=300;
            this.ExtraToppingsPrice=70;
        }else{
            this.basePrice=400;
            this.ExtraToppingsPrice=120;
        }
        this.price=basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.price=this.price+ExtraCheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price=this.price+ExtraToppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price=this.price+ paperBagPrice;
            isToppingsAdded=true;
        }
    }

    public String getBill(){

        // your code goes here
        if(!isGetBill){
            this.bill="Base Price Of The Pizza: "+this.basePrice+"\n";
            if(isCheeseAdded){
                this.bill=this.bill+"Extra Cheese Added: "+this.ExtraCheesePrice+"\n";
            }
            if(isToppingsAdded){
                this.bill=this.bill+"Extra Toppings Added: "+this.ExtraToppingsPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill=this.bill+"Paper bag Added: "+this.paperBagPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isGetBill=true;
        }
        return this.bill;

    }
}