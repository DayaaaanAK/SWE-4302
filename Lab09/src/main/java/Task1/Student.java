package Task1;

public class Student {
    public String ID;
    public String name;
    public ProgramType program;
    public float CGPA;

    public void set(String id, String name, ProgramType programType, float cgpa) throws InvalidStudentIDException {
        if(id.length()!=3)
        {
            throw new InvalidStudentIDException("Invalid ID");
        }
        else this.ID = id;
        this.name = name;
        this.program = programType;
        this.CGPA = cgpa;
    }
    public void Study()
    {
        System.out.println(this.name + " is studying.");
    }

    public void Play()
    {
        System.out.println(this.name + " is playing.");
    }

    public String Print()
    {
        return ("ID: " + this.ID + " Name: " + this.name + " Program: " + this.program + " CGPA: " + this.CGPA + "\n");
    }

}
