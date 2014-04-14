package org.csystem.spring;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * A data access object (DAO) providing persistence and search support for
 * Customer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.csystem.spring.Customer
 * @author MyEclipse Persistence Tools
 */
@Repository
public class CustomerDAO {
	private static final Log logger = LogFactory.getLog(CustomerDAO.class);
	// property constants
	public static final String CUSTOMERNAME = "customername";
	public static final String CONTACTLASTNAME = "contactlastname";
	public static final String CONTACTFIRSTNAME = "contactfirstname";
	public static final String PHONE = "phone";
	public static final String ADDRESSLINE1 = "addressline1";
	public static final String ADDRESSLINE2 = "addressline2";
	public static final String CITY = "city";
	public static final String STATE = "state";
	public static final String POSTALCODE = "postalcode";
	public static final String COUNTRY = "country";
	public static final String SALESREPEMPLOYEENUMBER = "salesrepemployeenumber";
	public static final String CREDITLIMIT = "creditlimit";

	private EntityManager entityManager;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Perform an initial save of a previously unsaved Customer entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * <p>
	 * User-managed Spring transaction example:
	 * 
	 * <pre>
	 * TransactionStatus txn = txManager
	 * 		.getTransaction(new DefaultTransactionDefinition());
	 * CustomerDAO.save(entity);
	 * txManager.commit(txn);
	 * </pre>
	 * 
	 * @see <a href =
	 *      "http://www.myeclipseide.com/documentation/quickstarts/jpaspring#containermanaged">Spring
	 *      container-managed transaction examples</a>
	 * @param entity
	 *            Customer entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Customer entity) {
		logger.info("saving Customer instance");
		try {
			getEntityManager().persist(entity);
			logger.info("save successful");
		} catch (RuntimeException re) {
			logger.error("save failed", re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Customer entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * <p>
	 * User-managed Spring transaction example:
	 * 
	 * <pre>
	 * TransactionStatus txn = txManager
	 * 		.getTransaction(new DefaultTransactionDefinition());
	 * CustomerDAO.delete(entity);
	 * txManager.commit(txn);
	 * entity = null;
	 * </pre>
	 * 
	 * @see <a href =
	 *      "http://www.myeclipseide.com/documentation/quickstarts/jpaspring#containermanaged">Spring
	 *      container-managed transaction examples</a>
	 * @param entity
	 *            Customer entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Customer entity) {
		logger.info("deleting Customer instance");
		try {
			entity = getEntityManager().getReference(Customer.class,
					entity.getCustomernumber());
			getEntityManager().remove(entity);
			logger.info("delete successful");
		} catch (RuntimeException re) {
			logger.error("delete failed", re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Customer entity and return it or a copy of it
	 * to the sender. A copy of the Customer entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * <p>
	 * User-managed Spring transaction example:
	 * 
	 * <pre>
	 * TransactionStatus txn = txManager
	 * 		.getTransaction(new DefaultTransactionDefinition());
	 * entity = CustomerDAO.update(entity);
	 * txManager.commit(txn);
	 * </pre>
	 * 
	 * @see <a href =
	 *      "http://www.myeclipseide.com/documentation/quickstarts/jpaspring#containermanaged">Spring
	 *      container-managed transaction examples</a>
	 * @param entity
	 *            Customer entity to update
	 * @return Customer the persisted Customer entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Customer update(Customer entity) {
		logger.info("updating Customer instance");
		try {
			Customer result = getEntityManager().merge(entity);
			logger.info("update successful");
			return result;
		} catch (RuntimeException re) {
			logger.error("update failed", re);
			throw re;
		}
	}

	public Customer findById(Integer id) {
		logger.info("finding Customer instance with id: " + id);
		try {
			Customer instance = getEntityManager().find(Customer.class, id);
			return instance;
		} catch (RuntimeException re) {
			logger.error("find failed", re);
			throw re;
		}
	}

	/**
	 * Find all Customer entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Customer property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<Customer> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Customer> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		logger.info("finding Customer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			final String queryString = "select model from Customer model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			logger.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Customer> findByCustomername(Object customername,
			int... rowStartIdxAndCount) {
		return findByProperty(CUSTOMERNAME, customername, rowStartIdxAndCount);
	}

	public List<Customer> findByContactlastname(Object contactlastname,
			int... rowStartIdxAndCount) {
		return findByProperty(CONTACTLASTNAME, contactlastname,
				rowStartIdxAndCount);
	}

	public List<Customer> findByContactfirstname(Object contactfirstname,
			int... rowStartIdxAndCount) {
		return findByProperty(CONTACTFIRSTNAME, contactfirstname,
				rowStartIdxAndCount);
	}

	public List<Customer> findByPhone(Object phone, int... rowStartIdxAndCount) {
		return findByProperty(PHONE, phone, rowStartIdxAndCount);
	}

	public List<Customer> findByAddressline1(Object addressline1,
			int... rowStartIdxAndCount) {
		return findByProperty(ADDRESSLINE1, addressline1, rowStartIdxAndCount);
	}

	public List<Customer> findByAddressline2(Object addressline2,
			int... rowStartIdxAndCount) {
		return findByProperty(ADDRESSLINE2, addressline2, rowStartIdxAndCount);
	}

	public List<Customer> findByCity(Object city, int... rowStartIdxAndCount) {
		return findByProperty(CITY, city, rowStartIdxAndCount);
	}

	public List<Customer> findByState(Object state, int... rowStartIdxAndCount) {
		return findByProperty(STATE, state, rowStartIdxAndCount);
	}

	public List<Customer> findByPostalcode(Object postalcode,
			int... rowStartIdxAndCount) {
		return findByProperty(POSTALCODE, postalcode, rowStartIdxAndCount);
	}

	public List<Customer> findByCountry(Object country,
			int... rowStartIdxAndCount) {
		return findByProperty(COUNTRY, country, rowStartIdxAndCount);
	}

	public List<Customer> findBySalesrepemployeenumber(
			Object salesrepemployeenumber, int... rowStartIdxAndCount) {
		return findByProperty(SALESREPEMPLOYEENUMBER, salesrepemployeenumber,
				rowStartIdxAndCount);
	}

	public List<Customer> findByCreditlimit(Object creditlimit,
			int... rowStartIdxAndCount) {
		return findByProperty(CREDITLIMIT, creditlimit, rowStartIdxAndCount);
	}

	/**
	 * Find all Customer entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Customer> all Customer entities
	 */
	@SuppressWarnings("unchecked")
	public List<Customer> findAll(final int... rowStartIdxAndCount) {
		logger.info("finding all Customer instances");
		try {
			final String queryString = "select model from Customer model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			logger.error("find all failed", re);
			throw re;
		}
	}

	
}