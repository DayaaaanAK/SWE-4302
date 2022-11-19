package SRP.Problem1;

import java.util.List;

public class Library {
    public List<Journal> journals;

    public void save(Journal journal)
    {
        this.journals.add(journal);
    }
    public void save(List<Journal> journals)
    {
        this.journals.addAll(journals);
    }
    public List<Journal> load()
    {
        return journals;
    }
}
