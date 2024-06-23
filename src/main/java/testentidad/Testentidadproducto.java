package testentidad;

import java.util.List;

import dao.ClassProductolmp;
import model.TblProductocl2;

public class Testentidadproducto {
	public static void main (String[] args){
		
		ClassProductolmp crud=new ClassProductolmp();
		
		
	/*	TblProductocl2 producto1=new TblProductocl2();
		
		
		
		producto1.setNombrecl2("monitor");
		producto1.setPrecioventacl2(200);
		producto1.setPreciocompcl2(150);
		producto1.setEstadocl2("Nuevo");
		producto1.setDescripcl2("producto para escritorio");
		
		crud.registrarproducto(producto1);    */
		
		TblProductocl2 producto1=new TblProductocl2();
		
		
		List<TblProductocl2> lista = crud.LIstadoProducto();
		   for(TblProductocl2 li : lista){
	            System.out.println("Producto: " + li.getIdproductocl2() + " ; " + li.getNombrecl2());
	        }
		
	}

}
