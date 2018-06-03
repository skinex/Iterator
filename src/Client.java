import Iterator.Cursor;
import Iterator.Table;
import Model.Account;

import java.util.Iterator;

/**
 * Created by User on 03.06.2018.
 */
public class Client {
    public static void main(String[] args) {

        try {
            Table accountTable = new Table();
            Cursor cursor = (Cursor) accountTable.iterator();
            System.out.println("BackWard Step");
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }
            cursor.setPositionToLast();
            System.out.println("Forward step");
            while (cursor.hasPrevious()) {
                System.out.println(cursor.next());
            }
            cursor.reset();
            System.out.println("Filter by login");
            while (cursor.hasNext()) {
                System.out.println(cursor.next().getLogin());
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
