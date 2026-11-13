package hu.kido.backend.controller;

import hu.kido.backend.dto.CreatePassRequest;
import hu.kido.backend.dto.UpdatePassRequest;
import hu.kido.backend.entity.Pass;
import hu.kido.backend.service.PassService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passes")
public class PassController {

    private final PassService passService;

    public PassController(PassService passService){
        this.passService = passService;
    }

    @PostMapping
    public Pass createPass(@RequestBody CreatePassRequest request) {
        return passService.createPass(request);
    }

    @DeleteMapping("/{id}")
    public void deletePass(@PathVariable Long id){
        passService.deletePass(id);
    }

    @PutMapping("/{id}")
    public Pass updatePass(@PathVariable Long id, @RequestBody UpdatePassRequest request) {
        return passService.updatePass(id, request);
    }

    @GetMapping("/{id}")
    public Pass findPass (@PathVariable Long id){
        return passService.findPass(id);
    }

    @GetMapping
    public List<Pass> findAllUsers(){
        return passService.findAllPass();
    }


}
