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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author binhth
 * @generated
 */
@ProviderType
public class CoreExampleSoap implements Serializable {
	public static CoreExampleSoap toSoapModel(CoreExample model) {
		CoreExampleSoap soapModel = new CoreExampleSoap();

		soapModel.setId(model.getId());
		soapModel.setCoreName(model.getCoreName());
		soapModel.setCoreType(model.getCoreType());

		return soapModel;
	}

	public static CoreExampleSoap[] toSoapModels(CoreExample[] models) {
		CoreExampleSoap[] soapModels = new CoreExampleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CoreExampleSoap[][] toSoapModels(CoreExample[][] models) {
		CoreExampleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CoreExampleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CoreExampleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CoreExampleSoap[] toSoapModels(List<CoreExample> models) {
		List<CoreExampleSoap> soapModels = new ArrayList<CoreExampleSoap>(models.size());

		for (CoreExample model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CoreExampleSoap[soapModels.size()]);
	}

	public CoreExampleSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getCoreName() {
		return _coreName;
	}

	public void setCoreName(String coreName) {
		_coreName = coreName;
	}

	public int getCoreType() {
		return _coreType;
	}

	public void setCoreType(int coreType) {
		_coreType = coreType;
	}

	private long _id;
	private String _coreName;
	private int _coreType;
}