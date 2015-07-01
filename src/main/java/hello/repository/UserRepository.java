package hello.repository;

import hello.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * Created by Administrator on 2015/6/30.
 */
@Repository
@Table(name="Users")
public interface UserRepository extends JpaRepository<User,String>{
}
