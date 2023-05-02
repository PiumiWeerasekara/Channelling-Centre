/*.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author DEll
 */
public abstract class SuperRepositoryImpl<T,ID extends Serializable>implements SuperRepository<T, ID>{
    
    protected static Session session;
    protected Class<T> entityClass;
    
    public SuperRepositoryImpl(){
        entityClass=(Class<T>)((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
    }

    @Override
    public void setSession(Session session) {
        this.session=session;
    }

    @Override
    public boolean save(T t) throws Exception {
        return (session.save(t)!=null);
    }

    @Override
    public void delete(T t) throws Exception {
        session.delete(t);
    }

    @Override
    public void update(T t) throws Exception {
        session.update(t);
    }

    @Override
    public T findById(ID id) throws Exception {
        return (T) session.get(entityClass, id);
    }

    @Override
    public List<T> findAll() throws Exception {
        System.out.println("fffffffffffffffffffffffffff");
        System.out.println(entityClass.getSimpleName());
        return session.createQuery("FROM "+entityClass.getSimpleName()).list();
    }
    
}
