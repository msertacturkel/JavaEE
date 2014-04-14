package org.csystem.hiber;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Customer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.csystem.hiber.Customer
 * @author MyEclipse Persistence Tools
 */
public class CustomerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CustomerDAO.class);
	// property constants
	public static final String CUSTOMERNAME = "customername";
	public static final String CONTACTLASTNAME = "contactlastname";
	public static final String CONTACTFIRSTNAME = "contactfýrstname";
	public static final String PHONE = "phone";
	public static final String ADDRESSLINE1 = "addresslýne1";
	public static final String ADDRESSLINE2 = "addresslýne2";
	public static final String CITY = "cýty";
	public static final String STATE = "state";
	public static final String POSTALCODE = "postalcode";
	public static final String COUNTRY = "country";
	public static final String SALESREPEMPLOYEENUMBER = "salesrepemployeenumber";
	public static final String CREDITLIMIT = "credýtlýmýt";

	public void save(Customer transientInstance) {
		log.debug("saving Customer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Customer persistentInstance) {
		log.debug("deleting Customer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Customer findById(java.lang.Integer id) {
		log.debug("getting Customer instance with id: " + id);
		try {
			Customer instance = (Customer) getSession().get(
					"org.csystem.hiber.Customer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Customer> findByExample(Customer instance) {
		log.debug("finding Customer instance by example");
		try {
			List<Customer> results = (List<Customer>) getSession()
					.createCriteria("org.csystem.hiber.Customer")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Customer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Customer as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Customer> findByCustomername(Object customername) {
		return findByProperty(CUSTOMERNAME, customername);
	}

	public List<Customer> findByContactlastname(Object contactlastname) {
		return findByProperty(CONTACTLASTNAME, contactlastname);
	}

	public List<Customer> findByContactfýrstname(Object contactfýrstname) {
		return findByProperty(CONTACTFIRSTNAME, contactfýrstname);
	}

	public List<Customer> findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List<Customer> findByAddresslýne1(Object addresslýne1) {
		return findByProperty(ADDRESSLINE1, addresslýne1);
	}

	public List<Customer> findByAddresslýne2(Object addresslýne2) {
		return findByProperty(ADDRESSLINE2, addresslýne2);
	}

	public List<Customer> findByCýty(Object cýty) {
		return findByProperty(CITY, cýty);
	}

	public List<Customer> findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List<Customer> findByPostalcode(Object postalcode) {
		return findByProperty(POSTALCODE, postalcode);
	}

	public List<Customer> findByCountry(Object country) {
		return findByProperty(COUNTRY, country);
	}

	public List<Customer> findBySalesrepemployeenumber(
			Object salesrepemployeenumber) {
		return findByProperty(SALESREPEMPLOYEENUMBER, salesrepemployeenumber);
	}

	public List<Customer> findByCredýtlýmýt(Object credýtlýmýt) {
		return findByProperty(CREDITLIMIT, credýtlýmýt);
	}

	public List findAll() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Customer merge(Customer detachedInstance) {
		log.debug("merging Customer instance");
		try {
			Customer result = (Customer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Customer instance) {
		log.debug("attaching dirty Customer instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Customer instance) {
		log.debug("attaching clean Customer instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}