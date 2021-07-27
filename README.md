# RestAPI Actions with Spring Framework

This project can apply CRUD with RESTful API with MySQL Database. Used @ControllerAdvice for requests custom Exception Handling, Validation etc. and prepared Swagger UI for API test documentation.

# Controller

Here is the some request examples in this project. @ApiOperation annotation for customize SwaggerUI. You can see some validations and throwing my custom exception.

![image](https://user-images.githubusercontent.com/38990648/127202829-f6e90afe-6d27-4748-9ade-b03f1afe0301.png)

# Swagger Configuration 

This is how i configure my SwaggerUI. That Docket bean is main configuration bean for request handling and @EnableSwagger2 is enabling SwaggerAPI.

![image](https://user-images.githubusercontent.com/38990648/127203539-546131d5-7a68-461b-879c-79e29c5cd47e.png)

And here is the customized part of SwaggerUI

![image](https://user-images.githubusercontent.com/38990648/127229897-d7d95bda-eadb-4164-8d28-5417403f80b7.png)

# Exception Handling with @ControllerAdvice 

This is my custom exception.

![image](https://user-images.githubusercontent.com/38990648/127230226-30a96e92-acf1-46cf-a01f-7031fd75a2fe.png)

And here is the @ControllerAdvice part. @ControllerAdvice can global handling. handleCustomException method is returning responseError(Not Found Error).

![image](https://user-images.githubusercontent.com/38990648/127230756-f5500536-0ac0-40fa-b759-533bc7b23aff.png)

