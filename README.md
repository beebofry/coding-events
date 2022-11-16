Coding Events Application Purpose:
The purpose of this app is to allow users to easily stay up to date on upcoming coding events! 
Users will have the ability to both view and create events, and they will soon be able to create accounts to save any events they are interested in.

Current State of the Application:
Users are currently able to view, create, and delete coding events. 
Events are related to categories such as conferences, networking, meetups etc.
Users are able to filter their views by specific categories and have the option to create new categories to create different events.

Future Improvements:
In order to create accounts, a Person class will be added to represent individual users.
An instance of Person will include a unique user ID, name, email, and username, each with getters and setters, except id which will only have a getter.
A PersonRepositiry will also be added in order to store each user account into a persistent database.
A List<Event> called eventsAttending will store saved events the user would like to attend (many-to-many relationship).
A List<Event> called eventsOwned will store events the user has created (one-to-many relationship).
