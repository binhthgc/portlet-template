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

package core.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CoreExampleLocalService}.
 *
 * @author binhth
 * @see CoreExampleLocalService
 * @generated
 */
@ProviderType
public class CoreExampleLocalServiceWrapper implements CoreExampleLocalService,
	ServiceWrapper<CoreExampleLocalService> {
	public CoreExampleLocalServiceWrapper(
		CoreExampleLocalService coreExampleLocalService) {
		_coreExampleLocalService = coreExampleLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _coreExampleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _coreExampleLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _coreExampleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coreExampleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coreExampleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the core example to the database. Also notifies the appropriate model listeners.
	*
	* @param coreExample the core example
	* @return the core example that was added
	*/
	@Override
	public core.model.CoreExample addCoreExample(
		core.model.CoreExample coreExample) {
		return _coreExampleLocalService.addCoreExample(coreExample);
	}

	/**
	* Creates a new core example with the primary key. Does not add the core example to the database.
	*
	* @param id the primary key for the new core example
	* @return the new core example
	*/
	@Override
	public core.model.CoreExample createCoreExample(long id) {
		return _coreExampleLocalService.createCoreExample(id);
	}

	/**
	* Deletes the core example from the database. Also notifies the appropriate model listeners.
	*
	* @param coreExample the core example
	* @return the core example that was removed
	*/
	@Override
	public core.model.CoreExample deleteCoreExample(
		core.model.CoreExample coreExample) {
		return _coreExampleLocalService.deleteCoreExample(coreExample);
	}

	/**
	* Deletes the core example with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the core example
	* @return the core example that was removed
	* @throws PortalException if a core example with the primary key could not be found
	*/
	@Override
	public core.model.CoreExample deleteCoreExample(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coreExampleLocalService.deleteCoreExample(id);
	}

	@Override
	public core.model.CoreExample fetchCoreExample(long id) {
		return _coreExampleLocalService.fetchCoreExample(id);
	}

	/**
	* Returns the core example with the primary key.
	*
	* @param id the primary key of the core example
	* @return the core example
	* @throws PortalException if a core example with the primary key could not be found
	*/
	@Override
	public core.model.CoreExample getCoreExample(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _coreExampleLocalService.getCoreExample(id);
	}

	/**
	* Updates the core example in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param coreExample the core example
	* @return the core example that was updated
	*/
	@Override
	public core.model.CoreExample updateCoreExample(
		core.model.CoreExample coreExample) {
		return _coreExampleLocalService.updateCoreExample(coreExample);
	}

	/**
	* Returns the number of core examples.
	*
	* @return the number of core examples
	*/
	@Override
	public int getCoreExamplesCount() {
		return _coreExampleLocalService.getCoreExamplesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _coreExampleLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _coreExampleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link core.model.impl.CoreExampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _coreExampleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link core.model.impl.CoreExampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _coreExampleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the core examples.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link core.model.impl.CoreExampleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of core examples
	* @param end the upper bound of the range of core examples (not inclusive)
	* @return the range of core examples
	*/
	@Override
	public java.util.List<core.model.CoreExample> getCoreExamples(int start,
		int end) {
		return _coreExampleLocalService.getCoreExamples(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _coreExampleLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _coreExampleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void callMethodCore() {
		_coreExampleLocalService.callMethodCore();
	}

	@Override
	public CoreExampleLocalService getWrappedService() {
		return _coreExampleLocalService;
	}

	@Override
	public void setWrappedService(
		CoreExampleLocalService coreExampleLocalService) {
		_coreExampleLocalService = coreExampleLocalService;
	}

	private CoreExampleLocalService _coreExampleLocalService;
}