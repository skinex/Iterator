package Iterator;

import Model.Account;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by User on 03.06.2018.
 */
public class Table implements Iterable {
    public List<Account> getAccounts() {
        return accounts;
    }

    private List<Account> accounts = new ArrayList<>();

    public Table() {
        Account tempAccount = new Account("1", "1", "1", "1");
        accounts.add(new Account(tempAccount));
        tempAccount.setLogin("2");
        accounts.add(new Account(tempAccount));
        tempAccount.setLogin("3");
        accounts.add(new Account(tempAccount));
    }

    public Table(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Iterator iterator() {
        return new Cursor(this);
    }

    public int getLength() {
        return accounts.size();
    }

    @Override
    public void forEach(Consumer action) {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            action.accept(iterator.next());
        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
