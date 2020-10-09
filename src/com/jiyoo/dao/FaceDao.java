package com.jiyoo.dao;

import java.util.List;

import com.jiyoo.vo.JibenVo;

public interface FaceDao {
	public List<JibenVo> faced(String bianhao,String name,String phone,String ip);
}
