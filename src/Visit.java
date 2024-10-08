import java.util.Date;

public class Visit {
    private final Customer customer;
    private final Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer name, Date date) {
        this.customer = name;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public String getPhoneNumber(){return customer.getPhoneNumber();}

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense *(1- DiscountRate.getServiceDiscountRate(customer.getMemberType())) +
                productExpense * (1-DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    @Override
    public String toString() {
        return "Bill:\n"+"Name: "+getName()+"\n"+
                "Phone number: "+getPhoneNumber()+"\n"+
                "Date: "+date+"\n"+
                "Service expend: "+getServiceExpense()+"\n"+
                "Product expend: "+getProductExpense()+"\n"+
                "   Total expend: "+getTotalExpense();
    }
}
