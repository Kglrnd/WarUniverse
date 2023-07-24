package de.kugidev.games.wu.service;

import de.kugidev.games.wu.model.User;
import de.kugidev.games.wu.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public void registerUser(String username, String password) {
        // Prüfen, ob der Benutzername bereits verwendet wird
        if (userRepository.findByUsername(username) != null) {
            throw new IllegalArgumentException("Benutzername wird bereits verwendet.");
        }

        // Passwort verschlüsseln
        String encryptedPassword = passwordEncoder.encode(password);

        // Neuen Benutzer erstellen und in die Datenbank speichern
        User user = new User(username, encryptedPassword);
        userRepository.save(user);
    }
}
