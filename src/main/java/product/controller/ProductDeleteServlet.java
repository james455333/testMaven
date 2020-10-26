package product.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import product.model.ItemBasic;
import product.model.ItemBasicDAO;
import util.HibernateUtil;


/**
 * Servlet implementation class ProductDeleteServlet
 */
@WebServlet("/ProductDeleteServlet")
public class ProductDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Delete(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Delete(request, response);
	}

	private void Delete(HttpServletRequest request,HttpServletResponse response) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		ItemBasicDAO itemBasicDAO = new ItemBasicDAO(session);
		itemBasicDAO.delete(request.getParameter(name));
		
		
	}
	
	
}