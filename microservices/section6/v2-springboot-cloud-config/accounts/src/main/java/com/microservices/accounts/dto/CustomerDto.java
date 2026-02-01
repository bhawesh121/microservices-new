package com.microservices.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @NotEmpty(message = "name cannot be empty")
    @Size(min = 3,max = 50, message = "name should be of 3 to 50 words")
    @Schema(
            description = "Name of the customer",example = "Bhawesh"
    )
    private String name;

    @Schema(
            description = "Email of the customer", example = "bhawesh@gmail.com"
    )
    @NotEmpty(message = "email cannot be empty")
    @Email(message = "Enter valid email")
    private String email;

    @Schema(
            description = "Mobile number of the customer",example = "9878765459"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number should be of 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Accounts details of the customer"
    )
    private AccountsDto accountsDto;
}
