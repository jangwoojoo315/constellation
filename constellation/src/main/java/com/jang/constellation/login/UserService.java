package com.jang.constellation.login;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

  private final UserRepository userRepository;
  


  /**
   * Spring Security 필수 메소드 구현
   *
   * @param email 이메일
   * @return UserDetails
   * @throws UsernameNotFoundException 유저가 없을 때 예외 발생
   */
  public Long save(UserInfoDto infoDto) {
	    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    infoDto.setPassword(encoder.encode(infoDto.getPassword()));

	    return userRepository.save(UserInfo.builder()
	        .email(infoDto.getEmail())
	        .auth(infoDto.getAuth())
	        .password(infoDto.getPassword()).build()).getCode();
	  }

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	// TODO Auto-generated method stub
	return null;
}	
}
