package com.liferay.r3b2portlet.web.internal.portlet;

import com.acme.headless.r3b2.client.dto.v1_0.Foo;
import com.acme.headless.r3b2.client.dto.v1_0.Goo;
import com.acme.headless.r3b2.client.resource.v1_0.FooResource;
import com.acme.headless.r3b2.client.resource.v1_0.GooResource;

import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.RenderRequest;
import javax.portlet.GenericPortlet;
import javax.portlet.RenderResponse;
import javax.portlet.Portlet;


    @Component(
    property = {
        "com.liferay.portlet.display-category=category.sample",
        "javax.portlet.display-name=R3B2"
    }, service = Portlet.class)

    public class R3B2Portlet extends GenericPortlet{

    @Override
    protected void doView(
        RenderRequest renderRequest, 
        RenderResponse renderResponse)
        throws IOException {
            ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

    FooResource.Builder fooResourceBuilder = _fooResourceFactory.create();

    FooResource.Builder builder = FooResource.builder();
    FooResource fooR = builder.authentication("test@liferay.com", "123").build();

    GooResource.Builder builder = GooResource.builder();
    GooResource gooR = builder.authentication("test@liferay.com", "123").build();

    FooResource fooResource = fooResourcedBuilder.user(themeDisplay.getUser()).build();

    GooResource.Builder gooResourceBuilder = _gooResourceFactory.create();

    GooResource gooResource = gooResourcedBuilder.user(themeDisplay.getUser()).build();


    PrintWriter printWriter = renderResponse.getWriter();

    printWriter.println("Testando");

    try { long siteId = 20121L;

    pFoo.setId(20121L);
    pFoo.setName("Post Foo");
    pFoo.setDescription("test");
    Foo pFoo = fooR.postFoo(pFoo);

    Page<Foo> gtFoo = fooR.getFooPage();

    System.out.println("foo points" + gtFoo);


    putFoo.setName("dale");
    putFoo.setDescription("dole");

    Foo putFo = fooR.putFoo(pFoo.getId(), pFoo);


    fooR.deleteFoo(pFoo.getId());


    long siteId = 2505L;
    pGoo.setName("teste1");
    pGoo.setDescription("teste 1");
    pGoo.setId(2505L);
    Goo pGoo = gooR.postFooGoo(20121L, pGoo);


    Page<Goo> gGoo = gooR.getFooGoosPage(20121L);
    System.out.println(gGoo);


    putGoo.setName("teste 2");
    putGoo.setDescription("teste 2");
    Goo putGoo = gooR.putGoo(2505L, putGoo);


    gooR.deleteGoo(2505L);
    } catch (Exception e) {
    throw new RuntimeException(e);

    }

}

    public R3B2Portlet() {
    System.out.println("foi pra frente");

}

@Reference
private FooResource.Factory _fooResourceFactory;

@Reference
private GooResource.Factory _gooResourceFactory;
}