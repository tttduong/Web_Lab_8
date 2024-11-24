package com.wadlab.academy_bank.dto;

// import java.math.BigDecimal;

public class UserResponse {
    private Long id;
    private String firstName;
    // private String lastName;
    // private String otherName;
    // private String gender;
    // private String address;
    // private String sateOfOrigin;
    // private String accountNumber;
    // private BigDecimal accountBalance;
    // private String email;
    // private String phoneNumber;
    // private String alternativePhoneNumber;
    // private String status;

    // Constructors
    public UserResponse() {}

    // public UserResponse(Long id, String firstName, String lastName, String otherName, String gender,
    // String address, String sateOfOrigin, String accountNumber,BigDecimal accountBalance, 
    // String email,String phoneNumber, String alternativePhoneNumber, String status  ) {
    //     this.id = id;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.otherName = otherName;
    //     this.gender = gender;
    //     this.address = address;
    //     this.sateOfOrigin = sateOfOrigin;
    //     this.accountNumber = accountNumber;
    //     this.accountBalance = accountBalance;
    //     this.email = email;
    //     this.phoneNumber = phoneNumber ;
    //     this.alternativePhoneNumber = alternativePhoneNumber;
    //     this.status = status ;
       
    // }
    public UserResponse(Long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
        
       
    }

    public Long getId() { return id; } 
    public String getFirstName() { return firstName; }

    

    
}
