public class DiscountRate {

    private static final double discountPremium = 0.2;
    private static final double discountGold = 0.15;
    private static final double discountSilver = 0.1;

    public static double getDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return discountPremium;
            case "Gold":
                return discountGold;
            case "Silver":
                return discountSilver;
            default:
                return 0;
        }
    }

}