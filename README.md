# speak-chuck-norris-jokes

# Instructions:
1. Open your IntelliJ IDEA.
2. Create a new project by pasting the link to the remote repository and then fetch the program using the git->pull method from the local repository.

# Description:
This application utilizes an external API using the HTTP protocol and the OkHttp library to handle it.
The first API returns only text, while the second API converts text into speech in any language.
The converted text is then played using Java Sound.

# Technologies/Libraries used:
- JSON to Java class conversion (POJO)
- Implementation of the Chuck Norris Random Jokes API
- Generating Java classes from JSON for an external API
- JSON content parsing library - Jackson
- Class for handling response content from an external API
- Service class for communicating with the external API
- Handling HTTP GET requests using the OkHttp library
- Unit testing for the Service class's run() method using the JUnit library
- Logger for the Service class to log method actions
- Converting JSON/String content to a Java class object - Gson library
- Unit testing for the Service class's convert() method using the JUnit library
