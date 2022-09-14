package dev.jacot.repo;

import dev.jacot.models.ImprovCharacter;
import dev.jacot.util.ConnectionUtil;
import java.sql.*;

public class CharacterDAO {
	
	private static ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

	public ImprovCharacter createCharacter(ImprovCharacter ic) 
	{
		// TODO Auto-generated method stub
		
		String sql = "insert into improvcharacter values(default, ?, ?, ?) returning *";
		
		try (Connection conn = cu.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, ic.getFirstName());
			ps.setString(2, ic.getLastName());
			ps.setString(3, ic.getTypeOfCharacter());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return new ImprovCharacter(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4)
						);
			}
		} catch (SQLException e)
		{
			throw new RuntimeException(e);
		}
		
		return null;
	}

}
