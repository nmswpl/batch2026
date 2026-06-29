package in.co.nmsworks.training.week2.Day1.Day3.Practice;

import java.util.Objects;

public class CustomerProgram {
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    private int customer_id;
    private String customer_name;
    public CustomerProgram( int customer_id,String customer_name) {
        this.customer_name = customer_name;
        this.customer_id = customer_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerProgram that = (CustomerProgram) o;
        return customer_id == that.customer_id && Objects.equals(customer_name, that.customer_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_id, customer_name);
    }

    public static void main(String[] args) {
    CustomerProgram c1=new CustomerProgram(101,"Soundappan");
    CustomerProgram c2=new CustomerProgram(101,"Soundappan");
    System.out.println(c1.equals(c2));

    }
}
