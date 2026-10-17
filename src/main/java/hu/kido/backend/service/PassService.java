package hu.kido.backend.service;
import hu.kido.backend.dto.CreatePassRequest;
import hu.kido.backend.entity.Pass;
import hu.kido.backend.repository.PassRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PassService {

    private final PassRepository repository;

    private PassService(PassRepository repository){
        this.repository = repository;
    }

    private Pass createPass(CreatePassRequest request){
        Pass newPass = new Pass();
        newPass.setName(request.getName());
        newPass.setPrice(request.getPrice());
        newPass.setEvent(request.getEvent());

        return repository.save(newPass);
    }

    private Pass findPass(Long id){
        Pass pass = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pass not found!"));
        return pass;
    }

    private List<Pass> findAllPass(){
        return repository.findAll();
    }

    private void deletePass(Long id){
        repository.deleteById(id);
    }

    private Pass updatePass(Long id, ){

    }
}
