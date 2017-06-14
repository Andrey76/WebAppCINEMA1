package dto;

/**
 * Created by andr_ on 18.05.2017.
 */
public class RoleDTO {
    private String name;

    public RoleDTO() {
    }

    public RoleDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
