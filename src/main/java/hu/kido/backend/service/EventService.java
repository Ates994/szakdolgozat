package hu.kido.backend.service;

import hu.kido.backend.entity.Event;
import hu.kido.backend.repository.EventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EventService {

    private final EventRepository repository;

    public EventService(EventRepository repository){
        this.repository = repository;
    }

    public Event findEvent(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found!"));


    }

}
