package com.example.calendarapp.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.Events;

@Service
public class GoogleCalendarService {

    @Autowired
    private HttpTransport httpTransport;

    @Autowired
    private JsonFactory jsonFactory;

    @Autowired
    private Credential googleCredentials;

    /**
     * Fetches Google Calendar events for the logged-in user.
     *
     * @return List of events.
     * @throws IOException if there is an error communicating with the API.
     */
    public List<Event> getCalendarEvents() throws IOException {
        // Initialize the Calendar service
        Calendar calendarService = new Calendar.Builder(httpTransport, jsonFactory, googleCredentials)
                .setApplicationName("Google Calendar Integration")
                .build();

        // Fetch events from the user's primary calendar
        Events events = calendarService.events()
                .list("primary") // Primary calendar of the user
                .setOrderBy("startTime") // Order by start time
                .setSingleEvents(true) // Expand recurring events
                .execute();

        // Return the list of events
        return events.getItems();
    }
}
