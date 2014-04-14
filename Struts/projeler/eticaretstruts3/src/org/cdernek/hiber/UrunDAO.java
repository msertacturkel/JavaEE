package org.cdernek.hiber;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for Urun
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see org.cdernek.hiber.Urun
 * @author MyEclipse Persistence Tools
 */

public class UrunDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(UrunDAO.class);
	// property constants
	public static final String URUN_AD = "urunAd";
	public static final String URUN_KOD = "urunKod";
	public static final String FIYAT = "fiyat";

	public void save(Urun transientInstance) {
		log.debug("saving Urun instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Urun persistentInstance) {
		log.debug("deleting Urun instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Urun findById(java.lang.Integer id) {
		log.debug("getting Urun instance with id: " + id);
		try {
			Urun instance = (Urun) getSession().get("org.cdernek.hiber.Urun",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Urun instance) {
		log.debug("finding Urun instance by example");
		try {
			List results = getSession()
					.createCriteria("org.cdernek.hiber.Urun").add(
							Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Urun instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Urun as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUrunAd(Object urunAd) {
		return findByProperty(URUN_AD, urunAd);
	}

	public List findByUrunKod(Object urunKod) {
		return findByProperty(URUN_KOD, urunKod);
	}

	public List findByFiyat(Object fiyat) {
		return findByProperty(FIYAT, fiyat);
	}

	public List findAll() {
		log.debug("finding all Urun instances");
		try {
			String queryString = "from Urun";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Urun merge(Urun detachedInstance) {
		log.debug("merging Urun instance");
		try {
			Urun result = (Urun) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Urun instance) {
		log.debug("attaching dirty Urun instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Urun instance) {
		log.debug("attaching clean Urun instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}