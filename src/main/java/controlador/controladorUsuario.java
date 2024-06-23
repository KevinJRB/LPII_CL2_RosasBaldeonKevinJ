package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassProductolmp;
import dao.ClassUsuariolmp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class controladorUsuario
 */
public class controladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  
	  
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String usuario = request.getParameter("usuario");
	        String password= request.getParameter("password");

	        // Instanciar las respectivas entidades
	        TblUsuariocl2 usuariologin =new TblUsuariocl2();
	        ClassUsuariolmp crud = new ClassUsuariolmp();

	        // Asignar valores
	        usuariologin.setUsuariocl2(usuario);
	        usuariologin.setPasswordcl2(password);

	        
	        
	        
	            
	        // Invocar el método registrar
	        crud.resgistrarUsuario(usuariologin);
	      
	        if (usuario != null && password != null && usuario.equals("kevin123") && password.equals("kevin")) {
	            // Si las credenciales son válidas, redirigir a la página de inicio o a la página deseada
	        	request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response); // Cambia "index.jsp" por la página a la que quieres redirigir
	        } else {
	            // Si las credenciales son incorrectas, establecer un mensaje de error y volver a mostrar el formulario
	            request.setAttribute("error", "Usuario o contraseña incorrectos.");
	            request.getRequestDispatcher("/login.jsp").forward(request, response);
	        
	        // Redireccionar a la vista
	        
	    }

		
	}
		
	}


