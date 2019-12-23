import java.util.HashMap;
import java.util.Map;

public class QuoteService {
	
	Map<String,String> productInfo = new HashMap<>();
	
	public QuoteService() {
		productInfo.put("a", "100");
		productInfo.put("b", "200");
	}

	public String getQuote(String product) {
		return productInfo.get(product);
	}

}
