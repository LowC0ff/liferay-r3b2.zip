import com.acme.headless.r3b2.client.dto.v1_0.Foo;
import com.acme.headless.r3b2.client.resource.v1_0.FooResource;

public class Test {

	public static void main(String[] args) throws Exception {
		FooResource.Builder builder = FooResource.builder();

		FooResource fooResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		Foo foo = fooResource.getFoo(1L);

		System.out.println(foo);
	}

}