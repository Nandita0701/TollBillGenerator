package database;
import java.util.*;

import com.Toll;

import java.sql.*;  
  
public class TollDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "monisa");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Toll e){  
        int status=0;  
        try{  
            Connection con=TollDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Toll(source,destination,price) values (?,?,?)");  
            ps.setString(1,e.getSource());  
            ps.setString(2,e.getDestination());  
            ps.setInt(3,e.getPrice());  
           
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Toll e){  
        int status=0;  
        try{  
            Connection con=TollDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update Toll set source=?,destination=?,price=? where id=?");  
            ps.setString(1,e.getSource());  
            ps.setString(2,e.getDestination());  
            ps.setInt(3,e.getPrice());   
            ps.setInt(4,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
   
    public static Toll getTollById(int id){  
        Toll e=new Toll();  
          
        try{  
            Connection con=TollDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Toll where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setSource(rs.getString(2));  
                e.setDestination(rs.getString(3));  
                e.setPrice(rs.getInt(4));  
            }
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Toll> getAllTolls(){  
        List<Toll> list=new ArrayList<Toll>();  
          
        try{  
            Connection con=TollDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Toll");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Toll e=new Toll();  
                e.setId(rs.getInt(1));  
                e.setSource(rs.getString(2));  
                e.setDestination(rs.getString(3));  
                e.setPrice(rs.getInt(4));    
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  
