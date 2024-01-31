a service is an application component that can perform long - running operations in the background. 
Services do not provide a user interface 

Another application component can start a service

e.g. a download requires a download service linked to the app that ordered the download. The download doesn't have an interface in the activity or app, only a download bar in the notifications.

- another service is a music player .. since it plays music in the background even if the app is changed to another app(onPause() or onStop()) 

There are three different types of services in android app development: 
- Foreground services : User sees notifications of service in background e.g a download service which downloads a huge file like 1GB 

- Background service : This type doesn't show any notifications or indications , but runs incognito in the background.The User doesn't have an idea this service is ongoing in the background most usually.  e.g a file compression service whenever a file is stored in the hard memory

- Bound services: This service interacts with the component that calls it permanently. In this relationship(similar to the client- server network), the launcher component interacts constantly with the service. When the user closes the component that creates this service, the sertvice also closes. a good example is a music service player, since the music player component interacts periodically with the music playing service, even in the background, unitl the user closes the music player component or app. 

Traditionally there are two service classes: 
- Service classes: Its a feature that uses the main thread of the application to run. It uses the same memeory resources with the main app, so care should be taken for large memory service classes. e.g a download service class causes the app process to slow down also since it uses the memory allocated for the app asa whole.

- the Job intent Service class: this class creates its own thread from the Android OS, so it has its own resources allocated for it and runs it. So it doesn't interrupt the main app thread. 

NB: dont forget to declare the service tag int he android manifest file after creating the services class !!


