package MastersSolution;

public interface IMastersProgram {
    public boolean isEligible(float cgpa, String major);

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks);
}
