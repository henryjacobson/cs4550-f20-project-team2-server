package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Resident;
import team2.roommates.services.ResidentService;

@RestController
@CrossOrigin(origins = "*")
public class ResidentController {
    @Autowired
    ResidentService residentService;

    @PostMapping("/api/residents")
    public Resident createResident(
            @RequestBody Resident resident
    ) {
        return residentService.createResident(resident);
    }

    @PutMapping("/api/residents")
    public Resident updateResident(
            @RequestBody Resident resident
    ) {
        return residentService.updateResident(resident);
    }

    @DeleteMapping("/apu/residents/{residentId}")
    public void deleteResident(
            @PathVariable int residentId
    ) {
        residentService.deleteResident(residentId);
    }
}
