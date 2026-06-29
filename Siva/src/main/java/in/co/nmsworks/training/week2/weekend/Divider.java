package in.co.nmsworks.training.week2.weekend;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Divider implements Computable{
    private static final Log log = LogFactory.getLog(Divider.class);

    @Override
    public int compute(int a, int b) {
        if (b == 0)
        {
            System.err.println("Divisor cannot be zero");
            return -1;
        }
        return a / b;
    }
}
