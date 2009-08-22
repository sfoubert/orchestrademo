package fr.ippon.orchestrademo.dao;

import java.util.List;

public interface UserDao
{

  void save(User user);
  void remove(User user);
  void update(User user);
  List<User> queryAll();
  User findById(Long id);
}