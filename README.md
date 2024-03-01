# Java Socket Communication

This repository contains Java code for implementing various socket communication scenarios, including one-way and two-way communication between clients and servers.

## Overview

The repository includes three Java programs:

1. **One-Way Client-Server Communication**
    - `MyClient1.java`: A client program that sends messages to a server.
    - `MyServer.java`: A server program that receives messages from clients and responds with a fixed greeting concatenated with the received input.

2. **One-Way Dynamic Chat Server**
    - `MyServer1.java`: A server program that enables two users to chat with each other dynamically. Each user connects to the server, sends messages, and receives responses from the other user.

## Instructions

To run the programs:

1. **One-Way Client-Server Communication**
    - Compile the Java files using `javac MyClient1.java MyServer.java`.
    - Start the server by running `java MyServer`.
    - Start the client by running `java MyClient1`.
    - Follow the prompts in the terminal to send messages between the client and server.

2. **One-Way Dynamic Chat Server**
    - Compile the Java file using `javac MyServer1.java`.
    - Start the server by running `java MyServer1`.
    - Two clients can connect to the server to initiate dynamic chat.

## Files

- `MyClient1.java`: Client program for one-way communication.
- `MyServer.java`: Server program for one-way communication.
- `MyServer1.java`: Server program for dynamic two-way chat.

## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgements

- This project was inspired by the need for simple socket communication examples in Java.
- Special thanks to contributors who have helped improve and expand the project.

## Notes

- Make sure the server is running before clients attempt to connect.
- Clients can communicate with each other by sending messages through the server.
- To stop the communication, one of the clients should send "Stop".
