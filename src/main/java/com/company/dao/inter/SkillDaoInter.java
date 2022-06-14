
package com.company.dao.inter;

import com.company.entity.Skill;

import java.util.List;


public interface SkillDaoInter {

    List<Skill> getAll();

   Skill getById(int id);

    boolean updateSkill(Skill u);

    boolean removeSkill(int id);

    List<Skill> getByName(String name);

     boolean insertSkill(Skill skl);
}