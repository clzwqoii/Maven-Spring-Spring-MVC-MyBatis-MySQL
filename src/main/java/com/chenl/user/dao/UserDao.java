package com.chenl.user.dao;  
import java.util.List;  
  
import org.springframework.stereotype.Repository;  
import com.chenl.user.entity.User; 
@Repository  
public interface UserDao<User>{  
    List<User> selectId(String username);  
}    