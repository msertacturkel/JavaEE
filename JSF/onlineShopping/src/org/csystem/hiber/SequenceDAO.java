package org.csystem.hiber;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Sequence entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.csystem.hiber.Sequence
 * @author MyEclipse Persistence Tools
 */

public class SequenceDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SequenceDAO.class);
	// property constants
	public static final String SEQ_COUNT = "seqCount";

	public void save(Sequence transientInstance) {
		log.debug("saving Sequence instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sequence persistentInstance) {
		log.debug("deleting Sequence instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sequence findById(java.lang.String id) {
		log.debug("getting Sequence instance with id: " + id);
		try {
			Sequence instance = (Sequence) getSession().get(
					"org.csystem.hiber.Sequence", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sequence instance) {
		log.debug("finding Sequence instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.Sequence")
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
		log.debug("finding Sequence instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sequence as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySeqCount(Object seqCount) {
		return findByProperty(SEQ_COUNT, seqCount);
	}

	public List findAll() {
		log.debug("finding all Sequence instances");
		try {
			String queryString = "from Sequence";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sequence merge(Sequence detachedInstance) {
		log.debug("merging Sequence instance");
		try {
			Sequence result = (Sequence) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sequence instance) {
		log.debug("attaching dirty Sequence instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sequence instance) {
		log.debug("attaching clean Sequence instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}