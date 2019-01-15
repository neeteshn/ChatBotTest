1. you can use below command to run all test cases. we are runing all test cases for dev environment.

mvn clean test -Dspring.profiles.active=dev

urls for endpoints for each environmemt are configured in properties.yml. At run time which environment you suppose to use, use can use
-Dspring.profiles.active=Environment command and Environment in thi command you can replace with you want to use.
