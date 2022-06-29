package Zaidimu_Web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class AppController {
	
	@Autowired
	private ZaidimuLenteleRepository zaidimu_lentele_repository;
 
    @Autowired
    private UserRepository userRepo;
     
    @GetMapping("/")
    public String viewHomePage(Model model) {
    	
    	model.addAttribute("zaidimai", zaidimu_lentele_repository.findAll());
    	
        return "pagrindinis";
    }
    
    @RequestMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
         
        return "signup_form";
    }
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
         
        userRepo.save(user);
         
        return "register_success";
    }
}