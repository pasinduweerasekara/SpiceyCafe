
package spicycafe;


public class BillItem {

    float subTotal;
    float productPrice;
    int productQty;
    Float total = 0.0f;
    
    public BillItem(Float price,int quantity){
        productPrice = price;
        productQty = quantity;
    }
   public Float getsubtotal(){
       return productPrice*productQty;
   }
   
   public String getsubtotalString(){
       System.out.println((Float.toString(productPrice*productQty)));
       return Float.toString(productPrice*productQty) ;
       
   }
   
   public Float getTotal(boolean newbill){
       if(newbill){
           return 0.0f;
       }
       else{
           return total+=total;
       }
   }
   
      public String getTotalString(boolean newbill){
       if(newbill){
           return "0";
       }
       else{
           return Float.toString(total+=total);
       }
   }
   
}
