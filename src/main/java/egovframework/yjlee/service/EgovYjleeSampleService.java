package egovframework.yjlee.service;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;

public interface EgovYjleeSampleService {

	List<?> selectList(SampleDefaultVO searchVO) throws Exception;

	int selectTotCnt(SampleDefaultVO searchVO);

}
