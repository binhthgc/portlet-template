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

package core.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import core.model.CoreExample;
import core.service.CoreExampleLocalServiceUtil;
import core.service.base.CoreExampleLocalServiceBaseImpl;

/**
 * The implementation of the core example local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link core.service.CoreExampleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author binhth
 * @see CoreExampleLocalServiceBaseImpl
 * @see core.service.CoreExampleLocalServiceUtil
 */
public class CoreExampleLocalServiceImpl extends CoreExampleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link core.service.CoreExampleLocalServiceUtil} to access the core example local service.
	 */
	public void callMethodCore() {
		System.out.println("CoreExampleLocalServiceImpl.callMethodCore()");
		CoreExample coreExample = CoreExampleLocalServiceUtil.createCoreExample(CounterLocalServiceUtil.increment(CoreExample.class.getName()));
		coreExample.setCoreName("my add");
		coreExample.setCoreType(1);
		CoreExampleLocalServiceUtil.addCoreExample(coreExample);
		CoreUtil.utilMethod();
	}
}