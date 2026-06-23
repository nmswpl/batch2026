package in.co.nmsworks.training.week2.Day2;

import java.util.Objects;

public class BankCustomer {
    private int id;
    private String customerName;

    public BankCustomer() {
    }

    public BankCustomer(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankCustomer bankCustomer = (BankCustomer) o;
        return id == bankCustomer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
