package java.billingsystem.user;

import java.util.Calendar;
import java.util.Date;

public class Customer extends User {

    private Date startDate;

    public Customer(Date startDate) {
        this.startDate = startDate;
    }

    public Customer(String id, String name, Date startDate) {
        super(id, name);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public double getDiscount(){

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -2);
        Date date = calendar.getTime();
        if(startDate.before(date))
            return 5.0;
        else
            return 0.0;
    }

}
