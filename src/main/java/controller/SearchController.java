package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.SearchService;

@Controller
public class SearchController {
    @Autowired
    SearchService searchService;

    @RequestMapping(value ="/binary", method = RequestMethod.GET)
    public ResponseEntity binarySearch(){
        searchService.binarySearch(1000000);
        return new ResponseEntity("binary search", HttpStatus.OK);
    }
    @RequestMapping(value ="/linear", method = RequestMethod.GET)
    public ResponseEntity linerSearch(){
        searchService.binarySearch(1000000);
        return new ResponseEntity("linearsearch", HttpStatus.OK);
    }
}
