package org.csystem.hiber;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * DiscountCode entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.csystem.hiber.DiscountCode
 * @author MyEclipse Persistence Tools
 */

public class DiscountCodeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(DiscountCodeDAO.class);
	// property constants
	public static final String RATE = "rate";

	public void save(DiscountCode transientInstance) {
		log.debug("saving DiscountCode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DiscountCode persistentInstance) {
		log.debug("deleting DiscountCode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DiscountCode findById(java.lang.String id) {
		log.debug("getting DiscountCode instance with id: " + id);
		try {
			DiscountCode instance = (DiscountCode) getSession().get(
					"org.csystem.hiber.DiscountCode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DiscountCode instance) {
		log.debug("finding DiscountCode instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.DiscountCode")
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
		log.debug("finding DiscountCode instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from DiscountCode as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRate(Object rate) {
		return findByProperty(RATE, rate);
	}

	public List findAll() {
		log.debug("finding all DiscountCode instances");
		try {
			String queryString = "from DiscountCode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DiscountCode merge(DiscountCode detachedInstance) {
		log.debug("merging DiscountCode instance");
		try {
			DiscountCode result = (DiscountCode) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DiscountCode instance) {
		log.debug("attaching dirty DiscountCode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DiscountCode instance) {
		log.debug("attaching clean DiscountCode instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}