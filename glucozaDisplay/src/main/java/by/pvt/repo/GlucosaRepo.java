package by.pvt.repo;

import by.pvt.pojo.GlucosaParam;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public class GlucosaRepo {

@Autowired
    SessionFactory sessionFactory;
    GlucosaParam param = new GlucosaParam();

    public GlucosaParam getCurrentResult(){
//   return sessionFactory.getCurrentSession()
//               .createQuery("from GlucosaParam order by id DESC limit(1)", GlucosaParam.class)
//           .getSingleResult();

        Query query = sessionFactory.getCurrentSession()
                .createQuery("from GlucosaParam order by id DESC");
        query.setMaxResults(1);
        GlucosaParam last = (GlucosaParam) query.uniqueResult();
        return last;

    }
}
