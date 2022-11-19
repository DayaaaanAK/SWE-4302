package Task3;

public class Permanent extends Worker{
    public Permanent(int BaseWage, int WorkingDays) {
        super(BaseWage, WorkingDays);
    }

    @Override
    public double YearlyVacation()
    {
        return 20 + WorkingDays * 0.03;
    }

    @Override
    public double YearlyWage() {
        return 12.0 * BaseWage * 3.3;
    }
}
