package hooks;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.Before;

public class Hooks {
  @Before()
    public void beforeapi(){
      MedunnaBaseUrl.setUp();
  }
}
