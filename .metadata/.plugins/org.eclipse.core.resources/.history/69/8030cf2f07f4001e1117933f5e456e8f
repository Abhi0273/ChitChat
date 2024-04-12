package com.coachify.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@ToString
public class JwtResponse {

	private String jwtToken;
	private String username;
	
	
	public JwtResponse(String jwtToken2, String username2) {
		
		this.jwtToken=jwtToken2;
		this.username=username2;
		// TODO Auto-generated constructor stub
	}

	public static JwtResponseBuilder builder() {
        return new JwtResponseBuilder();
    }
	
	public static class JwtResponseBuilder {
        private String jwtToken;
        private String username;

        JwtResponseBuilder() {
        }

        public JwtResponseBuilder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public JwtResponseBuilder username(String username) {
            this.username = username;
            return this;
        }

        public JwtResponse build() {
            return new JwtResponse(jwtToken, username);
        }
    }

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public JwtResponse() {
		super();
	}
	
	
}
