package org.csystem.hiber;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * MicroMarket entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.csystem.hiber.MicroMarket
 * @author MyEclipse Persistence Tools
 */

public class MicroMarketDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MicroMarketDAO.class);
	// property constants
	public static final String RADIUS = "radius";
	public static final String AREA_LENGTH = "areaLength";
	public static final String AREA_WIDTH = "areaWidth";

	public void save(MicroMarket transientInstance) {
		log.debug("saving MicroMarket instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MicroMarket persistentInstance) {
		log.debug("deleting MicroMarket instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MicroMarket findById(java.lang.String id) {
		log.debug("getting MicroMarket instance with id: " + id);
		try {
			MicroMarket instance = (MicroMarket) getSession().get(
					"org.csystem.hiber.MicroMarket", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MicroMarket instance) {
		log.debug("finding MicroMarket instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.MicroMarket")
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
		log.debug("finding MicroMarket instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MicroMarket as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRadius(Object radius) {
		return findByProperty(RADIUS, radius);
	}

	public List findByAreaLength(Object areaLength) {
		return findByProperty(AREA_LENGTH, areaLength);
	}

	public List findByAreaWidth(Object areaWidth) {
		return findByProperty(AREA_WIDTH, areaWidth);
	}

	public List findAll() {
		log.debug("finding all MicroMarket instances");
		try {
			String queryString = "from MicroMarket";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MicroMarket merge(MicroMarket detachedInstance) {
		log.debug("merging MicroMarket instance");
		try {
			MicroMarket result = (MicroMarket) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MicroMarket instance) {
		log.debug("attaching dirty MicroMarket instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MicroMarket instance) {
		log.debug("attaching clean MicroMarket instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}