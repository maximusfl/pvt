package by.pvt.pojo;

import javax.persistence.*;

@Entity
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleName rolename;

    public AppRole() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getRolename() {
        return rolename;
    }

    public void setRolename(RoleName rolename) {
        this.rolename = rolename;
    }
}
