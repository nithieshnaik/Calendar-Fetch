# Google Calendar Fetch Application

This is a Spring Boot web application that integrates with Google Calendar to allow users to log in with Google SSO and view their calendar events. The events are displayed in a user-friendly table format, with options to filter by date.

---

## Features

- **Google SSO Authentication**: Secure login using Google OAuth 2.0.
- **Fetch Calendar Events**: Retrieve and display events from the user's Google Calendar.
- **Event Filtering**: Filter events by date for easier navigation.
- **Responsive UI**: Designed for a seamless user experience using Thymeleaf and CSS.

---

## Tech Stack

- **Backend**: Spring Boot, Google Calendar API
- **Frontend**: Thymeleaf, HTML, CSS
- **Dependencies**:
  - Google OAuth 2.0
  - Google Calendar API
  - Spring Boot Web and Security
- **Build Tool**: Maven

---

## Prerequisites

1. **Google Cloud Platform Setup**:
   - Create a project in the [Google Cloud Console](https://console.cloud.google.com/).
   - Enable the Google Calendar API.
   - Set up OAuth 2.0 credentials for a web application.
   - Add `http://localhost:8081` as an authorized redirect URI.

2. **Install Java and Maven**:
   - Java 17 or later.
   - Maven 3.8+.

3. **Clone the Repository**:
   ```bash
   git clone https://github.com/nithieshnaik/Calendar-Fetch.git
   cd Calendar-Fetch
