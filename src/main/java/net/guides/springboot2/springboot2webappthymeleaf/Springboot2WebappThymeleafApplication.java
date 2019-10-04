package net.guides.springboot2.springboot2webappthymeleaf;

import net.guides.springboot2.springboot2webappthymeleaf.domain.User;
import net.guides.springboot2.springboot2webappthymeleaf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot2WebappThymeleafApplication {

    public static void main(String[] args) {
		SpringApplication.run(Springboot2WebappThymeleafApplication.class, args);

	}
        private UserRepository userRepository;


        @Autowired
        public void setUserRepository (UserRepository userRepository){
            this.userRepository = userRepository;
        }

        @Override
        public void run (String...strings) throws Exception {

            User user1 = new User();
			user1.setName("Milky Bar");
			user1.setAddress("Milky Bar with chocolate and hazelnut");


			userRepository.save(user1);

            Product product2 = new Product();
            product2.setName("Almond Bar");
            product2.setDescription("Almond Bar with chocolate and honey");
            product2.setType("CANDIES");
            product2.setCategory("BARS");
            product2.setPrice(2.99);

            productRepository.save(product2);
        }
    }

}
}
