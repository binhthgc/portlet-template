package hook.override;

import core.service.CoreExampleLocalServiceWrapper;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author binhth
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class CoreExampleLocalServiceOverride extends CoreExampleLocalServiceWrapper {

	public CoreExampleLocalServiceOverride() {
		super(null);
	}

	@Override
	public void callMethodCore() {
		System.out.println("callMethodCore() change from serviceWrapper");
		super.callMethodCore();
	}
	
}