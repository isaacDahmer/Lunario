package br.com.lunario.service;

import br.com.lunario.model.User;
import br.com.lunario.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;
import java.util.Optional;

@Service
public class LoginService {

    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String email, String password) {
        Optional<User> userOpt = userRepository.findByEmail(email);

        if (userOpt.isPresent()) {
            String dbHash = userOpt.get().getPassword();

            if (BCrypt.checkpw(password, dbHash)) {
                return true;
            }
        }
        return false;
    }
}
