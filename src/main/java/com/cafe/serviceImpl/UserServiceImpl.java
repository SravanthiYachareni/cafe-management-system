package com.cafe.serviceImpl;

import com.cafe.constants.CafeConstants;
import com.cafe.service.UserService;
import com.cafe.util.CafeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("inside signup {}",requestMap);
        if(validateSignUpMap(requestMap)){

        } else {
           return CafeUtil.getResponse(CafeConstants.INVALID_DATA, HttpStatus.BAD_REQUEST);
        }

        return null;
    }
    private boolean validateSignUpMap(Map<String,String> requestMap){
      if(requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
                && requestMap.containsKey("email") && requestMap.containsKey("password")) {
          return  true;
      }
      return false;
    }

}
