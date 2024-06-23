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
		System.out.println("Producto registrado en la BD correctamente");
		em.getTransaction().commit();
		em.close();
		
		
	}

	@Override
	public List<TblProductocl2> LIstadoProducto() {
		
		
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_RosasBaldeonKevinJ");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		List<TblProductocl2> Listado = em.createQuery("select c from TblProductocl2 c", TblProductocl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return Listado;
	}

}
