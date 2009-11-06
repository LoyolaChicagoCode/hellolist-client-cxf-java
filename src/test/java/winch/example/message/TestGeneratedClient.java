package winch.example.message;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestGeneratedClient {

	@Test
	public void testSimple() throws Exception {
		MessageServiceService service = new MessageServiceService();
		MessageService client = service.getMessageServicePort();
		assertEquals("Hello 2", client.getMessage(listAsArrayOfString(Arrays.asList("hello", "world"))));
		assertEquals("Hello 0", client.getMessage(listAsArrayOfString(Arrays.asList(new String[0]))));
		assertEquals("Hello 2", client.getMessage(arrayAsArrayOfString("hello", "world")));
		assertEquals("Hello 0", client.getMessage(arrayAsArrayOfString()));
	}

	public ArrayOfString listAsArrayOfString(final List<String> list) {
		ArrayOfString result = new ArrayOfString();
		result.getString().addAll(list);
		return result;
	}

	public ArrayOfString arrayAsArrayOfString(final String... list) {
		ArrayOfString result = new ArrayOfString();
		result.getString().addAll(Arrays.asList(list));
		return result;
	}
}
