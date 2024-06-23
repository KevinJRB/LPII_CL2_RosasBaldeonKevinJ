package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iusuario;
import model.TblUsuariocl2;

public class ClassUsuariolmp implements Iusuario{

	@Override
	public void resgistrarUsuario(TblUsuariocl2 Usuario) {
		
		
		
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_RosasBaldeonKevinJ");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(Usuario);
		em.getTransaction().commit();
		em.close();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUsuariocl2> ListadorCliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
