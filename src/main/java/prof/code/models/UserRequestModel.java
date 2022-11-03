package prof.code.models;

import lombok.Data;

@Data
public class UserRequestModel {
    private String name;
    private String job;

    public UserRequestModel(String name, String job){
        this.name = name;
        this.job = job;
    }
}
