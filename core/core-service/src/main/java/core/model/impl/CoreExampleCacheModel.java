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

package core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import core.model.CoreExample;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CoreExample in entity cache.
 *
 * @author binhth
 * @see CoreExample
 * @generated
 */
@ProviderType
public class CoreExampleCacheModel implements CacheModel<CoreExample>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CoreExampleCacheModel)) {
			return false;
		}

		CoreExampleCacheModel coreExampleCacheModel = (CoreExampleCacheModel)obj;

		if (id == coreExampleCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", coreName=");
		sb.append(coreName);
		sb.append(", coreType=");
		sb.append(coreType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CoreExample toEntityModel() {
		CoreExampleImpl coreExampleImpl = new CoreExampleImpl();

		coreExampleImpl.setId(id);

		if (coreName == null) {
			coreExampleImpl.setCoreName(StringPool.BLANK);
		}
		else {
			coreExampleImpl.setCoreName(coreName);
		}

		coreExampleImpl.setCoreType(coreType);

		coreExampleImpl.resetOriginalValues();

		return coreExampleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		coreName = objectInput.readUTF();

		coreType = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (coreName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(coreName);
		}

		objectOutput.writeInt(coreType);
	}

	public long id;
	public String coreName;
	public int coreType;
}