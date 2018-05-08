package com.ssm.dao;
import com.ssm.entities.User;
import org.apache.ibatis.annotations.Mapper;

//@Mapper //此处不能加这个注解，不然调用这个接口的方法会报错。
public interface UserDao {
      public User getUsers(long id);
      public void addUser(User user);
      public void updateUser(User user);

}
