package com.kgitbank.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgitbank.rest.model.FruitVO;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/sample")
public class RestSampleController {
   
   @GetMapping(value = "/getstr", produces = "text/plain; charset=UTF-8")
   public String getString() {
      return "안녕하세요 REST컨트롤러 입니다.";
   }
   
   @GetMapping(value = "/getstr2", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
   public String getString2() {
      return "<h3>헬로우 레스트!</h3>";
   }
   
   @GetMapping(value = "/getstr3", produces = MediaType.TEXT_HTML_VALUE)
   public String getString3() {
      return "<h3>Hello Rest!</h3>";
   }
   
   @GetMapping(value = "/getSample", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
   public FruitVO getSampleObject() {
      return new FruitVO();
   }
   
   @GetMapping(value = "/getSampleXML", produces = MediaType.APPLICATION_XML_VALUE)
   public FruitVO getSampleObject2() {
      return new FruitVO();
   }
   
   @GetMapping(value = "/getList", produces = MediaType.APPLICATION_JSON_VALUE)
   public List<FruitVO> getSampleList() {
	   List<FruitVO> list = new ArrayList();
	   
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   
	   return list;
   }
   
   @GetMapping(value = "/getMap", produces = MediaType.APPLICATION_JSON_VALUE)
   public Map<String, FruitVO> getSampleMap() {
	   Map<String, FruitVO> map = new HashMap();
	   
	   map.put("apple1", new FruitVO());
	   map.put("apple2", new FruitVO());
	   map.put("apple3", new FruitVO());
	   
	   return map;
   }
   
   @GetMapping(value = "/getMap2")
   public Map<String, FruitVO> getSampleMap2() {
	   Map<String, FruitVO> map = new HashMap();
	   
	   map.put("apple1", new FruitVO());
	   map.put("apple2", new FruitVO());
	   map.put("apple3", new FruitVO());
	   
	   return map;
   }
   
   @GetMapping(value = "/getRespEntity")
   public ResponseEntity<FruitVO> getRespEntity() {
	   // ResponseEntity는 프로그래머가 직접 Http응답을 자세히 설정할 수 있다.
	   // 응답을 받는 측에서 status 코드를 활용할 수 있다
	   ResponseEntity<FruitVO> result = null;
	   
	   result = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new FruitVO());
	   
	   return result;
   }
   
   // ※ @PathVariable을 받는 매개변수는 참조타입을 사용해야 한다.
   @GetMapping(value = "/path/{year}/{month}", produces = MediaType.TEXT_PLAIN_VALUE)
   public String pathTest(
		   @PathVariable("year") Integer year,
		   @PathVariable("month") Integer month
   ) {
	   return "Hello! you putted " + year + "/" + month + " in your uri path.";
   }
   
   /*
    * @RequestBody
    * - 컨트롤러에서 JSON 데이터를 받아야 할 때 사용하는 어노테이션
    * - 요청의 body에 실려있는 JSON 데이터를 알아서 변환해준다
    * 
    * @PostMapping에 메세지를 보내는 방법
    * - 크롬의 REST Client 확장 프로그램 중 마음에 드는 것을 사용한다  
    * */
   @PostMapping(value = "/fruit", produces = "text/plain; charset=UTF-8")
   public String convertJsonFruit(@RequestBody FruitVO fruit) {
	   return "Your fruit is " + fruit;
   }
   
   @GetMapping(value = "/menus/insert")
   public String insertMenu() {
	   return "<td>" + null + "</td>" + "<td>" + null + "</td>" + "<td>" + null + "</td>";
   }
   
}