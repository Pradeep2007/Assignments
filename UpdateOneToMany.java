package com.hibernate.mapping.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOneToMany {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			Cities cities=new Cities();
			Cities find = entityManager.find(Cities.class, 1);
			find.setCityName("balgam");
			System.out.println("Done");
			
			entityTransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
