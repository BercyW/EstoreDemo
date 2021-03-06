package bercy.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * close database
 * 
 * @author Bercy
 *
 */
public final class DbClose {
	/**
	 * close add function & recourse
	 */
	public static void addClose(PreparedStatement pstmt, Connection conn) {
		/*
		 * multiple try-catch will be safe
		 */
		
		try {
			if(pstmt!=null) {
				pstmt.close();
			}
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		try
		{
			if (conn != null)
			{
				conn.close();
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * close recourse
	 * @param pstmt,rs,conn
	 */
	public static void queryClose(PreparedStatement pstmt, ResultSet rs, Connection conn)
	{
		try
		{
			if (pstmt != null)
			{
				pstmt.close();
			}
		} catch (SQLException e1)
		{
			e1.printStackTrace();
		}
		try
		{
			if (rs != null )
			{
				rs.close();
			}
		} catch (SQLException e1)
		{
			e1.printStackTrace();
		}
		try
		{
			if (conn != null)
			{
				conn.close();
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
