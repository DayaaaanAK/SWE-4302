package MastersSolution;

public class Executive implements IMastersProgram {
    String major;
    public Executive(String major)
    {
        this.major = major;
    }


    @Override
    public boolean isEligible(float cgpa, String major) {
        return this.major.equals(major) && cgpa >= 3.75;
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return theoryMarks;
    }
}
