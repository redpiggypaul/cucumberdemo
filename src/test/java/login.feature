Feature: UserService login api
#[1]用户登录成功
    Scenario Outline: The user logins successfully
	Given clear <username> in users collection
	And The user registers with <username> and <password> and <surname> and <givenName> and <emergencyEmail> and <emergencyMobile> successfully
	When The user logins with <username> and <password> successfully

Examples:
| username      |password|surname            |givenName            |emergencyEmail    |emergencyMobile|
|User-login-TC01|password|User-login-Surname1|User-login-givenName1|login1@e-ports.com|18900000001    |
