package ada.wm2.servlet;

import ada.wm2.helper.SalaryHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GrossSalaryServlet extends HttpServlet {
    double nettSalaryAsDouble;
    public boolean isStateSector = false;
    public boolean isPrivateSector = false;
    public double grossSalary = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nettSalary = req.getParameter("nettSalary");
        nettSalaryAsDouble = Double.parseDouble(nettSalary);
        String govOrNgov = req.getParameter("sector");
        if ("ngov".equals(govOrNgov)) {
            isPrivateSector = true;
        }
        if ("gov".equals(govOrNgov)) {
            isStateSector = true;
        }
        grossSalary = SalaryHelper.nettToGross(nettSalaryAsDouble, isPrivateSector, isStateSector);
        PrintWriter writer = resp.getWriter();
        writer.println("Gross salary: " + grossSalary);
    }
}
