package interfaces;

import java.util.List;

import model.TblProductocl2;

public interface Iproducto {

	public void  registrarproducto(TblProductocl2 producto);
	
	public List<TblProductocl2>LIstadoProducto();
}
