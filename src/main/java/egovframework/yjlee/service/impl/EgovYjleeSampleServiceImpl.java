package egovframework.yjlee.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.yjlee.service.EgovYjleeSampleService;

@Service("yjleeSampleService")
public class EgovYjleeSampleServiceImpl extends EgovAbstractServiceImpl implements EgovYjleeSampleService{

	private static final Logger LOGGER = LoggerFactory.getLogger(EgovYjleeSampleServiceImpl.class);
	
	@Resource(name="yjSampleDAO")
	private YjleeSampleDAO yjSampleDAO;
	
	
	@Override
	public List<?> selectList(SampleDefaultVO searchVO) throws Exception {

		return yjSampleDAO.selectSampleList(searchVO);
	}


	@Override
	public int selectTotCnt(SampleDefaultVO searchVO) {

		return yjSampleDAO.selectToCnt(searchVO);
	}

}
