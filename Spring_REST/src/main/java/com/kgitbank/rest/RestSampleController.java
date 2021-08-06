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
      return "�ȳ��ϼ��� REST��Ʈ�ѷ� �Դϴ�.";
   }
   
   @GetMapping(value = "/getstr2", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
   public String getString2() {
      return "<h3>��ο� ����Ʈ!</h3>";
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
	   // ResponseEntity�� ���α׷��Ӱ� ���� Http������ �ڼ��� ������ �� �ִ�.
	   // ������ �޴� ������ status �ڵ带 Ȱ���� �� �ִ�
	   ResponseEntity<FruitVO> result = null;
	   
	   result = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new FruitVO());
	   
	   return result;
   }
   
   // �� @PathVariable�� �޴� �Ű������� ����Ÿ���� ����ؾ� �Ѵ�.
   @GetMapping(value = "/path/{year}/{month}", produces = MediaType.TEXT_PLAIN_VALUE)
   public String pathTest(
		   @PathVariable("year") Integer year,
		   @PathVariable("month") Integer month
   ) {
	   return "Hello! you putted " + year + "/" + month + " in your uri path.";
   }
   
   /*
    * @RequestBody
    * - ��Ʈ�ѷ����� JSON �����͸� �޾ƾ� �� �� ����ϴ� ������̼�
    * - ��û�� body�� �Ƿ��ִ� JSON �����͸� �˾Ƽ� ��ȯ���ش�
    * 
    * @PostMapping�� �޼����� ������ ���
    * - ũ���� REST Client Ȯ�� ���α׷� �� ������ ��� ���� ����Ѵ�  
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