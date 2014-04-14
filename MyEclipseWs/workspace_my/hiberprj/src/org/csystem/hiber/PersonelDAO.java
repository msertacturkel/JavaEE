package org.csystem.hiber;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Personel entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.csystem.hiber.Personel
 * @author MyEclipse Persistence Tools
 */
public class PersonelDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(PersonelDAO.class);
	// property constants
	public static final String AD = "ad";
	public static final String SOYAD = "soyad";
	public static final String MAAS = "maas";

	public void save(Personel transientInstance) {
		log.debug("saving Personel instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Personel persistentInstance) {
		log.debug("deleting Personel instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Personel findById(java.lang.Integer id) {
		log.debug("getting Personel instance with id: " + id);
		try {
			Personel instance = (Personel) getSession().get(
					"org.csystem.hiber.Personel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Personel instance) {
		log.debug("finding Personel instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.Personel")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Personel instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Personel as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAd(Object ad) {
		return findByProperty(AD, ad);
	}

	public List findBySoyad(Object soyad) {
		return findByProperty(SOYAD, soyad);
	}

	public List findByMaas(Object maas) {
		return findByProperty(MAAS, maas);
	}

	public List findAll() {
		log.debug("finding all Personel instances");
		try {
			String queryString = "from Personel";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Personel merge(Personel detachedInstance) {
		log.debug("merging Personel instance");
		try {
			Personel result = (Personel) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Personel instance) {
		log.debug("attaching dirty Personel instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Personel instance) {
		log.debug("attaching clean Personel instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}