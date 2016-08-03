package web.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id") 
    private Long id;
 
    @Column(name = "name") 
    private String name;
 
    @Column(name = "age") 
    private Long age;
 
    public User() {
    }
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }
}
