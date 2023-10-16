package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _01_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select city_id, city, country_id from city");

        rs.last();  // son satıra gittim

        String id= rs.getString(1); // 1.kolon city_id
        System.out.println("id = " + id);

        //eğer field ın tipi uyuyor ise ilgili dönüşüm ile alınabilir.
        int intId= rs.getInt(1);
        System.out.println("intId = " + intId);
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs= sorguEkrani.executeQuery("select * from city");

        ResultSetMetaData rsmd=rs.getMetaData(); //veri harici diğer bilgiler

        int columnCount= rsmd.getColumnCount();

        rs.next(); // ilk satıra gittim
        for (int i = 1; i <= columnCount ; i++) {  // kaç tane başlık varsa hepsini yazıdrabilirm
            System.out.print(rs.getString(i)+" ");
        }

        System.out.println();

        for (int i = 1; i < columnCount; i++) { // colonların isimlerini ve tiplerini aldım
            System.out.print(rsmd.getColumnName(i) +"\t"+rsmd.getColumnTypeName(i)+" ");
        }
    }


}
