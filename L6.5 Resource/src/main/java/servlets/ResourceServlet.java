package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resourceServer.ResourceServerControllerMBean;
import resources.TestResource;
import sax.ReadXMLFileSAX;

public class ResourceServlet extends HttpServlet {

    public static final String PAGE_URL = "/resources";
    private ResourceServerControllerMBean resourceServerControllerMBean;
    private final Logger logger = LogManager.getLogger(ResourceServlet.class.getSimpleName());


    public ResourceServlet(ResourceServerControllerMBean resourceServerControllerMBean) {
        this.resourceServerControllerMBean = resourceServerControllerMBean;
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {

        String pathName = request.getParameter("path");
        response.setContentType("text/html;charset=utf-8");

        if(pathName != null) {
            logger.info("ResourcePageServlet.doPost(), POST parameter path: " + pathName);
            TestResource testResource = (TestResource) ReadXMLFileSAX.readXML(pathName);
            resourceServerControllerMBean.setTestResource(testResource);
            response.getWriter().println("Http request received, parameter path: " + pathName);
            response.setStatus(HttpServletResponse.SC_OK);
            return;
        } else {
            logger.info("ResourcePageServlet.doPost(), POST parameter path is NULL");
            response.getWriter().println("Http request received, parameter path is NULL");
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}