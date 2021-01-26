package com.example.Seller;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.Seller.Entity.LoginEntity;
import com.example.Seller.Repository.LoginRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class LoginRepoTest {

    @Autowired
    private LoginRepository repo;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        LoginEntity user = new LoginEntity();
        user.setEmail("kongkubpan@gmail.com");
        user.setPassword("asdf5678");
        user.setFirstname("Vatcharapong");
        user.setLastname("kongkubpan");

        LoginEntity savedUser = repo.save(user);
        LoginEntity existUser = entityManager.find(LoginEntity.class,user.getId());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
}
