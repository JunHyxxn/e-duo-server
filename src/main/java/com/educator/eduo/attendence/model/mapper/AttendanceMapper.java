package com.educator.eduo.attendence.model.mapper;

import java.util.List;

import org.apache.ibatis.javassist.NotFoundException;

import com.educator.eduo.attendence.model.dto.AttendanceResultDto;

public interface AttendanceMapper {

	List<AttendanceResultDto> selectAttendanceList(String lectureId) throws NotFoundException;

}