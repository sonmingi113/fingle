package sample.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bxm.container.ApplicationContainer;
import bxm.container.support.ApplicationContainerUtils;
import bxm.dft.common.util.DefaultGuidGenerator;
import kr.fingle.context.FingleSystemHeader;
import kr.fingle.service.endpoint.FingleControllerServiceEndpoint;
import sample.controller.dto.SAMPLE0001InDto;
import sample.controller.dto.SAMPLE0001OutDto;
import sample.controller.dto.SSMP1001A003InDto;
import sample.controller.dto.SSMP1001A003OutDto;

@RestController
@RequestMapping( "/simple")
public class SimpleRestController {

    private Logger logger= LoggerFactory.getLogger( SimpleRestController.class);

    @Autowired
    private ApplicationContext applicationContext;

	private FingleSystemHeader createSystemHeader(String trxCd)
	{
		FingleSystemHeader header= new FingleSystemHeader();
		header.setGuid(DefaultGuidGenerator.generateInitialGuid());
		header.setTrxCd( trxCd);
		header.setSysCd("DFT");
		header.setChlType("A0");
		header.setClientIp( "192.168.0.31");
		header.setTrxBranchNo("0001");
		header.setTrxTerminalNo("0000");
		header.setUserId("88888888");
		header.setApprTrxYn("N");
		header.setScreenId( "9999999999");
		header.setLangCd("ko");
		header.setResCd("0");
		header.setDomainId("DEFAULT");
		
		return header;
	}
	
    @PostMapping("/SSMP1001A003/Map")
    public @ResponseBody Map<String,Object> SSMP1001A003Map(@RequestBody Map<String,Object> svcInput )
    {
        logger.debug( "************************************************************");
        FingleSystemHeader cHeader = createSystemHeader("SSMP1001A003");

        logger.info(  "ZZZZ TRXCD : {}, SystemHeader : {}, svcInput : {}", cHeader.getTrxCd(), cHeader, svcInput);

        Map<String,Object> result = FingleControllerServiceEndpoint.doService(cHeader, svcInput);
        logger.debug( "************************************************************");
        logger.info(  "ZZZZ TRXCD : {}, Result : {}", cHeader.getTrxCd(), result);
        
        return result;
    }

    @PostMapping("/SSMP1001A003/Object")
    public @ResponseBody SSMP1001A003OutDto SSMP1001A003Object(@RequestBody SSMP1001A003InDto svcInput )
    {
        logger.debug( "************************************************************");
        FingleSystemHeader cHeader = createSystemHeader("SSMP1001A003");

        logger.info(  "ZZZZ TRXCD : {}, SystemHeader : {}, svcInput : {}", cHeader.getTrxCd(), cHeader, svcInput);

        SSMP1001A003OutDto result = FingleControllerServiceEndpoint.doService(cHeader, svcInput,  SSMP1001A003OutDto.class);
        logger.info(  "ZZZZ TRXCD : {}, Result : {}", cHeader.getTrxCd(), result);
        logger.debug( "************************************************************");

        return result;
    }
    
    @PostMapping("/SAMPLE0001/Map")
    public @ResponseBody Map<String,Object>SAMPLE0001Map(@RequestBody Map<String,Object> svcInput )
    {
        logger.debug( "************************************************************");
        FingleSystemHeader cHeader = createSystemHeader("SAMPLE0001");

        logger.info(  "ZZZZ TRXCD : {}, SystemHeader : {}, svcInput : {}", cHeader.getTrxCd(), cHeader, svcInput);

        Map<String,Object> result = FingleControllerServiceEndpoint.doService(cHeader, svcInput);
        logger.debug( "************************************************************");
        logger.info(  "ZZZZ TRXCD : {}, Result : {}", cHeader.getTrxCd(), result);
        
        return result;
    }

    @PostMapping("/SAMPLE0001/Object")
    public @ResponseBody SAMPLE0001OutDto SAMPLE0001Object(@RequestBody SAMPLE0001InDto svcInput )
    {
        logger.debug( "************************************************************");
        FingleSystemHeader cHeader = createSystemHeader("SAMPLE0001");

        logger.info(  "ZZZZ TRXCD : {}, SystemHeader : {}, svcInput : {}", cHeader.getTrxCd(), cHeader, svcInput);

        SAMPLE0001OutDto result = FingleControllerServiceEndpoint.doService(cHeader, svcInput,  SAMPLE0001OutDto.class);
        logger.info(  "ZZZZ TRXCD : {}, Result : {}", cHeader.getTrxCd(), result);
        logger.debug( "************************************************************");

        return result;
    }
    
}
