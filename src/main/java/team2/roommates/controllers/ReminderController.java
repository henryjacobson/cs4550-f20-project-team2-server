package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Reminder;
import team2.roommates.services.ReminderService;

@RestController
@CrossOrigin(origins = "*")
public class ReminderController {
    @Autowired
    ReminderService reminderService;

    @PostMapping("/api/reminders")
    public Reminder createReminder(
            @RequestBody Reminder reminder
    ) {
        return reminderService.createReminder(reminder);
    }

    @PutMapping("/api/reminders")
    public Reminder updateReminder(
            @RequestBody Reminder reminder
    ) {
        return reminderService.updateReminder(reminder);
    }

    @DeleteMapping("/apu/reminders/{reminderId}")
    public void deleteReminder(
            @PathVariable int reminderId
    ) {
        reminderService.deleteReminder(reminderId);
    }
}
