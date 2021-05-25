package com.jang.constellation.login;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jang.constellation.signup.api.SignupRestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {

  private final UserRepository userRepository;
  
  private static final Logger Logger=LoggerFactory.getLogger(SignupRestController.class);

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
	    	.name(infoDto.getName())
	    	.email(infoDto.getEmail())
	    	.auth(infoDto.getAuth())
	    	.id(infoDto.getId())
	        .password(infoDto.getPassword()).build()).getCode();
	  }
  public void selectUserInfo(String id) {
	  Optional<UserInfo> user=userRepository.findById(id);
	  user.ifPresent(selectUser ->{
		  System.out.print("user: "+selectUser);
	  });
	  
  }
	@Override
	public UserInfo loadUserByUsername(String id) throws UsernameNotFoundException {
		// 시큐리티에서 지정한 서비스이기 때문에 이 메소드를 필수로 구현
		
	    return userRepository.findById(id)
	        .orElseThrow(() -> new UsernameNotFoundException((id)));
	}	
}
