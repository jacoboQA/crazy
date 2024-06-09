package pages;

import java.util.List;

public class checkoutPage extends BasePage{

    private String planDropdown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    public checkoutPage(){
        super(driver);
    }

    public List<String> returnPlanDropdowValues() {
        return getDropDownValues(planDropdown);
    }
}
