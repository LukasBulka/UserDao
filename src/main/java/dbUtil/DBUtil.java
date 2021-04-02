package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "coderslab";
    private static final String DB_URL_WORKSHOP2 =
            "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=UTF8&serverTimezone=UTC";

    public static Connection connectToWorkshopDB() throws SQLException
    {
        return DriverManager.getConnection(DB_URL_WORKSHOP2, DB_USER, DB_PASSWORD);
    }
}
