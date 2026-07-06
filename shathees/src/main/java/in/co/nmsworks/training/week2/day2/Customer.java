package in.co.nmsworks.training.week2.day2;

import java.util.Objects;

public class Customer {
    private int customerId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId;
    }




    @Override
    public int hashCode() {
        return Objects.hash(customerId, customername);
    }

    private String  customername;

    public Customer() {
    }

    public Customer(int customerId, String customername) {
        this.customerId = customerId;
        this.customername = customername;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }
}
