package com.example.stepDef;

import com.example.actions.UIAutomationActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIAutomationSteps {

    UIAutomationActions actions = new UIAutomationActions();

    @Given("Open UpSkill Automation Practice page")
    public void open_up_skill_automation_practice_page() {
        actions.loadUpSkillPracticePage();
    }

    @When("Switch to Practice iFrame")
    public void switch_to_practice_i_frame() {
        actions.switchIframe();
    }

    @Then("User should able to write on Textbox")
    public void user_should_able_to_write_on_textbox() {
        actions.textBox("Tesla");
    }

    @When("Mouse Hover to Hover Over Me")
    public void mouse_hover_to_hover_over_me() {
        actions.mouseHover();
    }

    @Then("Click on Link")
    public void click_on_link() {
        actions.clickLink();
    }

    @When("Select Option from dropdown")
    public void select_option_from_dropdown() {
        actions.selectDropDown("Option 2");
    }

    @Then("Verify Option selected")
    public void verify_option_selected() {
        actions.verifyDropDown("Option 2");
    }

    @When("Click on Alert")
    public void click_on_alert() {
        actions.clickAlert();
    }

    @Then("Click on OK")
    public void click_on_ok() {
        actions.clickOK();
    }

    @Then("Click on Radio 2")
    public void click_on_radio_2() {
        actions.clickRadioBtn();
    }

    @Then("Click on Checkbox {int}")
    public void click_on_checkbox(Integer int1) {
        actions.clickCheckbox();
    }

    @When("Click on Open Window")
    public void click_on_open_window() {
        actions.clickOpenWindow();
    }

    @Then("Switch to new Window")
    public void switch_to_new_window() {
        actions.switchNewWindow();
        actions.clickCourses();
    }

    @When("Click on Confirm")
    public void click_on_confirm() {
        actions.clickConfirm();
    }

    @Then("Verify Great")
    public void verify_great() {
        actions.verifyAlertText("Great!");
    }

    @Then("Click on cancel")
    public void click_on_cancel() {
        actions.cancelAlert();
    }

    @When("Switch to iFrame Courses")
    public void switch_to_i_frame_courses() {
        actions.switchIframeHome();
    }

    @Then("Click on Courses")
    public void click_on_courses() {
        actions.clickCourses();
    }
}
