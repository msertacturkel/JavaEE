package org.csystem.spring;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class DataIsle implements RowMapper {	
	public Object mapRow(ResultSet rs, int sutunSay) throws SQLException {		
		while(rs.next()){
			System.out.println(rs.getString(2)+"\t"+rs.getString(3));
		}
		return null;
	}

}
