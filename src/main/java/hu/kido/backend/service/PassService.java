package hu.kido.backend.service;
import hu.kido.backend.dto.CreatePassRequest;
import hu.kido.backend.dto.UpdatePassRequest;
import hu.kido.backend.entity.Pass;
import hu.kido.backend.repository.PassRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PassService {

    private final PassRepository repository;
    private final EventService eventService;

    public PassService(PassRepository repository, EventService eventService){
        this.repository = repository;
        this.eventService = eventService;
    }

    public Pass createPass(CreatePassRequest request){
        Pass newPass = new Pass();
        newPass.setName(request.getName());
        newPass.setPrice(request.getPrice());
        newPass.setEvent(eventService.findEvent(request.getEventId()));

        return repository.save(newPass);
    }

    public Pass findPass(Long id){
        Pass pass = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pass not found!"));
        return pass;
    }

    public List<Pass> findAllPass(){
        return repository.findAll();
    }

    public void deletePass(Long id){
        repository.deleteById(id);
    }

    public Pass updatePass(Long passId, UpdatePassRequest request){
        Pass editPass = findPass(passId);
        editPass.setName(request.getName());
        editPass.setPrice(request.getPrice());
        editPass.setActive(request.getActive());
        editPass.setEvent(eventService.findEvent(request.getEventId()));
        return repository.save(editPass);

    }
}
