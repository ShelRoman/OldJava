package proff27.session8;

import java.sql.*;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Logger;

public class JDBCTest {

    public static void main(String[] args) throws SQLException {
        Locale.setDefault(Locale.ENGLISH);

        Driver driver = new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        };

        Connection testDB = DriverManager.getConnection("JDBC:oracle:thin:@localhost:1521:XE", "hr", "hr");
        Statement stmnt = testDB.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT FIRST_NAME, EMPLOYEE_ID, PHONE_NUMBER, DEPARTMENT_ID FROM EMPLOYEES");
//        int nameSize = 12;
//        int phoneSize = 20;
//        System.out.println("______________________________________________________");
//        while (rs.next()) {
//            System.out.print("| " + rs.getString(1));
//            int nameSpaces = nameSize - rs.getString(1).length();
//            for (int i = 0; i < nameSpaces; i++) {
//                System.out.print(" ");
//            }
//            System.out.print("|  " + rs.getString(2) + "   ");
//            System.out.print("|  " + rs.getString(3));
//            int phoneSpaces = phoneSize - rs.getString(3).length();
//            for (int i = 0; i < phoneSpaces; i++) {
//                System.out.print(" ");
//            }
//            System.out.print("|  " + rs.getString(4));
//            System.out.print(" |");
//            System.out.println();
//        }
//        System.out.println("______________________________________________________");
        stmnt.executeUpdate("INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES (DEPARTMENTS_seq.nextVal, 'Juniors', 103, 1700)");
        testDB.close();
    }
}
