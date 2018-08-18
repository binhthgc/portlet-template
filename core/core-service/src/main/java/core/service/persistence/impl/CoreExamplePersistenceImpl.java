/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package core.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import core.exception.NoSuchCoreExampleException;

import core.model.CoreExample;

import core.model.impl.CoreExampleImpl;
import core.model.impl.CoreExampleModelImpl;

import core.service.persistence.CoreExamplePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the core example service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhth
 * @see CoreExamplePersistence
 * @see core.service.persistence.CoreExampleUtil
 * @generated
 */
@ProviderType
public class CoreExamplePersistenceImpl extends BasePersistenceImpl<CoreExample>
	implements CoreExamplePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CoreExampleUtil} to access the core example persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CoreExampleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
			CoreExampleModelImpl.FINDER_CACHE_ENABLED, CoreExampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
			CoreExampleModelImpl.FINDER_CACHE_ENABLED, CoreExampleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
			CoreExampleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CoreExamplePersistenceImpl() {
		setModelClass(CoreExample.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "id_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the core example in the entity cache if it is enabled.
	 *
	 * @param coreExample the core example
	 */
	@Override
	public void cacheResult(CoreExample coreExample) {
		entityCache.putResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
			CoreExampleImpl.class, coreExample.getPrimaryKey(), coreExample);

		coreExample.resetOriginalValues();
	}

	/**
	 * Caches the core examples in the entity cache if it is enabled.
	 *
	 * @param coreExamples the core examples
	 */
	@Override
	public void cacheResult(List<CoreExample> coreExamples) {
		for (CoreExample coreExample : coreExamples) {
			if (entityCache.getResult(
						CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
						CoreExampleImpl.class, coreExample.getPrimaryKey()) == null) {
				cacheResult(coreExample);
			}
			else {
				coreExample.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all core examples.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CoreExampleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the core example.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CoreExample coreExample) {
		entityCache.removeResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
			CoreExampleImpl.class, coreExample.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CoreExample> coreExamples) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CoreExample coreExample : coreExamples) {
			entityCache.removeResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
				CoreExampleImpl.class, coreExample.getPrimaryKey());
		}
	}

	/**
	 * Creates a new core example with the primary key. Does not add the core example to the database.
	 *
	 * @param id the primary key for the new core example
	 * @return the new core example
	 */
	@Override
	public CoreExample create(long id) {
		CoreExample coreExample = new CoreExampleImpl();

		coreExample.setNew(true);
		coreExample.setPrimaryKey(id);

		return coreExample;
	}

	/**
	 * Removes the core example with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the core example
	 * @return the core example that was removed
	 * @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	 */
	@Override
	public CoreExample remove(long id) throws NoSuchCoreExampleException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the core example with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the core example
	 * @return the core example that was removed
	 * @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	 */
	@Override
	public CoreExample remove(Serializable primaryKey)
		throws NoSuchCoreExampleException {
		Session session = null;

		try {
			session = openSession();

			CoreExample coreExample = (CoreExample)session.get(CoreExampleImpl.class,
					primaryKey);

			if (coreExample == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCoreExampleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(coreExample);
		}
		catch (NoSuchCoreExampleException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CoreExample removeImpl(CoreExample coreExample) {
		coreExample = toUnwrappedModel(coreExample);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(coreExample)) {
				coreExample = (CoreExample)session.get(CoreExampleImpl.class,
						coreExample.getPrimaryKeyObj());
			}

			if (coreExample != null) {
				session.delete(coreExample);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (coreExample != null) {
			clearCache(coreExample);
		}

		return coreExample;
	}

	@Override
	public CoreExample updateImpl(CoreExample coreExample) {
		coreExample = toUnwrappedModel(coreExample);

		boolean isNew = coreExample.isNew();

		Session session = null;

		try {
			session = openSession();

			if (coreExample.isNew()) {
				session.save(coreExample);

				coreExample.setNew(false);
			}
			else {
				coreExample = (CoreExample)session.merge(coreExample);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
			CoreExampleImpl.class, coreExample.getPrimaryKey(), coreExample,
			false);

		coreExample.resetOriginalValues();

		return coreExample;
	}

	protected CoreExample toUnwrappedModel(CoreExample coreExample) {
		if (coreExample instanceof CoreExampleImpl) {
			return coreExample;
		}

		CoreExampleImpl coreExampleImpl = new CoreExampleImpl();

		coreExampleImpl.setNew(coreExample.isNew());
		coreExampleImpl.setPrimaryKey(coreExample.getPrimaryKey());

		coreExampleImpl.setId(coreExample.getId());
		coreExampleImpl.setCoreName(coreExample.getCoreName());
		coreExampleImpl.setCoreType(coreExample.getCoreType());

		return coreExampleImpl;
	}

	/**
	 * Returns the core example with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the core example
	 * @return the core example
	 * @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	 */
	@Override
	public CoreExample findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCoreExampleException {
		CoreExample coreExample = fetchByPrimaryKey(primaryKey);

		if (coreExample == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCoreExampleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return coreExample;
	}

	/**
	 * Returns the core example with the primary key or throws a {@link NoSuchCoreExampleException} if it could not be found.
	 *
	 * @param id the primary key of the core example
	 * @return the core example
	 * @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	 */
	@Override
	public CoreExample findByPrimaryKey(long id)
		throws NoSuchCoreExampleException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the core example with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the core example
	 * @return the core example, or <code>null</code> if a core example with the primary key could not be found
	 */
	@Override
	public CoreExample fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
				CoreExampleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CoreExample coreExample = (CoreExample)serializable;

		if (coreExample == null) {
			Session session = null;

			try {
				session = openSession();

				coreExample = (CoreExample)session.get(CoreExampleImpl.class,
						primaryKey);

				if (coreExample != null) {
					cacheResult(coreExample);
				}
				else {
					entityCache.putResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
						CoreExampleImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
					CoreExampleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return coreExample;
	}

	/**
	 * Returns the core example with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the core example
	 * @return the core example, or <code>null</code> if a core example with the primary key could not be found
	 */
	@Override
	public CoreExample fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, CoreExample> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CoreExample> map = new HashMap<Serializable, CoreExample>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CoreExample coreExample = fetchByPrimaryKey(primaryKey);

			if (coreExample != null) {
				map.put(primaryKey, coreExample);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
					CoreExampleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CoreExample)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_COREEXAMPLE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (CoreExample coreExample : (List<CoreExample>)q.list()) {
				map.put(coreExample.getPrimaryKeyObj(), coreExample);

				cacheResult(coreExample);

				uncachedPrimaryKeys.remove(coreExample.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CoreExampleModelImpl.ENTITY_CACHE_ENABLED,
					CoreExampleImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the core examples.
	 *
	 * @return the core examples
	 */
	@Override
	public List<CoreExample> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the core examples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CoreExampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of core examples
	 * @param end the upper bound of the range of core examples (not inclusive)
	 * @return the range of core examples
	 */
	@Override
	public List<CoreExample> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the core examples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CoreExampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of core examples
	 * @param end the upper bound of the range of core examples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of core examples
	 */
	@Override
	public List<CoreExample> findAll(int start, int end,
		OrderByComparator<CoreExample> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the core examples.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CoreExampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of core examples
	 * @param end the upper bound of the range of core examples (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of core examples
	 */
	@Override
	public List<CoreExample> findAll(int start, int end,
		OrderByComparator<CoreExample> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CoreExample> list = null;

		if (retrieveFromCache) {
			list = (List<CoreExample>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_COREEXAMPLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COREEXAMPLE;

				if (pagination) {
					sql = sql.concat(CoreExampleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CoreExample>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CoreExample>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the core examples from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CoreExample coreExample : findAll()) {
			remove(coreExample);
		}
	}

	/**
	 * Returns the number of core examples.
	 *
	 * @return the number of core examples
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_COREEXAMPLE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CoreExampleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the core example persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CoreExampleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_COREEXAMPLE = "SELECT coreExample FROM CoreExample coreExample";
	private static final String _SQL_SELECT_COREEXAMPLE_WHERE_PKS_IN = "SELECT coreExample FROM CoreExample coreExample WHERE id_ IN (";
	private static final String _SQL_COUNT_COREEXAMPLE = "SELECT COUNT(coreExample) FROM CoreExample coreExample";
	private static final String _ORDER_BY_ENTITY_ALIAS = "coreExample.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CoreExample exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(CoreExamplePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}