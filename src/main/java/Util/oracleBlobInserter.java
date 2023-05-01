//package Util;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.OutputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import oracle.jdbc.driver.OracleResultSet;
//
//public class oracleBlobInserter {
//    public static void main(String args[]){
//
//        Connection con = null;
//
//        PreparedStatement ps = null;
//
//        OracleResultSet rs = null;
//
//        FileInputStream is = null;
//
//        OutputStream os = null;
//
//
//
//        try{
//
//            StringBuffer sqlInsert = new StringBuffer();
//
//            sqlInsert.append(" INSERT INTO SATHAVEGIF ");
//
//            sqlInsert.append(" (gif_name, filedata ) ");
//
//            sqlInsert.append(" values(?, EMPTY_BLOB()) ");
//
//
//
//            StringBuffer sqlSelect = new StringBuffer();
//
//            sqlSelect.append(" SELECT filedata ");
//
//            sqlSelect.append(" FROM SATHAVEGIF ");
//
//            sqlSelect.append(" WHERE gif_name=? FOR UPDATE");
//
//
//
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//
//            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "id", "pwd");
//
//            con.setAutoCommit(false);
//
//            ps = con.prepareStatement(sqlInsert.toString());
//
//            ps.setString(1, "test1.gif");
//
//            ps.executeUpdate();
//
//
//
//            ps = con.prepareStatement(sqlSelect.toString());
//
//            ps.setString(1, " test1.gif");
//
//            rs = (OracleResultSet)ps.executeQuery();
//
//
//
//            File file = null;
//
//            if(rs.next()){
//
//                oracle.sql.BLOB tmpBlob = ((OracleResultSet)rs).getBLOB(1);
//
//                try{
//
//                    file = new File("C:\\test1.gif");
//
//                    is = new FileInputStream(file);
//
//                    os = tmpBlob.getBinaryOutputStream();
//
//                    int size = tmpBlob.getBufferSize();
//
//                    byte[] buffer = new byte[size];
//
//                    int length = -1;
//
//                    while((length = is.read(buffer)) != -1){
//
//                        os.write(buffer, 0, length);
//
//                    }
//
//                    is.close();
//
//                    os.close();
//
//                }catch (java.io.FileNotFoundException fe) {
//
//                    System.err.println (file.getName()
//
//                            + " 파일이 존재하지 않습니다.");
//
//                }finally{
//
//                    if(is != null) is.close();
//
//                    if(os != null) os.close();
//
//
//
//
//
//                }
//
//            }
//
//            System.out.println("지정하신 " + file.getName()
//
//                    + " 파일을 blobtest 테이블에 "
//
//                    + " 저장하였습니다.");
//
//            System.out.println("데이터베이스에 저장한 내용을 조회하는 "
//
//                    + "예제도 만들어보세요.");
//
//
//
//        }catch(Exception e){
//
//            System.out.println("Exception이 발생했습니다."
//
//                    + " 자세한 내용은 다음과 같습니다.");
//
//            System.out.println(e.toString());
//
//        }finally{
//
//            try{
//
//                con.commit();
//
//                con.setAutoCommit(true);
//
//
//
//                if(rs != null) rs.close();
//
//                if(ps != null) ps.close();
//
//                if(con != null) con.close();
//
//            }catch(Exception e){
//
//
//
//            }
//
//        }
//
//    }
//}
