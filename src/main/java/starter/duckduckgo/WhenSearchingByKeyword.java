package starter.duckduckgo;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)              
class WhenSearchingByKeyword {              

  @Managed(driver = "chrome", options = "headless")
    WebDriver driver;
  
    @Test
    void theKeywordShouldAppearInTheResultsSidebar() {

    }
}
