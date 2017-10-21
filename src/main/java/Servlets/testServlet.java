package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.entity.Employee;
import domain.entity.PersonInfo.Person;

@WebServlet("/test")
public class testServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee employee = new Employee();
        Person person = new Person();
        person.getInformation().setName("Bogus");
		PrintWriter out = response.getWriter();
        out.print(person.getInformation().getName());
    }
    
}