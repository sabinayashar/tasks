package ada.wm2.servlet;

import ada.wm2.helper.SalaryHelper;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NettSalaryServlet extends HttpServlet {
    double grossSalaryAsDouble;
    int yearAsInt;
    double laborFeeAsDouble;
    public boolean isStateSector = false;
    public boolean isPrivateSector = false;
    public double nettSalary = 0;
    public int concession = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String grossSalary = req.getParameter("grossSalary");
        grossSalaryAsDouble = Double.parseDouble(grossSalary);
        String year = req.getParameter("year");
        yearAsInt = Integer.parseInt(year);
        String laborFee = req.getParameter("laborFee");
        laborFeeAsDouble = Double.parseDouble(laborFee);
        String govOrNgov = req.getParameter("sector");
        if ("ngov".equals(govOrNgov)) {
            isPrivateSector = true;
        }
        if ("gov".equals(govOrNgov)) {
            isStateSector = true;
        }
        String concessionChoice = req.getParameter("concession");
        if ("400".equals(concessionChoice)) {
            concession = 400;
        }
        if ("200".equals(concessionChoice)) {
            concession = 200;
        }
        if ("100".equals(concessionChoice)) {
            concession = 100;
        }
        if ("50".equals(concessionChoice)) {
            concession = 50;
        }
            nettSalary = SalaryHelper.grossToNett(grossSalaryAsDouble, yearAsInt, isPrivateSector, isStateSector, laborFeeAsDouble, concession);
            PrintWriter writer = resp.getWriter();
        writer.println("Nett salary: " + nettSalary);

    }
}
