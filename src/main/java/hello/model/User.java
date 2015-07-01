package hello.model;

import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


/**
 * Created by Administrator on 2015/6/30.
 */
@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue
    public String id;
    public String username;
    public String firstname;
    public String lastname;
    public String password;

}
