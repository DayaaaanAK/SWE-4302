package Task3;

public abstract class Worker {
    protected int WorkingDays;
    protected int BaseWage;

    public Worker(int BaseWage, int WorkingDays)
    {
        this.BaseWage = BaseWage;
        this.WorkingDays = WorkingDays;
    }

    public abstract double YearlyVacation();

    public abstract double YearlyWage();
}
