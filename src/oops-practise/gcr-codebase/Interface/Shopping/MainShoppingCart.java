package Interface.Shopping;

public class MainShoppingCart {
    public static void main(String[] args) {
        String [] coupons= {"A","B","C","D","E"};
        ShoppingCart cart = new ShoppingCart();
        for(String code : coupons){
            if(cart.validateCoupon(code)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
