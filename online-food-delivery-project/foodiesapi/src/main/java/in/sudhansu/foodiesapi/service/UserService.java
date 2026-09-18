package in.sudhansu.foodiesapi.service;

import in.sudhansu.foodiesapi.io.UserRequest;
import in.sudhansu.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}

