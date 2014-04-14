package org.csystem.hiber;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Categories entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.csystem.hiber.Categories
 * @author MyEclipse Persistence Tools
 */

public class CategoriesDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CategoriesDAO.class);
	// property constants
	public static final String CATEGORY_NAME = "categoryName";
	public static final String DESCRIPTION = "description";
	public static final String UST_CATEGORY_ID = "ustCategoryId";

	public void save(Categories transientInstance) {
		log.debug("saving Categories instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Categories persistentInstance) {
		log.debug("deleting Categories instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Categories findById(java.lang.Integer id) {
		log.debug("getting Categories instance with id: " + id);
		try {
			Categories instance = (Categories) getSession().get(
					"org.csystem.hiber.Categories", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Categories instance) {
		log.debug("finding Categories instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.Categories")
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
		log.debug("finding Categories instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Categories as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCategoryName(Object categoryName) {
		return findByProperty(CATEGORY_NAME, categoryName);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByUstCategoryId(Object ustCategoryId) {
		return findByProperty(UST_CATEGORY_ID, ustCategoryId);
	}

	public List findAll() {
		log.debug("finding all Categories instances");
		try {
			String queryString = "from Categories";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Categories merge(Categories detachedInstance) {
		log.debug("merging Categories instance");
		try {
			Categories result = (Categories) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Categories instance) {
		log.debug("attaching dirty Categories instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Categories instance) {
		log.debug("attaching clean Categories instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}