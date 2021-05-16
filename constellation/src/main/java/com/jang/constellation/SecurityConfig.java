package com.jang.constellation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.jang.constellation.login.UserService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EnableWebSecurity // 1
@Configuration 
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	private final UserService userService;

	@Override
	public void configure(WebSecurity web) throws Exception{
		//인증을 무시하기 위한 설정
		web.ignoring().antMatchers("/css/**","/js/**","/img/**","/lib/**");
	}
	 @Override
	  protected void configure(HttpSecurity http) throws Exception { 
	    http
	          .authorizeRequests() 
	            .antMatchers("/login", "/signup", "/user").permitAll() // 누구나 접근 허용
	            .antMatchers("/").hasRole("USER") // USER, ADMIN만 접근 가능
	            .antMatchers("/admin").hasRole("ADMIN") // ADMIN만 접근 가능
	            .anyRequest().authenticated() // 나머지 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
	        .and() 
	          .formLogin() // 7
	            .loginPage("/login") // 로그인 페이지 링크
	            .defaultSuccessUrl("/main") // 로그인 성공 후 리다이렉트 주소
	        .and()
	          .logout() // 8
	            .logoutSuccessUrl("/login") // 로그아웃 성공시 리다이렉트 주소
		    .invalidateHttpSession(true) // 세션 날리기
	    ;
	  }
	  @Override
	  public void configure(AuthenticationManagerBuilder auth) throws Exception { // 9
	    auth.userDetailsService(userService)
	    	// 해당 서비스(userService)에서는 UserDetailsService를 implements해서 
	        // loadUserByUsername() 구현해야함 (서비스 참고)
	    	.passwordEncoder(new BCryptPasswordEncoder()); 
	   }
	  
}