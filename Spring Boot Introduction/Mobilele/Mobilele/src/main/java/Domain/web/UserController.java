package web;

import Domain.dtos.banding.UserRegisterFormDto;
import Domain.dtos.veiw.UserRoleViewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import services.role.UserRoleService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController{

        private final UserRoleService roleService;

        @Autowired
        public UserController(UserRoleService roleService) {
            this.roleService = roleService;
        }

        @GetMapping("/register") // post method localhost:8080/users/register
        public ModelAndView getRegister(ModelAndView modelAndView) {
            List<UserRoleViewDto> roleServiceAll = this.roleService.getAll();

            modelAndView.addObject("roles", roleServiceAll);
            modelAndView.addObject("userRegister", new UserRegisterFormDto());

            return super.view("auth-register", modelAndView);
        }

        @PostMapping("/register")
        public ModelAndView postRegister(@ModelAttribute UserRegisterFormDto userRegister) {
            return super.redirect("auth-login");
        }
}
