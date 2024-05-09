package com.ex.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // 이 클래스가 REST 요청 핸들러라는걸 명시함.
public class DemoController {

    @Autowired // Repository Interface가 이 변수에 인스턴스를 주입해 줌. 스프링에서 관리해 줌.
    private CustomerRepository customerRepository;

    // POST 요청
    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last) {
        Customer customer = new Customer();
        customer.setFirstName(first);
        customer.setLastName(last);
        customerRepository.save(customer);
        return "Added new customer to repo!";
    }

    // GET 요청
    @GetMapping("/list")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    // GET 요청
    @GetMapping("/find/{id}")
    // PathVariable은 동일한 이름을 갖는 URL 필드를 매개변수에 집어넣어 줌.
    public Customer findCustomerById(@PathVariable Integer id) {
        return customerRepository.findCustomerById(id);
    }
}