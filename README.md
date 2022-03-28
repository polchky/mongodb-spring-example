# Example Project for Spring Boot + MongoDB
This project was developed for Elca BrownBag meetings.

## MongoDB setup
To run a MongoDB server:

`docker run -d -p 27017:27017 --name mongodb mongo`

Note that data is lost once the container is removed. For persisting data please add a Docker volume.

## Running the Application
Open the project with IntelliJ and run the `MongodbExampleApplication` target.