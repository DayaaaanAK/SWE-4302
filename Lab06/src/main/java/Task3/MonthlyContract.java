package Task3;

public class MonthlyContract extends Worker{
    public MonthlyContract(int BaseWage, int WorkingDays) {
        super(BaseWage, WorkingDays);
    }

    @Override
    public double YearlyVacation()
    {
        return 21;
    }

    @Override
    public double YearlyWage() {
        return 12.0 * BaseWage;
    }
}
