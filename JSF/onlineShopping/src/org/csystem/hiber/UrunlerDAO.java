package org.csystem.hiber;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Urunler entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.csystem.hiber.Urunler
 * @author MyEclipse Persistence Tools
 */

public class UrunlerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(UrunlerDAO.class);
	// property constants
	public static final String CATEGORY_ID = "categoryId";
	public static final String URUN_AD = "urunAd";
	public static final String KISA_ACIKLAMA = "kisaAciklama";
	public static final String UZUN_ACIKLAMA = "uzunAciklama";
	public static final String IMAGE_URL = "imageUrl";
	public static final String URUN_KODU = "urunKodu";

	public void save(Urunler transientInstance) {
		log.debug("saving Urunler instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Urunler persistentInstance) {
		log.debug("deleting Urunler instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Urunler findById(java.lang.Integer id) {
		log.debug("getting Urunler instance with id: " + id);
		try {
			Urunler instance = (Urunler) getSession().get(
					"org.csystem.hiber.Urunler", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Urunler instance) {
		log.debug("finding Urunler instance by example");
		try {
			List results = getSession()
					.createCriteria("org.csystem.hiber.Urunler")
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
		log.debug("finding Urunler instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Urunler as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List findByUrunAd(Object urunAd) {
		return findByProperty(URUN_AD, urunAd);
	}

	public List findByKisaAciklama(Object kisaAciklama) {
		return findByProperty(KISA_ACIKLAMA, kisaAciklama);
	}

	public List findByUzunAciklama(Object uzunAciklama) {
		return findByProperty(UZUN_ACIKLAMA, uzunAciklama);
	}

	public List findByImageUrl(Object imageUrl) {
		return findByProperty(IMAGE_URL, imageUrl);
	}

	public List findByUrunKodu(Object urunKodu) {
		return findByProperty(URUN_KODU, urunKodu);
	}

	public List findAll() {
		log.debug("finding all Urunler instances");
		try {
			String queryString = "from Urunler";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Urunler merge(Urunler detachedInstance) {
		log.debug("merging Urunler instance");
		try {
			Urunler result = (Urunler) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Urunler instance) {
		log.debug("attaching dirty Urunler instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Urunler instance) {
		log.debug("attaching clean Urunler instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}