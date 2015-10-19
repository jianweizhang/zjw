import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
class UserController {

    @Autowired
    UserRepository repository

    @RequestMapping(method=[RequestMethod.GET])
    def get(Long id) {
        id ? repository.findOne(id) : repository.findAll()
    }

    @RequestMapping("/save")
    def save(Long id) {
        repository.save(new User(firstName: "zjw"))
    }

    public static void main(String[] args) {
        SpringApplication.run UserController, args
    }
}