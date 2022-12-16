package com.educator.eduo.attendence.model.service;

import java.util.List;

import org.apache.ibatis.javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educator.eduo.attendence.model.dto.AttendanceResultDto;
import com.educator.eduo.attendence.model.mapper.AttendanceMapper;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	Logger logger = LoggerFactory.getLogger(AttendanceServiceImpl.class);
	
	private final AttendanceMapper attendanceMapper;
	
	@Autowired
	public AttendanceServiceImpl(AttendanceMapper attendanceMapper) {
		this.attendanceMapper = attendanceMapper;
	}
	@Override
	public List<AttendanceResultDto> selectAttendanceList(String lectureId) throws NotFoundException {
		List<AttendanceResultDto> attendanceResultList = attendanceMapper.selectAttendanceList(lectureId);
		if(attendanceResultList.isEmpty()) throw new NotFoundException("해당 내용이 존재하지 않습니다.");
		return attendanceResultList;
	}

}