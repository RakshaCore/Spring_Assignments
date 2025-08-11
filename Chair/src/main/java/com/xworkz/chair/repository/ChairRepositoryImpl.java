package com.xworkz.chair.repository;

import com.xworkz.chair.entity.ChairEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ChairRepositoryImpl implements ChairRepository{

    @Override
    public boolean save(ChairEntity chairEntity) {

        EntityManagerFactory entityManagerFactory = null ;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try {


            entityManagerFactory = Persistence.createEntityManagerFactory("Example1");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction =entityManager.getTransaction();

            entityTransaction.begin();

            entityManager.persist(chairEntity);

            entityTransaction.commit();



        }catch (Exception e){

            if (entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManager.close();
        }
        return false;
    }

    @Override
    public ChairEntity getChairEntityByID(int id) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        ChairEntity chairEntity=null;
        try
        {
            entityManagerFactory=Persistence.createEntityManagerFactory("example1");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            chairEntity =entityManager.find(ChairEntity.class,id);
            entityTransaction.commit();
        } catch (Exception e) {
            assert entityTransaction != null;
            if(entityTransaction.isActive())
            {
                entityTransaction.rollback();
            }
        }
        finally {
            entityManager.close();
        }
        return chairEntity;

    }

    @Override
    public boolean updateChairEntityByID(int id, String brand) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        ChairEntity chairEntity= null;

        try {

            entityManagerFactory = Persistence.createEntityManagerFactory("bucket");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            chairEntity = entityManager.find(ChairEntity.class, id);
            chairEntity.setColor(color);
            entityTransaction.commit();
            return true;

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }

        } finally {
            entityManagerFactory.close();

        }
        return false;
    }

    @Override
    public void deleteChairEntityById(int id) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        ChairEntity chairEntity=null;

        try {

            entityManagerFactory= Persistence.createEntityManagerFactory("bucket");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            chairEntity=entityManager.find(ChairEntity.class,id);
            entityManager.remove(chairEntity);
            entityTransaction.commit();


        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }

        }finally {
            entityManagerFactory.close();

        }


    }

    }
}
