package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.NewPayeePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AddNewPayee {
    NewPayeePage np = new NewPayeePage();
    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login();
        np.navigateTo("Pay Bills");
        np.addNewPayee.click();
    }

    @Given("creates	new	payee	using following	information")
    public void creates_new_payee_using_following_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        BrowserUtils.waitFor(1);
        Map<String, String> maps = dataTable.asMap(String.class,String.class);
        np.newPayeeName.sendKeys(maps.get("Payee Name"));
        np.payeeAdress.sendKeys(maps.get("Payee Address"));
        np.payeeAccount.sendKeys(maps.get("Account"));
        np.payeeDetails.sendKeys(maps.get("Payee Details"));
        np.addButton.click();
        //System.exit(1);
    }
    @Then("message {string} should	be	displayed")
    public void messageShouldBeDisplayed(String expectedMessage) {
        String actualMessage=np.alertContent.getText();
        Assert.assertEquals("alert message are not shame",expectedMessage,actualMessage);
    }
}
