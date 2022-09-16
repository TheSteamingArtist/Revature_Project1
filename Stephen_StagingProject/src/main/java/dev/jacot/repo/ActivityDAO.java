package dev.jacot.repo;

import dev.jacot.models.Activity;
import dev.jacot.util.ConnectionUtil;
import java.sql.*;

public class ActivityDAO 
{
	private static ConnectionUtil cu = ConnectionUtil.getConnectionUtil();
	
	public Activity createActivity(Activity a)
	{
		String sql = "insert into activities values(default,?, ?) returning *";
		
		try(Connection conn = cu.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, a.getTypeOfActivity());
			ps.setInt(2, a.getImprovid());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				return new Activity(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3)
						);
						
			}
		} catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		
		return null;
	}

}
