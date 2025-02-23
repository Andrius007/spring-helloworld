import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Scope;
import pojo.Cat;

@Configuration
public class AppConfig {

    @Bean(name = "helloWorld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat myCat = new Cat();
        myCat.setName("Barsik");
        return myCat;
    }
}