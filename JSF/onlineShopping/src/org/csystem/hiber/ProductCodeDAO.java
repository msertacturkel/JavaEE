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
 * ProductCode entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.csystem.hiber.ProductCode
 * @author MyEclipse Persistence Tools
 */

public class ProductCodeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ProductCodeDAO.class);
	// property constants
	public static final String DISCOUNT_CODE = "discountCode";
	public static final String DESCRIPTION = "description";

	public void save(ProductCode transientInstance) {
		log.debug("saving ProductCode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProductCode persistentInstance) {
		log.debug("deleting ProductCode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProductCode findById(java.lang.String id) {
		log.debug("getting ProductCode instance with id: " + id);
		try {
			ProductCode instance = (ProductCode) getSession().get(
					"org.csystem.hiber.ProductCode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProductCode instance) {
		log.debug("finding ProductCode instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.ProductCode")
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
		log.debug("finding ProductCode instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ProductCode as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDiscountCode(Object discountCode) {
		return findByProperty(DISCOUNT_CODE, discountCode);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findAll() {
		log.debug("finding all ProductCode instances");
		try {
			String queryString = "from ProductCode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ProductCode merge(ProductCode detachedInstance) {
		log.debug("merging ProductCode instance");
		try {
			ProductCode result = (ProductCode) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ProductCode instance) {
		log.debug("attaching dirty ProductCode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProductCode instance) {
		log.debug("attaching clean ProductCode instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}