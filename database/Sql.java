package database;

public class Sql {

    /**
     * 
     * @return sql
     */
    public static String selectAllService() {
        String sql = "select * from service";
        return sql;
    }

    /**
     * 
     * @return sql
     */
    public static String insertService() {
        String sql = "insert into service values (?, ?, ?, ?)";
        return sql;
    }
}
