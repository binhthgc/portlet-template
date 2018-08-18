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

package core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import core.model.CoreExample;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the core example service. This utility wraps {@link core.service.persistence.impl.CoreExamplePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhth
 * @see CoreExamplePersistence
 * @see core.service.persistence.impl.CoreExamplePersistenceImpl
 * @generated
 */
@ProviderType
public class CoreExampleUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CoreExample coreExample) {
		getPersistence().clearCache(coreExample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CoreExample> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CoreExample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CoreExample> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CoreExample> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CoreExample update(CoreExample coreExample) {
		return getPersistence().update(coreExample);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CoreExample update(CoreExample coreExample,
		ServiceContext serviceContext) {
		return getPersistence().update(coreExample, serviceContext);
	}

	/**
	* Caches the core example in the entity cache if it is enabled.
	*
	* @param coreExample the core example
	*/
	public static void cacheResult(CoreExample coreExample) {
		getPersistence().cacheResult(coreExample);
	}

	/**
	* Caches the core examples in the entity cache if it is enabled.
	*
	* @param coreExamples the core examples
	*/
	public static void cacheResult(List<CoreExample> coreExamples) {
		getPersistence().cacheResult(coreExamples);
	}

	/**
	* Creates a new core example with the primary key. Does not add the core example to the database.
	*
	* @param id the primary key for the new core example
	* @return the new core example
	*/
	public static CoreExample create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the core example with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the core example
	* @return the core example that was removed
	* @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	*/
	public static CoreExample remove(long id)
		throws core.exception.NoSuchCoreExampleException {
		return getPersistence().remove(id);
	}

	public static CoreExample updateImpl(CoreExample coreExample) {
		return getPersistence().updateImpl(coreExample);
	}

	/**
	* Returns the core example with the primary key or throws a {@link NoSuchCoreExampleException} if it could not be found.
	*
	* @param id the primary key of the core example
	* @return the core example
	* @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	*/
	public static CoreExample findByPrimaryKey(long id)
		throws core.exception.NoSuchCoreExampleException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the core example with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the core example
	* @return the core example, or <code>null</code> if a core example with the primary key could not be found
	*/
	public static CoreExample fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, CoreExample> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the core examples.
	*
	* @return the core examples
	*/
	public static List<CoreExample> findAll() {
		return getPersistence().findAll();
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
	public static List<CoreExample> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<CoreExample> findAll(int start, int end,
		OrderByComparator<CoreExample> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<CoreExample> findAll(int start, int end,
		OrderByComparator<CoreExample> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the core examples from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of core examples.
	*
	* @return the number of core examples
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CoreExamplePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CoreExamplePersistence, CoreExamplePersistence> _serviceTracker =
		ServiceTrackerFactory.open(CoreExamplePersistence.class);
}