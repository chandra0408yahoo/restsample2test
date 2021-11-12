package details;

import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import util.StudentSerenitySteps;

public class StepsForFeatures {


    @Steps
    StudentSerenitySteps step;

    @Given("^retreive all data about students$")
    public void retreive_all_data_about_students()  {

        step.getallusers();
        step.printdata();
        step.verifyThatResponseWasOk();

    }

    @Given("^i try to post data$")
    public void iTryToPostData() {

        step.postdata();
        step.verifyThatResponseWasCreated();
    }

}
