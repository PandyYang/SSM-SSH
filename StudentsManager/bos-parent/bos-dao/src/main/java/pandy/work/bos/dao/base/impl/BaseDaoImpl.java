package pandy.work.bos.dao.base.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import pandy.work.bos.dao.base.IBaseDao;

/**
 * 持久层通用实现
 * hibernateDaoSupport继承之后可以获取一个模板对象 就能够进行增删改查
 * @author Pandy
 *	2018年10月20日
 * @param <T>
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {
	//代表的是某个实体的类型
	private Class<T> entityClass;
	
	//根据类型注入spring工厂中的会话工厂对象sessionFactory
	/*	父类依赖sessionFaction，具有setSessionFactory方法，但这个方法是final的，不能覆写。
		因此需要自己定义一个方法，
		并注入sessionFactory，然后调用父类setSessionFactory方法，将对象传入。
	*/
	@Resource
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	
	//在父类的BaseDaoImpl的构造方法中动态获得entityClass
	public BaseDaoImpl() {
	
		ParameterizedType superclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		//获得父类上声明的泛型数组
		Type[] actualTypeArguments = superclass.getActualTypeArguments();
		//获取泛型参数中的第一个值 也就是指定的类
		entityClass = (Class<T>) actualTypeArguments[0];
	}


	public void save(T entity) {
		this.getHibernateTemplate().save(entity);

	}

	
	public void delete(T entity) {
		this.getHibernateTemplate().delete(entity);

	}

	
	public void update(T entity) {
		this.getHibernateTemplate().update(entity);

	}

	
	public T findById(Serializable id) {
		//entityClass是一个运行时才能进行动态确定的类
		return this.getHibernateTemplate().get(entityClass, id);
		
	}

	
	public List<T> findAll() {
		String sql="from " + entityClass.getSimpleName();
		return (List<T>) this.getHibernateTemplate().find(sql);
	}


/*	//执行更新
	public void executeUpdate(String queryName, Object... objects) {
		// TODO Auto-generated method stub
		Session session = this.getSessionFactory().getCurrentSession();
		//此处也能获取到hbm.xml 这里就是将方法定义好  之后在service层调用  queryname 就是hbm.xml中的query的name
		//其中书写了语句 我们将objects进行遍历 将其中的具体的参数个数提取出来 依次进行赋值 
		Query query = session.getNamedQuery(queryName);
		
		//int length = objects.length;
		int i=0;
		for(Object object : objects) {
			//为hql中的语句进行？赋值
			query.setParameter(i++, object);
			
		}
		
		//执行更新
		query.executeUpdate();
		
	}*/
	//执行更新
		public void executeUpdate(String queryName, Object... objects) {
			Session session = this.getSessionFactory().getCurrentSession();
			Query query = session.getNamedQuery(queryName);
			int i = 0;
			for (Object object : objects) {
				//为HQL语句中的？赋值
				query.setParameter(i++, object);
			}
			//执行更新
			query.executeUpdate();
		}

}
