package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/paises")
public class PaisesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg = "";

        String lang = request.getParameter("lang");
        if (lang == null)
            lang = "pt";
        switch (lang) {
            case "pt":
                msg = "https://super.abril.com.br/wp-content/uploads/2017/12/rio-de-janeiro.png?w=1024";
                break;
            case "en":
                msg = "https://discovery.sndimg.com/content/dam/images/discovery/editorial/Curiosity/2020/3/Secret-Room-Behind-Mount-Rushmore_Shutterstock.png.rend.hgtvcom.616.347.suffix/1583102952972.png";
                break;
            case "fr":
                msg = "https://www.acidigital.com/imagespp/size680/CatedralNotreDame-Pexels-19122018.jpg";
                break;
            case "de":
                msg = "https://static.reuters.com/resources/r/?m=02&d=20150813&t=2&i=1071661820&r=LYNXNPEB7C0YS&w=800";
                break;
            case "kr":
                msg = "https://www.easyuni.com/media/institution/photo/2018/02/26/dankook.jpg.600x400_q85.jpg";
                break;
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Paises</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p><img src=\"" + msg + "\"></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
