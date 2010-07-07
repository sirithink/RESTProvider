
package novoda.rest.database;

public interface SQLiteInserter {

    public static short CONTINUE = 0;

    public static short BREAK = 1;

    public static short ROLLBACK = 2;

    public int getCount();

    public String getInsertStatement();

    public int getInsertIndex(String field);

    public SQLiteType getType(String field);

    public Object get(String field, int index);

    public String[] getColumns();

    // TODO not fully working yet
    public short onFailure(int index);

    // TODO v2
    // public SQLiteTransactionListener getListener();
}
