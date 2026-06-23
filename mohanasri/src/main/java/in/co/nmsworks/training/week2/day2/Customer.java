package in.co.nmsworks.training.week2.day2;
import java.util.Objects;

public class Customer {

        private String customerId;
        private String name;
        public Customer(String customerId, String name) {
            this.customerId = customerId;
            this.name = name;
        }
        public Customer() {

        }

        public boolean equals(Customer o) {
            if (o == null) {
                return false;
            }
            return Objects.equals(this.customerId, o.customerId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(customerId);
        }
    }





