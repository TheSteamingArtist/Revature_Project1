package dev.jacot.repo;

import java.sql.*;

import dev.jacot.models.Setting;
import dev.jacot.util.ConnectionUtil;

public class SettingDAO 
{
	private static ConnectionUtil cu = ConnectionUtil.getConnectionUtil();
	
	public Setting createSetting(Setting s)
	{
		String sql = "insert into setting values (default, ?, ?) returning *";
		
		try(Connection conn = cu.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, s.getPlace());
			ps.setInt(2, s.getImprovPi());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				return new Setting(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3));
			}
		} catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		
		return null;
	}

}
