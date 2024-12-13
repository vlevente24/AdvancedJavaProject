package ppke.itk.theatre.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ppke.itk.theatre.domain.User;
import ppke.itk.theatre.repository.UserRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User dbUser = userRepository
                .findByEmailIgnoreCase(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("User with email %s", email)));
        return org.springframework.security.core.userdetails.User.builder()
                .username(email)
                .password(dbUser.getPassword())
                .authorities(dbUser.getPermission())
                .build();

    }
}
