package Iterator;

import Model.Account;

import java.util.Iterator;

/**
 * Created by User on 03.06.2018.
 */
public class Cursor implements Iterator<Account> {
    private Table table;
    private int position = -1;

    public Cursor(Table table) {
        this.table = table;
    }

    @Override
    public boolean hasNext() {
        if (this.position < table.getLength() - 1) {
            this.position++;
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.position > 0) {
            this.position--;
            return true;
        }
        return false;
    }

    public void setPositionToLast() {
        this.position = table.getLength();
    }

    public void reset() {
        this.position = -1;
    }

    @Override
    public Account next() {
        return table.getAccounts().get(this.position);
    }
}
