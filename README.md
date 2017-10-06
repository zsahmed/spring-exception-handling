# spring-exception-handling
The purpose of this project is to show how to create custom exceptions and exception handling in a Spring microservice architecture.

## The Problem
What's the purpose of creating custom exception handling?

With smaller web applications that may only have 1 - 5 stand alone microservices, creating custom exception would probably be overkill.

What if your application has 10, 20, or 50+ microservices? If your backend is throwing **INTERNAL_SERVER_ERROR** for every error that occurs, developers will have
a difficult time of tracking down where the error occurred, especially if it was thrown by a service your developer doesn't have domain knowledge about. This is where custom exceptions
and handling can be helpful.

## Potential Solution
For large domains with numerous services, creating custom exceptions on a microservice basis would be helpful not only for developers tracking down bugs, but would also allow for
front-end clients to handle exceptions more gracefully. Instead of the flow breaking down, showing a general error, or the user having a bad user experience, the client can consume
the custom exception and handle changes to the DOM or flow appropriately based on the error thrown.