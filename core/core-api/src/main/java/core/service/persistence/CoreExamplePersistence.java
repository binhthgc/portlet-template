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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import core.exception.NoSuchCoreExampleException;

import core.model.CoreExample;

/**
 * The persistence interface for the core example service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author binhth
 * @see core.service.persistence.impl.CoreExamplePersistenceImpl
 * @see CoreExampleUtil
 * @generated
 */
@ProviderType
public interface CoreExamplePersistence extends BasePersistence<CoreExample> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CoreExampleUtil} to access the core example persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the core example in the entity cache if it is enabled.
	*
	* @param coreExample the core example
	*/
	public void cacheResult(CoreExample coreExample);

	/**
	* Caches the core examples in the entity cache if it is enabled.
	*
	* @param coreExamples the core examples
	*/
	public void cacheResult(java.util.List<CoreExample> coreExamples);

	/**
	* Creates a new core example with the primary key. Does not add the core example to the database.
	*
	* @param id the primary key for the new core example
	* @return the new core example
	*/
	public CoreExample create(long id);

	/**
	* Removes the core example with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the core example
	* @return the core example that was removed
	* @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	*/
	public CoreExample remove(long id) throws NoSuchCoreExampleException;

	public CoreExample updateImpl(CoreExample coreExample);

	/**
	* Returns the core example with the primary key or throws a {@link NoSuchCoreExampleException} if it could not be found.
	*
	* @param id the primary key of the core example
	* @return the core example
	* @throws NoSuchCoreExampleException if a core example with the primary key could not be found
	*/
	public CoreExample findByPrimaryKey(long id)
		throws NoSuchCoreExampleException;

	/**
	* Returns the core example with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the core example
	* @return the core example, or <code>null</code> if a core example with the primary key could not be found
	*/
	public CoreExample fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, CoreExample> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the core examples.
	*
	* @return the core examples
	*/
	public java.util.List<CoreExample> findAll();

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
	public java.util.List<CoreExample> findAll(int start, int end);

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
	public java.util.List<CoreExample> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CoreExample> orderByComparator);

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
	public java.util.List<CoreExample> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CoreExample> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the core examples from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of core examples.
	*
	* @return the number of core examples
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}