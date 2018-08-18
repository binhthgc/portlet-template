package core.service.listenner;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

import core.model.CoreExample;

@Component(immediate = true, service = ModelListener.class)
public class CoreExampleListenner extends BaseModelListener<CoreExample> {

	@Override
	public void onAfterCreate(CoreExample model) throws ModelListenerException {
		// TODO Auto-generated method stub
		System.out.println("CoreExampleListenner.onAfterCreate()");
	}
}
