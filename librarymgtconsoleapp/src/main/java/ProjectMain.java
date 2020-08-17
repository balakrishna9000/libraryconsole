

import org.springframework.boot.SpringApplication;

/**
 * @SpringBootapplication equivalent to 3 things
 * 1)@Configuration : so we dont have to provide on our own
 * 2)@ComponentScan: so we dont have to provide on our own
 * 3) @AutoConfiguration so we dont have to provide on our own
 */
@SpringLibrarymgtconsoleApplication
public class ProjectMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMain.class, args);

	}


}