package com.ss.schedule.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ss.schedule.dao.AbstractDao;
import com.ss.schedule.dao.SubjectDao;
import com.ss.schedule.model.Subject;
import com.ss.schedule.model.SubjectType;

@WebServlet("/SubjectController")
public class SubjectController extends HttpServlet {

	@SuppressWarnings("rawtypes")
	private AbstractDao dao;
	private static final long serialVersionUID = 1L;
	public static final String LIST_SUBJECT = "/listSubject.jsp";
    public static final String INSERT_OR_EDIT = "/subject.jsp";
	
    public SubjectController() {
        dao = new SubjectDao();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter( "action" );
 
        if( action.equalsIgnoreCase( "delete" ) ) {
            forward = LIST_SUBJECT;
            int id = Integer.parseInt( request.getParameter("id") );
            dao.delete(id);
            request.setAttribute("subjects", dao.getAll() );
        }
        else if( action.equalsIgnoreCase( "edit" ) ) {
            forward = INSERT_OR_EDIT;
            int id = Integer.parseInt( request.getParameter("id") );
            Subject subject = (Subject) dao.getById(id);
            request.setAttribute("subject", subject);
        }
        else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = INSERT_OR_EDIT;
        }
        else {
            forward = LIST_SUBJECT;
            request.setAttribute("subjects", dao.getAll() );
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
    }
    
    @SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Subject subject = new Subject();
        subject.setName( request.getParameter( "name" ) );
        subject.setType(SubjectType.valueOf(request.getParameter( "type" )));
        subject.setCourse(Integer.parseInt(request.getParameter( "course" )));
       
        String id = request.getParameter("id");
 
        if( id == null || id.isEmpty() )
            dao.add(subject);
        else {
            subject.setID( Integer.parseInt(id) );
            dao.update(subject);
        }
        RequestDispatcher view = request.getRequestDispatcher( LIST_SUBJECT );
        request.setAttribute("subjects", dao.getAll());
        view.forward(request, response);
    }
    
    
}
