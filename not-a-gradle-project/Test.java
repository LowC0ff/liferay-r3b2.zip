import com.acme.headless.r3b2.client.dto.v1_0.Foo;
import com.acme.headless.r3b2.client.dto.v1_0.Goo;
import com.acme.headless.r3b2.client.resource.v1_0.FooResource;
import com.acme.headless.r3b2.client.resource.v1_0.GooResource;

public class Test {

    public static void main(String[] args) throws Exception {

        FooResource.Builder builder = FooResource.builder();

        FooResource fooResource = builder.authentication(
        "test@liferay.com", "123").build();

    Foo fooA = fooResource.get6Foo(1L);
    Foo fooB = fooResource.getFoo(2L);
    Foo fooC = fooResource.getFoo(3L);

    System.out.println("Foo endpoints: " + "\n" + fooA + "\n" +
    fooB + "\n" + fooC);

    GooResource.Builder builderGoo = GooResource.builder();

    GooResource GooResource = builderGoo.authentication(
    "test@liferay.com", "123") .build();

    Goo gooA = GooResource.getGoo(1L);
    Goo gooB = GooResource.getGoo(2L);
    Goo gooC = GooResource.getGoo(3L);
    Goo gooD = GooResource.getGoo(4L);
    Goo gooE = GooResource.getGoo(5L);

    System.out.println("Goo endpoints: " + "\n" + gooA + "\n" +
    gooB + "\n" + gooC + "\n" + gooD + "\n" + gooE);

    }
}

