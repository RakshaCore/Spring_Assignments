package com.xworkz.c_namedquery.repository;

import com.xworkz.c_namedquery.entity.AadharEntity;

import javax.persistence.*;
import java.util.List;

public class AadharRepoImpl implements AadharRepo{
    @Override
    public boolean addAll(List<AadharEntity> list) {
        EntityManagerFactory eMF=null;
        EntityManager eM=null;
        EntityTransaction eT=null;
        try{
            eMF= Persistence.createEntityManagerFactory("ThurTask");
            eM=eMF.createEntityManager();
            eT=eM.getTransaction();
            eT.begin();

            for (AadharEntity ref : list){
                eM.persist(ref);
            }

            eT.commit();

            return true ;
        } catch (Exception e) {
            if (eT.isActive()){
                eT.rollback();
            }
            e.fillInStackTrace();

        }finally {
            eM.close();
        }
        return false;
    }

    @Override
    public AadharEntity findByName(String name) {
        EntityManagerFactory eMF=null;
        EntityManager eM=null;
        EntityTransaction eT=null;
        AadharEntity aadharEntity=null;
        try{
            eMF= Persistence.createEntityManagerFactory("ThurTask");
            eM=eMF.createEntityManager();
            eT=eM.getTransaction();
            eT.begin();

            TypedQuery<AadharEntity> query=eM.createNamedQuery("findByName",AadharEntity.class);
            query.setParameter("name",name);

            aadharEntity =query.getSingleResult();

            eT.commit();
        } catch (Exception e) {
            if (eT.isActive()){
                eT.rollback();
            }
            e.fillInStackTrace();

        }finally {
            eM.close();
        }return aadharEntity;
    }
}
