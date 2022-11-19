package MastersTest;

import MastersProblem.DegreeType;
import MastersProblem.MastersProgram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MastersProgramTest {
    @Test
    public void isThesisEligible()
    {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis,"swe");
        boolean isEligible = mp.isEligible(2,"swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f,"swe");
        assertTrue(isEligible);
    }

    @Test
    public void isNonThesisEligible()
    {
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis,"swe");
        boolean isEligible = mp.isEligible(2,"swe");
        assertTrue(isEligible);
        isEligible = mp.isEligible(3.8f,"swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksNonThesis()
    {
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis,"swe");
        int marks = mp.getMarks(80,60,40);
        assertEquals(100,marks);
    }

    @Test
    public void getMarksThesis()
    {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis,"swe");
        int marks = mp.getMarks(80,60,40);
        assertEquals(140,marks);
    }

    @Test
    public void isEligibleThesisDifferentMajor(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }

    @Test
    public void isEligibleNonThesisDifferentMajor(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }
}
