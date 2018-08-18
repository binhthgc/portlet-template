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

package core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CoreExample}.
 * </p>
 *
 * @author binhth
 * @see CoreExample
 * @generated
 */
@ProviderType
public class CoreExampleWrapper implements CoreExample,
	ModelWrapper<CoreExample> {
	public CoreExampleWrapper(CoreExample coreExample) {
		_coreExample = coreExample;
	}

	@Override
	public Class<?> getModelClass() {
		return CoreExample.class;
	}

	@Override
	public String getModelClassName() {
		return CoreExample.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("coreName", getCoreName());
		attributes.put("coreType", getCoreType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String coreName = (String)attributes.get("coreName");

		if (coreName != null) {
			setCoreName(coreName);
		}

		Integer coreType = (Integer)attributes.get("coreType");

		if (coreType != null) {
			setCoreType(coreType);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _coreExample.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _coreExample.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _coreExample.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _coreExample.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<core.model.CoreExample> toCacheModel() {
		return _coreExample.toCacheModel();
	}

	@Override
	public core.model.CoreExample toEscapedModel() {
		return new CoreExampleWrapper(_coreExample.toEscapedModel());
	}

	@Override
	public core.model.CoreExample toUnescapedModel() {
		return new CoreExampleWrapper(_coreExample.toUnescapedModel());
	}

	@Override
	public int compareTo(core.model.CoreExample coreExample) {
		return _coreExample.compareTo(coreExample);
	}

	/**
	* Returns the core type of this core example.
	*
	* @return the core type of this core example
	*/
	@Override
	public int getCoreType() {
		return _coreExample.getCoreType();
	}

	@Override
	public int hashCode() {
		return _coreExample.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _coreExample.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CoreExampleWrapper((CoreExample)_coreExample.clone());
	}

	/**
	* Returns the core name of this core example.
	*
	* @return the core name of this core example
	*/
	@Override
	public java.lang.String getCoreName() {
		return _coreExample.getCoreName();
	}

	@Override
	public java.lang.String toString() {
		return _coreExample.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _coreExample.toXmlString();
	}

	/**
	* Returns the ID of this core example.
	*
	* @return the ID of this core example
	*/
	@Override
	public long getId() {
		return _coreExample.getId();
	}

	/**
	* Returns the primary key of this core example.
	*
	* @return the primary key of this core example
	*/
	@Override
	public long getPrimaryKey() {
		return _coreExample.getPrimaryKey();
	}

	@Override
	public void persist() {
		_coreExample.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_coreExample.setCachedModel(cachedModel);
	}

	/**
	* Sets the core name of this core example.
	*
	* @param coreName the core name of this core example
	*/
	@Override
	public void setCoreName(java.lang.String coreName) {
		_coreExample.setCoreName(coreName);
	}

	/**
	* Sets the core type of this core example.
	*
	* @param coreType the core type of this core example
	*/
	@Override
	public void setCoreType(int coreType) {
		_coreExample.setCoreType(coreType);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_coreExample.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_coreExample.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_coreExample.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this core example.
	*
	* @param id the ID of this core example
	*/
	@Override
	public void setId(long id) {
		_coreExample.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_coreExample.setNew(n);
	}

	/**
	* Sets the primary key of this core example.
	*
	* @param primaryKey the primary key of this core example
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_coreExample.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_coreExample.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CoreExampleWrapper)) {
			return false;
		}

		CoreExampleWrapper coreExampleWrapper = (CoreExampleWrapper)obj;

		if (Objects.equals(_coreExample, coreExampleWrapper._coreExample)) {
			return true;
		}

		return false;
	}

	@Override
	public CoreExample getWrappedModel() {
		return _coreExample;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _coreExample.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _coreExample.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_coreExample.resetOriginalValues();
	}

	private final CoreExample _coreExample;
}