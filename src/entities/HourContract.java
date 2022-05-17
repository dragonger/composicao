package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private int hour;

    public HourContract(Date date, double valuePerHour, int hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public HourContract() {
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private double totalValue = valuePerHour * hour;


}
