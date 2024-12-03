package com.example.demo.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;


@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    final private JwtService jwtService;

    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain

    ) throws ServletException, IOException {
    final String authHeader = request.getHeader("Authorization");
    final String jwt ;

    final String userEmail; // we choose email for username but it just a variable . it doest need changes

    // Checking Header
    if (authHeader==null || !authHeader.startsWith("Bearer ")){
    filterChain.doFilter(request,response);
    return;
    }

    jwt=authHeader.substring(7); // Start Reading after 7 character ( Refer ti Bearer )

    userEmail= jwtService.extractUserName(jwt); // to Extract


    }
}
