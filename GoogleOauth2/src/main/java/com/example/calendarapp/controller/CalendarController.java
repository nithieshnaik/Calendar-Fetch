package com.example.calendarapp.controller;

import com.example.calendarapp.service.GoogleCalendarService;
import com.google.api.services.calendar.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.IOException;
import java.util.List;

@Controller
public class CalendarController {

    @Autowired
    private GoogleCalendarService googleCalendarService;

    /**
     * Display Google Calendar events.
     *
     * @param model Thymeleaf model to pass data to the view.
     * @return View name.
     */
    @GetMapping("/events")
    public String showEvents(Model model) throws IOException {
        List<Event> events = googleCalendarService.getCalendarEvents();
        model.addAttribute("events", events);
        return "events"; // Thymeleaf template to display events
    }
}
