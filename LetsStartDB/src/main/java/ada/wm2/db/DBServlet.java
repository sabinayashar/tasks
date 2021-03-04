package ada.wm2.db;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBServlet extends HttpServlet {
    DataSource dataSource;

    @Override
    public void init() throws ServletException {
        Context initContext = null;
        try {
            initContext = new InitialContext();
            Context webContext = (Context)initContext.lookup("java:/comp/env");
            dataSource = (DataSource) webContext.lookup("jdbc/studentdb");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Connection conn = dataSource.getConnection();
            String sql = "select st.st_id, st.st_first, st.st_last, sc.school_name from students st, schools sc where st.school_id = sc.school_id";
            Statement stat = conn.createStatement();
            ResultSet rSet = stat.executeQuery(sql);
            PrintWriter writer = resp.getWriter();
            writer.println("<table><thead><th>ID</th><th>&nbsp;&nbsp;&nbsp;Name</th><th>&nbsp;&nbsp;&nbsp;Surname</th><th>&nbsp;&nbsp;&nbsp;School</th></thead><tbody>");
            while (rSet.next()) {
                writer.println("<tr><td>" + rSet.getInt(1) + "</td><td>&nbsp;&nbsp;" + rSet.getString(2) + "</td><td>&nbsp;&nbsp;" + rSet.getString(3) + "</td><td>&nbsp;&nbsp;" + rSet.getString(4)+"</td></tr>");
            }
            writer.print("</tbody></table>");
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }
}
