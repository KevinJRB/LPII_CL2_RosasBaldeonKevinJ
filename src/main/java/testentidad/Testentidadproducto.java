package testentidad;

import dao.ClassProductolmp;
import model.TblProductocl2;

public class Testentidadproducto {
	public static void main (String[] args){
		TblProductocl2 producto=new TblProductocl2();
		
		ClassProductolmp crud=new ClassProductolmp();
		
		producto.setNombrecl2("monitor");
		producto.setPrecioventacl2(200);
		producto.setPreciocompcl2(150);
		producto.setEstadocl2("Nuevo");
		producto.setDescripcl2("producto para escritorio");
		
		crud.registrarproducto(producto);
	}

}
