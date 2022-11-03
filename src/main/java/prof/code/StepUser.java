package prof.code;

import prof.code.models.UserRequestModel;

public class StepUser {
    ApiUser apiUser = new ApiUser();

    public void createUser(String name, String job) {
        UserRequestModel model = new UserRequestModel(name, job);
        apiUser.createUser(model);
    }
}
