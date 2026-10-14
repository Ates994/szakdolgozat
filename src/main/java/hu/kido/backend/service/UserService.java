package hu.kido.backend.service;

import hu.kido.backend.dto.CreateUserRequest;
import hu.kido.backend.dto.UpdateUserRequest;
import hu.kido.backend.entity.User;
import hu.kido.backend.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User createUser(CreateUserRequest request) {
        User newUser = new User();
        newUser.setForeName(request.getForeName());
        newUser.setSurName(request.getSurName());
        newUser.setEmail(request.getEmail().trim().toLowerCase());
        if (request.getUserRole() != null) {
            newUser.setUserRole(request.getUserRole());
        }
        return repository.save(newUser);
    }

    public User findUser (Long id){
        User user = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found!"));
        return user;
    }

    public List<User> findAllUsers(){
        return repository.findAll();
    }


    public void deleteUser(Long id){
        findUser(id);
        repository.deleteById(id);
    }

    public User updateUser(Long id, UpdateUserRequest request) {
        User editUser = findUser(id);

        if (request.getUserRole() != null){
            editUser.setUserRole(request.getUserRole());
        }

        editUser.setForeName(request.getForeName());
        editUser.setSurName(request.getSurName());

        if (request.getEmail() != null){
            editUser.setEmail(request.getEmail().trim().toLowerCase());
        }

        editUser.setBirthDate(request.getBirthDate());
        editUser.setZipCode(request.getZipCode());
        editUser.setCity(request.getCity());
        editUser.setAddress(request.getAddress());
        editUser.setPhoneNumber(request.getPhoneNumber());

        if (request.getUserBeltRank() != null){
            editUser.setUserBeltRank(request.getUserBeltRank());
        }

        return repository.save(editUser);
    }

}
