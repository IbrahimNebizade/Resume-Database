
package com.company.dao.inter;

import com.company.entity.UserSkill;

import java.util.List;

public interface UserSkillDaoInter {
     
     
     List<UserSkill> getAllSkillByUserId(int id);

     boolean insertUserSkill(UserSkill u);
    
     boolean updateUserSkill(UserSkill u);
    
     boolean removeUser(int id);
}