package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassProductolmp;
import model.TblProductocl2;

/**
 * Servlet implementation class controladorproducto
 */
public class controladorproducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladorproducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TblProductocl2 productos= new TblProductocl2();
		ClassProductolmp crud= new ClassProductolmp();
		List<TblProductocl2> Listado = crud.LIstadoProducto();
		
		
		request.setAttribute("listaproductos",Listado);
		
		request.getRequestDispatcher("/Listado.jsp").forward(request, response);
		
		
		
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		    // Obtener los parámetros del formulario
		    String nombre = request.getParameter("nombre");
		    double precio = Double.parseDouble(request.getParameter("precio"));
		    double precioventa= Double.parseDouble(request.getParameter("precioven"));
		    String estado = request.getParameter("estado");
		    String descripcion = request.getParameter("descripcion");

		    // Instanciar las respectivas entidades
		    TblProductocl2 producto = new TblProductocl2();
		    ClassProductolmp crud = new ClassProductolmp();

		    // Asignar valores
		    producto.setNombrecl2(nombre);
		    producto.setPreciocompcl2(precio);
		    producto.setPrecioventacl2(precioventa);
		    producto.setEstadocl2(estado);
		    producto.setDescripcl2(descripcion);

		    // Invocar el método registrar
		    crud.registrarproducto(producto);
		    List<TblProductocl2> listadoproducto = crud.LIstadoProducto();
		    request.setAttribute("listaproducto",listadoproducto );
		    
		    // Redireccionar a la vista
		    request.getRequestDispatcher("/Listado.jsp").forward(request, response);

		  
		    
		        }
		    
		
	
	
	}


