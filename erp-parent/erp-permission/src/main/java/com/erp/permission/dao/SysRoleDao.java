/*
 * Copyright 2020-2021 redragon.dongbin
 *
 * This file is part of redragon-erp/赤龙ERP.

 * redragon-erp/赤龙ERP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.

 * redragon-erp/赤龙ERP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with redragon-erp/赤龙ERP.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.erp.permission.dao;

import com.framework.api.DaoCRUDIF;

import java.util.List;

import com.erp.permission.dao.model.SysRole;
import com.erp.permission.dao.model.SysRoleCO;
import com.erp.permission.dao.model.SysUserRoleR;

public interface SysRoleDao extends DaoCRUDIF<SysRole, SysRoleCO>{
    
    //获取角色列表（根据数据状态）
    public abstract List<SysRole> getSysRoleListByStatus(String status);
    
    //获取用户关联的角色列表
    public abstract List<SysRole> getRelateSysRoleListByUsername(String username);
    
    //角色是否存在关联数据
    public abstract boolean isExistRelateDataForSysRole(String roleCode);
    
}