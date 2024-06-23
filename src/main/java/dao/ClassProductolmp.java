package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iproducto;
import model.TblProductocl2;

public class ClassProductolmp implements Iproducto {

	@Override
	public void registrarproducto(TblProductocl2 producto) {
		

		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_RosasBaldeonKevinJ");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("Producto resgistrado en la BD correctamente");
		em.getTransaction().commit();
		em.close();
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProductocl2> LIstadoProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}
