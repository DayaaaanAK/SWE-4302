package SRP.Problem1;

import java.util.List;
import java.util.Objects;

public class Journal {
    public List<Entry> entries;

    public void addEntry(Entry entry)
    {
        this.entries.add(entry);
    }
    public void addEntries(List<Entry> entries)
    {
        this.entries.addAll(entries);
    }
    public void removeEntry(Entry entry)
    {
        for(Entry dummy : this.entries)
        {
            if(Objects.equals(dummy,entry))
            {
                entries.remove(dummy);
            }
        }
    }
}
