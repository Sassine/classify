package br.com.sassine.restclassify.api.adress.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.sassine.restclassify.api.adress.entity.AdressEntity;

@Repository
public class RestAdressRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<AdressEntity> findAll() {
		String sql = "from restAdressEntity";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public AdressEntity findById(Long id) {
		String sql = "from restAdressEntity a where a.id = :id";
		Query query = entityManager.createQuery(sql);
		query.setParameter("id", id);
		return (AdressEntity) query.getSingleResult();
	}

	public void save(AdressEntity restAdressEntity) {
		entityManager.persist(restAdressEntity);
	}

	public void delete(AdressEntity restAdressEntity) {
		entityManager.remove(restAdressEntity);
	}

	public void update(AdressEntity restAdressEntity) {
		entityManager.merge(restAdressEntity);
	}

//	public void deleteAllFilters(Long activityId) {
//		entityManager.setFlushMode(FlushModeType.COMMIT);
//
//		String sql1 = "from ActivityFilterSearch f where f.activity.id = :activityId";
//		Query query1 = entityManager.createQuery(sql1);
//		query1.setParameter("activityId", activityId);
//		List<ActivityFilterSearch> resultList = query1.getResultList();
//		
//		if(resultList != null && !resultList.isEmpty()) {
//			for (ActivityFilterSearch af : resultList) {
//				if(af != null) {
//					af.setValue(Collections.EMPTY_LIST);
//					entityManager.remove(af);
//				}				
//			}
//		}
//		
//		String sql2 = "delete ActivityFilterHide f where f.activity.id = :activityId";
//		Query query2 = entityManager.createQuery(sql2);
//		query2.setParameter("activityId", activityId);
//		query2.executeUpdate();
//
//		String sql3 = "delete ActivityFilterGroup f where f.activity.id = :activityId";
//		Query query3 = entityManager.createQuery(sql3);
//		query3.setParameter("activityId", activityId);
//		query3.executeUpdate();
//
//		String sql4 = "delete ActivityFilterOrder f where f.activity.id = :activityId";
//		Query query4 = entityManager.createQuery(sql4);
//		query4.setParameter("activityId", activityId);
//		query4.executeUpdate();
//
//		entityManager.flush();
//	}
}
