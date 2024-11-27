package com.lhj.bbs.domain.user.dao;

import com.lhj.bbs.domain.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO{

  private final NamedParameterJdbcTemplate template;

  @Override
  public Long signUp(User user) {
    StringBuffer sql = new StringBuffer();
    sql.append("insert into users( user_id, email, passwd, nickname ) ");
    sql.append("values( user_id_seq.nextval, :email, :passwd, :nickname ) ");

    SqlParameterSource sqlParam = new BeanPropertySqlParameterSource(user);

    KeyHolder keyHolder = new GeneratedKeyHolder();
    template.update(sql.toString(), sqlParam, keyHolder, new String[]{"user_id"});

    Number uidNumber = (Number) keyHolder.getKeys().get("user_id");
    long uid = uidNumber.longValue();

    return uid;
  }

  @Override
  public boolean isCorrect(String email) {
    StringBuffer sql = new StringBuffer();
    sql.append("select count(*) ");
    sql.append("from users ");
    sql.append("where email = :email ");

    Map<String, String> mapEmail = Map.of("email", email);

    Integer cntRec = template.queryForObject(sql.toString(), mapEmail, Integer.class);

    return (cntRec == 1)? true : false;
  }

  @Override
  public Optional<User> findByUserId(Long userId) {
    StringBuffer sql = new StringBuffer();
    sql.append("select user_id, email, passwd, nickname ");
    sql.append("from users ");
    sql.append("where user_id = :userId ");

    Map<String, Long> mapParam = Map.of("userId", userId);
    try {
        User user = template.queryForObject(
            sql.toString(), mapParam, BeanPropertyRowMapper.newInstance(User.class));

        return Optional.of(user);
    } catch (EmptyResultDataAccessException e) {
        return Optional.empty();
    }
  }

  @Override
  public Optional<User> findByEmail(String email) {
    StringBuffer sql = new StringBuffer();
    sql.append("select user_id, email, passwd, nickname ");
    sql.append("from users ");
    sql.append("where email = :email ");

    Map<String, String> mapParam = Map.of("email", email);
    try {
      User user = template.queryForObject(
          sql.toString(), mapParam, BeanPropertyRowMapper.newInstance(User.class));

      return Optional.of(user);
    } catch (EmptyResultDataAccessException e) {
      return Optional.empty();
    }
  }

}
