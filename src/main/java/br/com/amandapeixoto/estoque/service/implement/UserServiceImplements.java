package br.com.amandapeixoto.estoque.service.implement;

import br.com.amandapeixoto.estoque.domain.Users;
import br.com.amandapeixoto.estoque.repository.UsersRepository;
import br.com.amandapeixoto.estoque.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplements implements UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users create(Users users) {
        return usersRepository.save(users);
    }
}
