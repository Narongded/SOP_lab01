package maven.shoes.lab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ShowShoes {
	private addidass addi = new addidass("addidass",500);
	private Nike nike = new Nike("Nike",1000);
	private vans vans = new vans("vans",2000);
@RequestMapping("index/addi")
private String addidass() {
	return "Your Band "+" "+addi.getBand()+"\n"+"Price"+addi.getPrice();
	}

@RequestMapping("index/nike")
private String nike() {
	return "Your Band "+" "+nike.getBand()+"\n"+"Price"+addi.getPrice();
	}
@RequestMapping("index/vans")
private String vans() {
	return "Your Band "+" "+vans.getBand()+"\n"+"Price"+addi.getPrice();
	}
}
