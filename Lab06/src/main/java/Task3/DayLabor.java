package Task3;

public class DayLabor extends Worker{
    public DayLabor(int BaseWage, int WorkingDays) {
        super(BaseWage, WorkingDays);
    }

    @Override
    public double YearlyVacation() {
        return 0.0;
    }

    @Override
    public double YearlyWage()
    {
        return 12.0 * (WorkingDays * BaseWage / 25.0);
    }
}
