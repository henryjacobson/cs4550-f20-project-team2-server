package team2.roommates.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team2.roommates.models.Admin;
import team2.roommates.services.AdminService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/api/admins")
    public Admin createAdmin(
            @RequestBody Admin admin
    ) {
        return adminService.createAdmin(admin);
    }

    @PutMapping("/api/admins")
    public Admin updateAdmin(
            @RequestBody Admin admin
    ) {
        return adminService.updateAdmin(admin);
    }

    @DeleteMapping("/api/admins/{adminId}")
    public void deleteAdmin(
            @PathVariable int adminId
    ) {
        adminService.deleteAdmin(adminId);
    }
}
