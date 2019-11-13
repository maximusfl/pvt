package by.pvt.repo;

import by.pvt.pojo.GlucosaParam;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class GlucosaRepo {

    @Autowired
    SessionFactory sessionFactory;

    public GlucosaParam getCurrentResult() {
//   return sessionFactory.getCurrentSession()
//               .createQuery("from GlucosaParam order by id DESC limit(1)", GlucosaParam.class)
//           .getSingleResult();

        Query query = sessionFactory.getCurrentSession()
                .createQuery("from GlucosaParam order by id DESC");
        query.setMaxResults(1);
        GlucosaParam last = (GlucosaParam) query.uniqueResult();
        return last;

    }

    public List<GlucosaParam> getHistory() {
        return sessionFactory.getCurrentSession()
                .createQuery("from GlucosaParam order by id DESC ", GlucosaParam.class).stream()
                .filter(glucosaParam -> glucosaParam.getGlucosaValue()>11)
                .limit(5)
                .collect(Collectors.toList());



    }


}
