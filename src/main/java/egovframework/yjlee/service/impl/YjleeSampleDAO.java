package egovframework.yjlee.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("yjSampleDAO")
public class YjleeSampleDAO extends EgovAbstractDAO{

	/**
	 * 글 목록을 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 글 목록
	 * @exception Exception
	 */
	public List<?> selectSampleList(SampleDefaultVO searchVO) throws Exception {
		return list("yjleeSampleDAO.selectSampleList", searchVO);
	}

	public int selectToCnt(SampleDefaultVO searchVO) {
		
		return (Integer) select("yjleeSampleDAO.selectTotCnt", searchVO);
	}
}
