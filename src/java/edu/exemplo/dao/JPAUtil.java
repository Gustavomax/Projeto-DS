/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.exemplo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cavbs
 */

public class JPAUtil {
    
    private static final EntityManagerFactory emf =
    Persistence.createEntityManagerFactory("MeuProjetoJSFPU");

  public static EntityManager getEntityManager() {
    return emf.createEntityManager();
  }

    
}
