
Step 1 :Install Dependencies:
- Spring Security
- Spring Data JPA
- Lombok
- MySQL Driver  // Any Database Dependencies


Step 2 Set Up your Application.properties to connect Your Database:
- Add Application.properties in your ptoject and change Database,username and password.

Step 3 : Create User model in model Package **
- Add User model class and impliment UserDetails interface in Spring Security


Step 4 : Add UserRepository Interface in repository Package **
- Create package call repository and defined what username should be (define findBy(properties in model you defined as getUsername))
- defiend Query for username (We set for email)

Step 5 : Create files in config Package
create config package and add this java class:
- JwtAuthenticationFilter
- Add jjwt dependencies (jjwt api , jjwt imp , jjwt jackson) and reload maven
- Add JwtService
- Add ApplicationConfig and if have another repo change it **
- Add SecurityConfiguration 


