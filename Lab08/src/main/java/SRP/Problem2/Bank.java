package SRP.Problem2;

import java.util.Map;

public class Bank {
    public Map<String, Account> accounts;

    public void addAccount(String type, Account account)
    {
        this.accounts.put(type,account);
    }

    public void transfer(String id_1, String id_2, long amount)
    {
        for(Account dummy : accounts.values())
        {
            if(id_1 == dummy.accountID)
            {
                dummy.debit(amount);
            }
        }

        for(Account dummy : accounts.values())
        {
            if(id_2 == dummy.accountID)
            {
                dummy.credit(amount);
            }
        }
    }

    public Account findAccountForUser(String id)
    {
        Account account = null;
        for(Account dummy : accounts.values())
        {
            if(id == dummy.accountID)
            {
                account = dummy;
            }
        }
        return account;
    }
}
