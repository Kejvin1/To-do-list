# Use a Node.js base image
FROM node:14

# Set the working directory inside the container
WORKDIR /usr/src/app

# Copy the current directory contents into the container
COPY . .

# Install a simple HTTP server globally to serve your static files
RUN npm install -g http-server

# Expose the port that the app will run on
EXPOSE 8080

# Command to run the app
CMD ["http-server", ".", "-p", "8080"]
