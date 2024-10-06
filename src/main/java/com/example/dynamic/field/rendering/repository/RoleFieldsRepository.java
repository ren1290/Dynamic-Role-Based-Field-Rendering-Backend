package com.example.dynamic.field.rendering.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dynamic.field.rendering.entity.Fields;
import com.example.dynamic.field.rendering.entity.RoleFieldId;
import com.example.dynamic.field.rendering.entity.RoleFields;

@Repository
public interface RoleFieldsRepository extends CrudRepository<RoleFields, RoleFieldId> {

	@Query("SELECT rf.field FROM RoleFields rf WHERE rf.role.roleId = ?1")
    List<Fields> findFieldsByRoleId(int roleId);

}
