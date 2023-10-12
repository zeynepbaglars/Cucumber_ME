package _JDBC.Gun1;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs=sorguEkrani.executeQuery("select * from language");

        rs.next();
        System.out.println("1.Satır="+ rs.getString(2)); // 2.Column index değil      -ing

        rs.next();
        System.out.println("2.Satır="+ rs.getString("name")); // 2.Column index değil - ital

        rs.previous();
        System.out.println("1.Satır="+ rs.getString(2)); // 2.Column index değil      -ing
    }


}
