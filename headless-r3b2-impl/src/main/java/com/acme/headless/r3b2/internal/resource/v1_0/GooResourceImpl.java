package com.acme.headless.r3b2.internal.resource.v1_0;

import com.acme.headless.r3b2.resource.v1_0.GooResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Jonah the son of Amittai
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/goo.properties",
	scope = ServiceScope.PROTOTYPE, service = GooResource.class
)
public class GooResourceImpl extends BaseGooResourceImpl {
}